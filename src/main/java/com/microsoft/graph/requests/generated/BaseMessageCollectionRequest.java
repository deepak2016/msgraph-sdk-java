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
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IMessageCollectionPage;
import com.microsoft.graph.requests.extensions.IMessageCollectionRequest;
import com.microsoft.graph.requests.extensions.IMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageCollectionPage;
import com.microsoft.graph.requests.extensions.MessageCollectionRequest;
import com.microsoft.graph.requests.extensions.MessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Message Collection Request.
 */
public class BaseMessageCollectionRequest extends BaseCollectionRequest<BaseMessageCollectionResponse, IMessageCollectionPage> implements IBaseMessageCollectionRequest {

    /**
     * The request builder for this collection of Message
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseMessageCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseMessageCollectionResponse.class, IMessageCollectionPage.class);
    }

    public void get(final ICallback<IMessageCollectionPage> callback) {
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

    public IMessageCollectionPage get() throws ClientException {
        final BaseMessageCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Message newMessage, final ICallback<Message> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new MessageRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newMessage, callback);
    }

    public Message post(final Message newMessage) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MessageRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newMessage);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMessageCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (MessageCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMessageCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (MessageCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IMessageCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (MessageCollectionRequest)this;
    }

    public IMessageCollectionPage buildFromResponse(final BaseMessageCollectionResponse response) {
        final IMessageCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MessageCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final MessageCollectionPage page = new MessageCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
