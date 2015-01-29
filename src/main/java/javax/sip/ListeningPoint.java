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

import java.io.Serializable;
import java.text.ParseException;

public interface ListeningPoint extends Cloneable, Serializable {
	
    public static final String TCP = "TCP";
    public static final String UDP = "UDP";
    public static final String SCTP = "SCTP";
    public static final String TLS = "TLS";

    public static final int PORT_5060 = 5060;
    public static final int PORT_5061 = 5061;

    public int getPort();

    public String getTransport();

    public String getIPAddress();

    public void setSentBy(String sentBy) throws ParseException;

    public String getSentBy();

    public boolean equals(Object obj);
}

