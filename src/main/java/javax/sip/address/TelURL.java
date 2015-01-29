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

import java.text.ParseException;
import javax.sip.header.Parameters;

public interface TelURL extends URI, Parameters {

    public boolean isGlobal();

    public void setGlobal(boolean global);

    public void setPostDial(String postDial) throws ParseException;

    public String getPostDial();

    public void setPhoneNumber(String phoneNumber) throws ParseException;

    public String getPhoneNumber();    
    
    public void setIsdnSubAddress(String isdnSubAddress) throws ParseException;

    public String getIsdnSubAddress();
    
    public void setPhoneContext(String phoneContext) throws ParseException;

    public String getPhoneContext();
    
    public String toString();
}
