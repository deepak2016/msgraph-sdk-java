// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Post Forward Request Builder.
 */
public class BasePostForwardRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this PostForward
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param comment the comment
     * @param toRecipients the toRecipients
     */
    public BasePostForwardRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String comment, final java.util.List<Recipient> toRecipients) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("comment", comment);
        bodyParams.put("toRecipients", toRecipients);
    }

    /**
     * Creates the IPostForwardRequest
     *
     * @return the IPostForwardRequest instance
     */
    public IPostForwardRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IPostForwardRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IPostForwardRequest instance
     */
    public IPostForwardRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        PostForwardRequest request = new PostForwardRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("comment")) {
            request.body.comment = getParameter("comment");
        }

        if (hasParameter("toRecipients")) {
            request.body.toRecipients = getParameter("toRecipients");
        }

        return request;
    }
}
