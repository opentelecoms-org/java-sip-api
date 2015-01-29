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

import java.util.Iterator;

import javax.sip.address.Router;

public interface SipStack {

    public SipProvider createSipProvider(ListeningPoint listeningPoint)
            throws ObjectInUseException;

    public void deleteSipProvider(SipProvider sipProvider)
                                            throws ObjectInUseException;

    public Iterator getSipProviders();

    public ListeningPoint createListeningPoint(int port, String transport)
            throws TransportNotSupportedException, InvalidArgumentException;

    public ListeningPoint createListeningPoint(String ipAddress, int port,
            String transport) throws TransportNotSupportedException, InvalidArgumentException;

    public void deleteListeningPoint(ListeningPoint listeningPoint)
            throws ObjectInUseException;

    public Iterator getListeningPoints();

    public String getStackName();

    public String getIPAddress();

    public Router getRouter();

    public void stop();

    public void start() throws SipException;

    public boolean isRetransmissionFilterActive();

}

