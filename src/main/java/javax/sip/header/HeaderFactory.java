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
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.sip.InvalidArgumentException;
import javax.sip.address.Address;
import javax.sip.address.URI;

public interface HeaderFactory {

	public AcceptEncodingHeader createAcceptEncodingHeader(String encoding)
			throws ParseException;

	public AcceptHeader createAcceptHeader(String contentType,
			String contentSubType) throws ParseException;

	public AcceptLanguageHeader createAcceptLanguageHeader(Locale language);

	public AlertInfoHeader createAlertInfoHeader(URI alertInfo);

	public AllowEventsHeader createAllowEventsHeader(String eventType)
			throws ParseException;

	public AllowHeader createAllowHeader(String method) throws ParseException;

	public AuthenticationInfoHeader createAuthenticationInfoHeader(
			String response) throws ParseException;

	public AuthorizationHeader createAuthorizationHeader(String scheme)
			throws ParseException;

	public CSeqHeader createCSeqHeader(int sequenceNumber, String method)
			throws ParseException, InvalidArgumentException;

	public CSeqHeader createCSeqHeader(long sequenceNumber, String method)
			throws ParseException, InvalidArgumentException;

	public CallIdHeader createCallIdHeader(String callId) throws ParseException;

	public CallInfoHeader createCallInfoHeader(URI callInfo);

	public ContactHeader createContactHeader(Address address);

	public ContactHeader createContactHeader();

	public ContentDispositionHeader createContentDispositionHeader(
			String contentDispositionType) throws ParseException;

	public ContentEncodingHeader createContentEncodingHeader(String encoding)
			throws ParseException;

	public ContentLanguageHeader createContentLanguageHeader(
			Locale contentLanguage);

	public ContentLengthHeader createContentLengthHeader(int contentLength)
			throws InvalidArgumentException;

	public ContentTypeHeader createContentTypeHeader(String contentType,
			String contentSubType) throws ParseException;

	public DateHeader createDateHeader(Calendar date);

	public ErrorInfoHeader createErrorInfoHeader(URI errorInfo);

	public EventHeader createEventHeader(String eventType)
			throws ParseException;

	public ExpiresHeader createExpiresHeader(int expires)
			throws InvalidArgumentException;

	public Header createHeader(String name, String value) throws ParseException;

	public List createHeaders(String headers) throws ParseException;

	public FromHeader createFromHeader(Address address, String tag)
			throws ParseException;

	public InReplyToHeader createInReplyToHeader(String callId)
			throws ParseException;

	public MaxForwardsHeader createMaxForwardsHeader(int maxForwards)
			throws InvalidArgumentException;

	public MimeVersionHeader createMimeVersionHeader(int majorVersion,
			int minorVersion) throws InvalidArgumentException;

	public MinExpiresHeader createMinExpiresHeader(int minExpires)
			throws InvalidArgumentException;

	public OrganizationHeader createOrganizationHeader(String organization)
			throws ParseException;

	public PriorityHeader createPriorityHeader(String priority)
			throws ParseException;

	public ProxyAuthenticateHeader createProxyAuthenticateHeader(String scheme)
			throws ParseException;

	public ProxyAuthorizationHeader createProxyAuthorizationHeader(String scheme)
			throws ParseException;

	public ProxyRequireHeader createProxyRequireHeader(String optionTag)
			throws ParseException;

	public RAckHeader createRAckHeader(int rSeqNumber, int cSeqNumber,
			String method) throws InvalidArgumentException, ParseException;

	public RSeqHeader createRSeqHeader(int sequenceNumber)
			throws InvalidArgumentException;

	public ReasonHeader createReasonHeader(String protocol, int cause,
			String text) throws InvalidArgumentException, ParseException;

	public RecordRouteHeader createRecordRouteHeader(Address address);

	public ReplyToHeader createReplyToHeader(Address address);

	public ReferToHeader createReferToHeader(Address address);

	public RequireHeader createRequireHeader(String optionTag)
			throws ParseException;

	public RetryAfterHeader createRetryAfterHeader(int retryAfter)
			throws InvalidArgumentException;

	public RouteHeader createRouteHeader(Address address);

	public ServerHeader createServerHeader(List product) throws ParseException;

	public SubjectHeader createSubjectHeader(String subject)
			throws ParseException;

	public SubscriptionStateHeader createSubscriptionStateHeader(
			String subscriptionState) throws ParseException;

	public SupportedHeader createSupportedHeader(String optionTag)
			throws ParseException;

	public TimeStampHeader createTimeStampHeader(float timeStamp)
			throws InvalidArgumentException;

	public ToHeader createToHeader(Address address, String tag)
			throws ParseException;

	public UnsupportedHeader createUnsupportedHeader(String optionTag)
			throws ParseException;

	public UserAgentHeader createUserAgentHeader(List product)
			throws ParseException;

	public ViaHeader createViaHeader(String host, int port, String transport,
			String branch) throws ParseException, InvalidArgumentException;

	public WWWAuthenticateHeader createWWWAuthenticateHeader(String scheme)
			throws ParseException;

	public WarningHeader createWarningHeader(String agent, int code,
			String comment) throws InvalidArgumentException, ParseException;

	public SIPETagHeader createSIPETagHeader(String etag) throws ParseException;

	public SIPIfMatchHeader createSIPIfMatchHeader(String etag)
			throws ParseException;
}
