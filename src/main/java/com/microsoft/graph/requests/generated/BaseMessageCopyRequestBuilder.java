// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IMessageCopyRequest;
import com.microsoft.graph.requests.extensions.MessageCopyRequest;

/**
 * The class for the Base Message Copy Request Builder.
 */
public class BaseMessageCopyRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this MessageCopy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param destinationId the destinationId
     */
    public BaseMessageCopyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String destinationId) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("destinationId", destinationId);
    }

    /**
     * Creates the IMessageCopyRequest
     *
     * @return the IMessageCopyRequest instance
     */
    public IMessageCopyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IMessageCopyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IMessageCopyRequest instance
     */
    public IMessageCopyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        MessageCopyRequest request = new MessageCopyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("destinationId")) {
            request.body.destinationId = getParameter("destinationId");
        }

        return request;
    }
}
