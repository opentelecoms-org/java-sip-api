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

public class TransactionTerminatedEvent extends EventObject {

	private static final long serialVersionUID = 1L;
	private boolean mIsServerTransaction;
	private ServerTransaction mServerTransaction = null;
	private ClientTransaction mClientTransaction = null;

	public TransactionTerminatedEvent(Object source,
			ServerTransaction serverTransaction) {
		super(source);
		mServerTransaction = serverTransaction;
		mIsServerTransaction = true;
	}

	public TransactionTerminatedEvent(Object source,
			ClientTransaction clientTransaction) {
		super(source);
		mClientTransaction = clientTransaction;
		mIsServerTransaction = false;
	}

	public ServerTransaction getServerTransaction() {
		return mServerTransaction;
	}

	public ClientTransaction getClientTransaction() {
		return mClientTransaction;
	}

	public boolean isServerTransaction() {
		return mIsServerTransaction;
	}
}
