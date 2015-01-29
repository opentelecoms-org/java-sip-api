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

public interface ReasonHeader extends Parameters, Header {

	public int getCause();

	public void setCause(int cause) throws InvalidArgumentException;

	public void setProtocol(String protocol) throws ParseException;

	public String getProtocol();

	public void setText(String text) throws ParseException;

	public String getText();

	public final static String NAME = "Reason";

}
