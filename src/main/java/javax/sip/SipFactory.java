/**
 * Copyright (C) 2015, The Open Telecoms Project, http://opentelecoms.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package javax.sip;

import javax.sip.address.AddressFactory;
import javax.sip.message.MessageFactory;
import javax.sip.header.HeaderFactory;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class SipFactory {

	public final static String IP_ADDRESS = "javax.sip.IP_ADDRESS";
	public final static String STACK_NAME = "javax.sip.STACK_NAME";

	private final static String DEFAULT_PATH_NAME = "gov.nist";

	private String mPathName = DEFAULT_PATH_NAME;
	private Map<String, SipStack> mSipStackByName;
	private MessageFactory mMessageFactory = null;
	private HeaderFactory mHeaderFactory = null;
	private AddressFactory mAddressFactory = null;
	private static SipFactory _instance = null;
	private final List<SipStack> mSipStackList = new LinkedList<SipStack>();

	public synchronized static SipFactory getInstance() {
		if (_instance == null) {
			_instance = new SipFactory();
		}
		return _instance;
	}

	private SipFactory() {
		this.mSipStackByName = new HashMap<String, SipStack>();
	}

	public synchronized SipStack createSipStack(Properties properties)
			throws PeerUnavailableException {

		String address = properties.getProperty(IP_ADDRESS);
		String name = properties.getProperty(STACK_NAME);
		if (name == null) {
			throw new PeerUnavailableException("Missing " + STACK_NAME
					+ " property");
		}
		if (address == null) {
			SipStack mySipStack = mSipStackByName.get(name);
			if (mySipStack == null) {
				mySipStack = createStack(properties);
			}
			return mySipStack;
		} else {
			for (SipStack s : mSipStackList) {
				if (s.getIPAddress().equals(address)) {
					return s;
				}
			}
			return createStack(properties);
		}

	}

	public MessageFactory createMessageFactory()
			throws PeerUnavailableException {
		if (mMessageFactory == null) {
			mMessageFactory = (MessageFactory) createSipFactory("javax.sip.message.MessageFactoryImpl");
		}
		return mMessageFactory;
	}

	public HeaderFactory createHeaderFactory() throws PeerUnavailableException {
		if (mHeaderFactory == null) {
			mHeaderFactory = (HeaderFactory) createSipFactory("javax.sip.header.HeaderFactoryImpl");
		}
		return mHeaderFactory;
	}

	public AddressFactory createAddressFactory()
			throws PeerUnavailableException {
		if (mAddressFactory == null) {
			mAddressFactory = (AddressFactory) createSipFactory("javax.sip.address.AddressFactoryImpl");
		}
		return mAddressFactory;
	}

	public void setPathName(String pathName) {
		this.mPathName = pathName;
	}

	public String getPathName() {
		return mPathName;
	}

	public void resetFactory() {
		mSipStackList.clear();
		mMessageFactory = null;
		mHeaderFactory = null;
		mAddressFactory = null;
		mSipStackByName = new HashMap<String, SipStack>();
		mPathName = DEFAULT_PATH_NAME;
	}
	
	private String makeClassName(String c) {
		return getPathName() + "." + c;
	}

	private Object createSipFactory(String objectClassName)
			throws PeerUnavailableException {

		if (objectClassName == null) {
			throw new NullPointerException();
		}
		String fullName = makeClassName(objectClassName);
		try {
			Class peerObjectClass = Class.forName(fullName);

			Object newPeerObject = peerObjectClass.newInstance();
			return (newPeerObject);
		} catch (Exception e) {
			String errmsg = "The peer factory: "
					+ fullName
					+ " could not be instantiated. Ensure the path name has been set correctly.";
			throw new PeerUnavailableException(errmsg, e);
		}
	}

	private SipStack createStack(Properties properties)
			throws PeerUnavailableException {
		String implName = makeClassName("javax.sip.SipStackImpl");
		try {
			Class[] pTypes = new Class[] { Properties.class };
			Constructor sipStackConstructor = Class.forName(implName)
					.getConstructor(pTypes);
			Object[] cArgs = new Object[] { properties };
			SipStack sipStack = (SipStack) sipStackConstructor
					.newInstance(cArgs);
			mSipStackList.add(sipStack);
			String name = properties.getProperty(STACK_NAME);
			mSipStackByName.put(name, sipStack);
			return sipStack;
		} catch (Exception e) {
			String errmsg = "The peer SIP Stack: "
					+ implName
					+ " could not be instantiated. Ensure the path name has been set correctly.";
			throw new PeerUnavailableException(errmsg, e);
		}
	}
}
