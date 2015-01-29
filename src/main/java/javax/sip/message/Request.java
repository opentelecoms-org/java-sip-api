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
package javax.sip.message;

import javax.sip.address.URI;
import java.text.ParseException;

public interface Request extends Message {
   
    public String getMethod();

    public void setMethod(String method) throws ParseException;    
    
    public URI getRequestURI();

    public void setRequestURI(URI requestURI);

    
    
    
    public static final String ACK = "ACK";

    public static final String BYE = "BYE";

    public static final String CANCEL = "CANCEL";

    public static final String INVITE = "INVITE";    
    
    public static final String OPTIONS = "OPTIONS";

    public static final String REGISTER = "REGISTER";

    
    public static final String NOTIFY = "NOTIFY";          

    
    public static final String SUBSCRIBE = "SUBSCRIBE";    
    
    public static final String MESSAGE = "MESSAGE";

    public static final String REFER = "REFER";    

    public static final String INFO = "INFO";    
    
    public static final String PRACK = "PRACK";    

    public static final String UPDATE = "UPDATE";
    
    public static final String PUBLISH = "PUBLISH";    
}

