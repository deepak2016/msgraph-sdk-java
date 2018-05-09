// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.INotificationMessageTemplateSendTestMessageRequest;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateSendTestMessageRequest;

/**
 * The class for the Base Notification Message Template Send Test Message Request Builder.
 */
public class BaseNotificationMessageTemplateSendTestMessageRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this NotificationMessageTemplateSendTestMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseNotificationMessageTemplateSendTestMessageRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the INotificationMessageTemplateSendTestMessageRequest
     *
     * @return the INotificationMessageTemplateSendTestMessageRequest instance
     */
    public INotificationMessageTemplateSendTestMessageRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the INotificationMessageTemplateSendTestMessageRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the INotificationMessageTemplateSendTestMessageRequest instance
     */
    public INotificationMessageTemplateSendTestMessageRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        NotificationMessageTemplateSendTestMessageRequest request = new NotificationMessageTemplateSendTestMessageRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
