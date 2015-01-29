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

import java.text.ParseException;
import javax.sip.address.URI;
import javax.sip.header.CSeqHeader;
import javax.sip.header.CallIdHeader;
import javax.sip.header.ContentTypeHeader;
import javax.sip.header.FromHeader;
import javax.sip.header.MaxForwardsHeader;
import javax.sip.header.ToHeader;

import java.util.List;

public interface MessageFactory {

    public Request createRequest(URI requestURI, String method, CallIdHeader
            callId, CSeqHeader cSeq, FromHeader from, ToHeader to, List via,
                MaxForwardsHeader maxForwards, ContentTypeHeader contentType,
                Object content) throws ParseException;

    public Request createRequest(URI requestURI, String method, CallIdHeader
            callId, CSeqHeader cSeq, FromHeader from, ToHeader to, List via,
                MaxForwardsHeader maxForwards, ContentTypeHeader contentType,
                byte[] content) throws ParseException;

    public Request createRequest(URI requestURI, String method, CallIdHeader
            callId, CSeqHeader cSeq, FromHeader from, ToHeader to, List via,
                MaxForwardsHeader maxForwards) throws ParseException;

    public Request createRequest(String request) throws ParseException;

    public Response createResponse(int statusCode, CallIdHeader callId,
            CSeqHeader cSeq, FromHeader from, ToHeader to, List via,
                MaxForwardsHeader maxForwards, ContentTypeHeader contentType,
                Object content) throws ParseException;

    public Response createResponse(int statusCode, CallIdHeader callId,
            CSeqHeader cSeq, FromHeader from, ToHeader to, List via,
                MaxForwardsHeader maxForwards, ContentTypeHeader contentType,
                byte[] content) throws ParseException;

    public Response createResponse(int statusCode, CallIdHeader callId,
            CSeqHeader cSeq, FromHeader from, ToHeader to, List via,
                MaxForwardsHeader maxForwards) throws ParseException;

    public Response createResponse(int statusCode, Request request,
            ContentTypeHeader contentType, Object content) throws ParseException;

    public Response createResponse(int statusCode, Request request,
            ContentTypeHeader contentType, byte[] content) throws ParseException;

    public Response createResponse(int statusCode, Request request)
                                                throws ParseException;

    public Response createResponse( String response) throws ParseException;

}

