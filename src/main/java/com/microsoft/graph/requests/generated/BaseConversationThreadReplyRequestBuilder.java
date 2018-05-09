// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.Post;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.ConversationThreadReplyRequest;
import com.microsoft.graph.requests.extensions.IConversationThreadReplyRequest;

/**
 * The class for the Base Conversation Thread Reply Request Builder.
 */
public class BaseConversationThreadReplyRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ConversationThreadReply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param post the post
     */
    public BaseConversationThreadReplyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Post post) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("post", post);
    }

    /**
     * Creates the IConversationThreadReplyRequest
     *
     * @return the IConversationThreadReplyRequest instance
     */
    public IConversationThreadReplyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IConversationThreadReplyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IConversationThreadReplyRequest instance
     */
    public IConversationThreadReplyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ConversationThreadReplyRequest request = new ConversationThreadReplyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("post")) {
            request.body.post = getParameter("post");
        }

        return request;
    }
}
