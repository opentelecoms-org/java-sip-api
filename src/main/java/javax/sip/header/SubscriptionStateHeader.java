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
package javax.sip.header;

import javax.sip.InvalidArgumentException;
import java.text.ParseException;

public interface SubscriptionStateHeader extends Parameters, Header {

	public void setExpires(int expires) throws InvalidArgumentException;

	public int getExpires();

	public void setRetryAfter(int retryAfter) throws InvalidArgumentException;

	public int getRetryAfter();

	public String getReasonCode();

	public void setReasonCode(String reasonCode) throws ParseException;

	public String getState();

	public void setState(String state) throws ParseException;

	public final static String NAME = "Subscription-State";

	public final static String UNKNOWN = "unknown";

	public final static String DEACTIVATED = "deactivated";

	public final static String PROBATION = "probation";

	public final static String REJECTED = "rejected";

	public final static String TIMEOUT = "timeout";

	public final static String GIVE_UP = "giveup";

	public final static String NO_RESOURCE = "noresource";

	public final static String ACTIVE = "active";

	public final static String TERMINATED = "terminated";

	public final static String PENDING = "pending";

}
