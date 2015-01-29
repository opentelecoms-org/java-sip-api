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
import javax.sip.address.URI;

public interface AuthorizationHeader extends Parameters, Header {

	public void setScheme(String scheme);

	public String getScheme();

	public void setRealm(String realm) throws ParseException;

	public String getRealm();

	public void setUsername(String username) throws ParseException;

	public String getUsername();

	public void setNonce(String nonce) throws ParseException;

	public String getNonce();

	public void setURI(URI uri);

	public URI getURI();

	public void setResponse(String response) throws ParseException;

	public String getResponse();

	public void setAlgorithm(String algorithm) throws ParseException;

	public String getAlgorithm();

	public void setCNonce(String cNonce) throws ParseException;

	public String getCNonce();

	public void setOpaque(String opaque) throws ParseException;

	public String getOpaque();

	public void setQop(String qop) throws ParseException;

	public String getQop();

	public void setNonceCount(int nonceCount) throws ParseException;

	public int getNonceCount();

	public final static String NAME = "Authorization";

}
