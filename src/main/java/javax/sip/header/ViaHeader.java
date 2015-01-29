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

public interface ViaHeader extends Parameters, Header {

	public void setHost(String host) throws ParseException;

	public String getHost();

	public void setPort(int port) throws InvalidArgumentException;

	public int getPort();

	public String getTransport();

	public void setTransport(String transport) throws ParseException;

	public String getProtocol();

	public void setProtocol(String protocol) throws ParseException;

	public int getTTL();

	public void setTTL(int ttl) throws InvalidArgumentException;

	public String getMAddr();

	public void setMAddr(String mAddr) throws ParseException;

	public String getReceived();

	public void setReceived(String received) throws ParseException;

	public String getBranch();

	public void setBranch(String branch) throws ParseException;

	public void setRPort() throws InvalidArgumentException;

	public int getRPort();

	public boolean equals(Object obj);

	public final static String NAME = "Via";

}
