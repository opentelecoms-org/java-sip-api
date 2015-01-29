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

import java.util.EventObject;

import javax.sip.message.Response;

public class ResponseEvent extends EventObject {

	private static final long serialVersionUID = 1L;
	private Response mResponse;
	private ClientTransaction mTransaction;
	private Dialog mDialog;

	public ResponseEvent(Object source, ClientTransaction clientTransaction,
			Dialog dialog, Response response) {
		super(source);
		mResponse = response;
		mTransaction = clientTransaction;
		mDialog = dialog;
	}

	public ClientTransaction getClientTransaction() {
		return mTransaction;
	}

	public Response getResponse() {
		return mResponse;
	}

	public Dialog getDialog() {
		return mDialog;
	}
}
