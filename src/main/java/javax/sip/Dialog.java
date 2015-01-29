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

import javax.sip.address.Address;
import javax.sip.message.Request;
import javax.sip.message.Response;

import java.text.ParseException;
import java.util.Iterator;
import javax.sip.header.CallIdHeader;
import java.io.Serializable;

public interface Dialog extends Serializable {

	public Address getLocalParty();

	public Address getRemoteParty();

	public Address getRemoteTarget();

	public String getDialogId();

	public CallIdHeader getCallId();

	public int getLocalSequenceNumber();

	public long getLocalSeqNumber();

	public int getRemoteSequenceNumber();

	public long getRemoteSeqNumber();

	public Iterator getRouteSet();

	public boolean isSecure();

	public boolean isServer();

	public void incrementLocalSequenceNumber();

	public Request createRequest(String method) throws SipException;

	public Response createReliableProvisionalResponse(int statusCode)
			throws InvalidArgumentException, SipException;

	public void sendRequest(ClientTransaction clientTransaction)
			throws TransactionDoesNotExistException, SipException;

	public void sendReliableProvisionalResponse(Response relResponse)
			throws SipException;

	public Request createPrack(Response relResponse)
			throws DialogDoesNotExistException, SipException;

	public Request createAck(long cseq) throws InvalidArgumentException,
			SipException;

	public void sendAck(Request ackRequest) throws SipException;

	public DialogState getState();

	public void delete();

	public Transaction getFirstTransaction();

	public String getLocalTag();

	public String getRemoteTag();

	public void setApplicationData(Object applicationData);

	public Object getApplicationData();

	public void terminateOnBye(boolean terminateFlag) throws SipException;

}
