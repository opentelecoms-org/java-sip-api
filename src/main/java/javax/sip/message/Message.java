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

import javax.sip.SipException;
import javax.sip.header.ContentDispositionHeader;
import javax.sip.header.ContentEncodingHeader;
import javax.sip.header.ContentLanguageHeader;
import javax.sip.header.ContentLengthHeader;
import javax.sip.header.ContentTypeHeader;
import javax.sip.header.ExpiresHeader;
import javax.sip.header.Header;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ListIterator;

public interface Message extends Cloneable, Serializable {

    public void addHeader(Header header);

    public void addLast(Header header) throws SipException, NullPointerException ;

    public void addFirst(Header header) throws SipException, NullPointerException;

    public void removeFirst(String headerName) throws NullPointerException;

    public void removeLast(String headerName) throws NullPointerException;

    public void removeHeader(String headerName);

    public ListIterator getHeaderNames();

    public ListIterator getHeaders(String headerName);

    public Header getHeader(String headerName);

    public ListIterator getUnrecognizedHeaders();

    public void setHeader(Header header);

    public void setContentLength(ContentLengthHeader contentLength);

    public ContentLengthHeader getContentLength();

    public void setContentLanguage(ContentLanguageHeader contentLanguage);

    public ContentLanguageHeader getContentLanguage();

    public void setContentEncoding(ContentEncodingHeader contentEncoding);

    public ContentEncodingHeader getContentEncoding();

    public void setContentDisposition(ContentDispositionHeader contentDisposition);

    public ContentDispositionHeader getContentDisposition();

    public void setContent(Object content, ContentTypeHeader contentTypeHeader)
                                             throws ParseException;

    public byte[] getRawContent();

    public Object getContent();

    public void removeContent();

    public void setExpires(ExpiresHeader expires);

    public ExpiresHeader getExpires();

    public void setSIPVersion(String version) throws ParseException;

    public String getSIPVersion();

    public Object clone();

    public boolean equals(Object object);

    public int hashCode();

    public String toString();

}
