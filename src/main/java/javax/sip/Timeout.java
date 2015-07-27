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

public final class Timeout implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final int mSize = 2;
	private static Timeout[] mTimeoutArray = new Timeout[mSize];

	public final static int _RETRANSMIT = 0;
	public final static Timeout RETRANSMIT = new Timeout(_RETRANSMIT);
	public final static int _TRANSACTION = 1;
	public final static Timeout TRANSACTION = new Timeout(_TRANSACTION);

	private static final String[] NAMES = {
			"Retransmission Timeout",
			"Transaction Timeout"
		};

	private int mTimeout;

	private Timeout(int timeout) {
		mTimeout = timeout;
		mTimeoutArray[mTimeout] = this;
	}

	public Timeout getObject(int timeout) {
		if (timeout >= 0 && timeout < mSize) {
			return mTimeoutArray[timeout];
		} else {
			throw new IllegalArgumentException("Invalid timeout value");
		}
	}

	public int getValue() {
		return mTimeout;
	}

	private Object readResolve() throws ObjectStreamException {
		return mTimeoutArray[mTimeout];
	}

	public String toString() {
		if(mTimeout < NAMES.length) {
			return NAMES[mTimeout];
		}
		return "Error while printing Timeout";
	}
}
