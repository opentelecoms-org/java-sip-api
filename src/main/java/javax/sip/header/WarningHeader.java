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

import java.text.ParseException;
import javax.sip.InvalidArgumentException;

public interface WarningHeader extends Header {

	public String getAgent();

	public void setAgent(String agent) throws ParseException;

	public String getText();

	public void setText(String text) throws ParseException;

	public void setCode(int code) throws InvalidArgumentException;

	public int getCode();

	public final static String NAME = "Warning";

	public final static int INCOMPATIBLE_NETWORK_PROTOCOL = 300;

	public final static int INCOMPATIBLE_NETWORK_ADDRESS_FORMATS = 301;

	public final static int INCOMPATIBLE_TRANSPORT_PROTOCOL = 302;

	public final static int INCOMPATIBLE_BANDWIDTH_UNITS = 303;

	public final static int MEDIA_TYPE_NOT_AVAILABLE = 304;

	public final static int INCOMPATIBLE_MEDIA_FORMAT = 305;

	public final static int ATTRIBUTE_NOT_UNDERSTOOD = 306;

	public final static int SESSION_DESCRIPTION_PARAMETER_NOT_UNDERSTOOD = 307;

	public final static int MULTICAST_NOT_AVAILABLE = 330;

	public final static int UNICAST_NOT_AVAILABLE = 331;

	public final static int INSUFFICIENT_BANDWIDTH = 370;

	public final static int MISCELLANEOUS_WARNING = 399;

}
