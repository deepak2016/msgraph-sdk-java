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
import com.microsoft.graph.models.extensions.Attachment;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.AttachmentCollectionPage;
import com.microsoft.graph.requests.extensions.AttachmentCollectionRequest;
import com.microsoft.graph.requests.extensions.AttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttachmentCollectionPage;
import com.microsoft.graph.requests.extensions.IAttachmentCollectionRequest;
import com.microsoft.graph.requests.extensions.IAttachmentCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Attachment Collection Request.
 */
public class BaseAttachmentCollectionRequest extends BaseCollectionRequest<BaseAttachmentCollectionResponse, IAttachmentCollectionPage> implements IBaseAttachmentCollectionRequest {

    /**
     * The request builder for this collection of Attachment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseAttachmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseAttachmentCollectionResponse.class, IAttachmentCollectionPage.class);
    }

    public void get(final ICallback<IAttachmentCollectionPage> callback) {
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

    public IAttachmentCollectionPage get() throws ClientException {
        final BaseAttachmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Attachment newAttachment, final ICallback<Attachment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AttachmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAttachment, callback);
    }

    public Attachment post(final Attachment newAttachment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AttachmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAttachment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAttachmentCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (AttachmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAttachmentCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (AttachmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAttachmentCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (AttachmentCollectionRequest)this;
    }

    public IAttachmentCollectionPage buildFromResponse(final BaseAttachmentCollectionResponse response) {
        final IAttachmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AttachmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AttachmentCollectionPage page = new AttachmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
