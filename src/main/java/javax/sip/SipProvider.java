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

import java.util.TooManyListenersException;

import javax.sip.header.CallIdHeader;
import javax.sip.message.Request;
import javax.sip.message.Response;

public interface SipProvider {

	public void addSipListener(SipListener sipListener)
			throws TooManyListenersException;

	public void removeSipListener(SipListener sipListener);

	public SipStack getSipStack();

	public ListeningPoint getListeningPoint();

	public ListeningPoint[] getListeningPoints();

	public void setListeningPoint(ListeningPoint listeningPoint)
			throws ObjectInUseException;

	public void addListeningPoint(ListeningPoint listeningPoint)
			throws ObjectInUseException, TransportAlreadySupportedException;

	public ListeningPoint getListeningPoint(String transport);

	public void removeListeningPoint(ListeningPoint listeningPoint)
			throws ObjectInUseException;

	public CallIdHeader getNewCallId();

	public ClientTransaction getNewClientTransaction(Request request)
			throws TransactionUnavailableException;

	public ServerTransaction getNewServerTransaction(Request request)
			throws TransactionAlreadyExistsException,
			TransactionUnavailableException;

	public void sendRequest(Request request) throws SipException;

	public void sendResponse(Response response) throws SipException;

	public Dialog getNewDialog(Transaction transaction) throws SipException;

	public void setAutomaticDialogSupportEnabled(boolean flag);

}
