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

import java.io.ObjectStreamException;
import java.io.Serializable;

public final class TransactionState implements Serializable {

	private static final long serialVersionUID = 1L;

	private static int mSize = 6;
	private static TransactionState[] mTransStateArray = new TransactionState[mSize];

	public static final int _CALLING = 0;
	public static final TransactionState CALLING = new TransactionState(
			_CALLING);

	public static final int _TRYING = 1;
	public static final TransactionState TRYING = new TransactionState(_TRYING);

	public static final int _PROCEEDING = 2;
	public static final TransactionState PROCEEDING = new TransactionState(
			_PROCEEDING);

	public static final int _COMPLETED = 3;
	public static final TransactionState COMPLETED = new TransactionState(
			_COMPLETED);

	public static final int _CONFIRMED = 4;
	public static final TransactionState CONFIRMED = new TransactionState(
			_CONFIRMED);

	public static final int _TERMINATED = 5;
	public static final TransactionState TERMINATED = new TransactionState(
			_TERMINATED);

	private static final String[] NAMES = {
			"Calling Transaction",
			"Trying Transaction",
			"Proceeding Transaction",
			"Completed Transaction",
			"Confirmed Transaction",
			"Terminated Transaction"
		};
	private int mTransactionState;

	private TransactionState(int transactionState) {
		mTransactionState = transactionState;
		mTransStateArray[mTransactionState] = this;
	}

	public static TransactionState getObject(int transactionState) {
		if (transactionState >= 0 && transactionState < mSize) {
			return mTransStateArray[transactionState];
		} else {
			throw new IllegalArgumentException("Invalid transactionState value");
		}
	}

	public int getValue() {
		return mTransactionState;
	}

	private Object readResolve() throws ObjectStreamException {
		return mTransStateArray[mTransactionState];
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		return (obj instanceof TransactionState)
				&& ((TransactionState) obj).mTransactionState == mTransactionState;
	}

	public int hashCode() {
		return mTransactionState;
	}

	public String toString() {
		if(mTransactionState < NAMES.length) {
			return NAMES[mTransactionState];
		}
		return "Error while printing Transaction State";
	}
}
