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
package javax.sip.address;

import java.util.Iterator;
import javax.sip.header.Parameters;
import java.text.ParseException;
import javax.sip.InvalidArgumentException;

public interface SipURI extends URI, Parameters {

    public void setUser(String user) throws ParseException;

    public String getUser();

    public void setUserPassword(String userPassword) throws ParseException;

    public String getUserPassword();

    public boolean isSecure();

    public void setSecure(boolean secure);

    public void setHost(String host) throws ParseException;

    public String getHost();
    
    public void setPort(int port);     

    public int getPort();    

    public void removePort();     

    public String getHeader(String name);

    public void setHeader(String name, String value) throws ParseException;

    public Iterator getHeaderNames();

    public String getTransportParam();

    public void setTransportParam(String transport) throws ParseException;

    public int getTTLParam();

    public void setTTLParam(int ttl) throws InvalidArgumentException;

    public String getMethodParam();

    public void setMethodParam(String method) throws ParseException;

    public void setUserParam(String userParam) throws ParseException;

    public String getUserParam();

    public String getMAddrParam();

    public void setMAddrParam(String mAddr) throws ParseException;

    public boolean hasLrParam();

    public void setLrParam();
    
    public String toString();
    
}

