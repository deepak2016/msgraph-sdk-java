// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.models.extensions.ConversationThread;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.ConversationThreadCollectionPage;
import com.microsoft.graph.requests.extensions.ConversationThreadCollectionRequest;
import com.microsoft.graph.requests.extensions.ConversationThreadCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationThreadRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationThreadCollectionPage;
import com.microsoft.graph.requests.extensions.IConversationThreadCollectionRequest;
import com.microsoft.graph.requests.extensions.IConversationThreadCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Conversation Thread Collection Request.
 */
public class BaseConversationThreadCollectionRequest extends BaseCollectionRequest<BaseConversationThreadCollectionResponse, IConversationThreadCollectionPage> implements IBaseConversationThreadCollectionRequest {

    /**
     * The request builder for this collection of ConversationThread
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseConversationThreadCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseConversationThreadCollectionResponse.class, IConversationThreadCollectionPage.class);
    }

    public void get(final ICallback<IConversationThreadCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IConversationThreadCollectionPage get() throws ClientException {
        final BaseConversationThreadCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ConversationThread newConversationThread, final ICallback<ConversationThread> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ConversationThreadRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newConversationThread, callback);
    }

    public ConversationThread post(final ConversationThread newConversationThread) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ConversationThreadRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newConversationThread);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IConversationThreadCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ConversationThreadCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IConversationThreadCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ConversationThreadCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IConversationThreadCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ConversationThreadCollectionRequest)this;
    }

    public IConversationThreadCollectionPage buildFromResponse(final BaseConversationThreadCollectionResponse response) {
        final IConversationThreadCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ConversationThreadCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ConversationThreadCollectionPage page = new ConversationThreadCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
