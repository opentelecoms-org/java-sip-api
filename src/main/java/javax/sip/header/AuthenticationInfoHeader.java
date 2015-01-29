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

public interface AuthenticationInfoHeader extends Parameters, Header {

	public void setNextNonce(String nextNonce) throws ParseException;

	public String getNextNonce();

	public void setQop(String qop) throws ParseException;

	public String getQop();

	public void setCNonce(String cNonce) throws ParseException;

	public String getCNonce();

	public void setNonceCount(int nonceCount) throws ParseException;

	public int getNonceCount();

	public void setResponse(String response) throws ParseException;

	public String getResponse();

	public final static String NAME = "Authentication-Info";

}
