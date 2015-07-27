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

public final class DialogState implements Serializable {

	private static final int mSize = 4;
	private static DialogState[] mDialogStateArray = new DialogState[mSize];

	public static final int _EARLY = 0;
	public static final DialogState EARLY = new DialogState(_EARLY);
	public static final int _CONFIRMED = 1;
	public static final DialogState CONFIRMED = new DialogState(_CONFIRMED);
	public static final int _COMPLETED = 2;
	public static final DialogState COMPLETED = new DialogState(_COMPLETED);
	public static final int _TERMINATED = 3;
	public static final DialogState TERMINATED = new DialogState(_TERMINATED);

	private static final long serialVersionUID = 1L;
	private static final String[] NAMES = {
			"Early Dialog",
			"Confirmed Dialog",
			"Completed Dialog",
			"Terminated Dialog"
		};

	private int mDialogState;

	private DialogState(int dialogState) {
		mDialogState = dialogState;
		mDialogStateArray[mDialogState] = this;
	}

	public static DialogState getObject(int dialogState) {
		if (dialogState >= 0 && dialogState < mSize) {
			return mDialogStateArray[dialogState];
		} else {
			throw new IllegalArgumentException("Invalid dialogState value");
		}
	}

	public int getValue() {
		return mDialogState;
	}

	private Object readResolve() throws ObjectStreamException {
		return mDialogStateArray[mDialogState];
	}

	public boolean equals(Object obj) {
		if (obj == this)
			return true;

		return (obj instanceof DialogState)
				&& ((DialogState) obj).mDialogState == mDialogState;
	}

	public int hashCode() {
		return mDialogState;
	}

	public String toString() {
		if(mDialogState < NAMES.length) {
			return NAMES[mDialogState];
		}
		return "Error while printing Dialog State";
	}
}
