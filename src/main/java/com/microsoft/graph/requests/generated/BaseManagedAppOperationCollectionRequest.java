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
import com.microsoft.graph.models.extensions.ManagedAppOperation;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IManagedAppOperationCollectionPage;
import com.microsoft.graph.requests.extensions.IManagedAppOperationCollectionRequest;
import com.microsoft.graph.requests.extensions.IManagedAppOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppOperationCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppOperationCollectionRequest;
import com.microsoft.graph.requests.extensions.ManagedAppOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppOperationRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed App Operation Collection Request.
 */
public class BaseManagedAppOperationCollectionRequest extends BaseCollectionRequest<BaseManagedAppOperationCollectionResponse, IManagedAppOperationCollectionPage> implements IBaseManagedAppOperationCollectionRequest {

    /**
     * The request builder for this collection of ManagedAppOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedAppOperationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseManagedAppOperationCollectionResponse.class, IManagedAppOperationCollectionPage.class);
    }

    public void get(final ICallback<IManagedAppOperationCollectionPage> callback) {
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

    public IManagedAppOperationCollectionPage get() throws ClientException {
        final BaseManagedAppOperationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ManagedAppOperation newManagedAppOperation, final ICallback<ManagedAppOperation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ManagedAppOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newManagedAppOperation, callback);
    }

    public ManagedAppOperation post(final ManagedAppOperation newManagedAppOperation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ManagedAppOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newManagedAppOperation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedAppOperationCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ManagedAppOperationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedAppOperationCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ManagedAppOperationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IManagedAppOperationCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ManagedAppOperationCollectionRequest)this;
    }

    public IManagedAppOperationCollectionPage buildFromResponse(final BaseManagedAppOperationCollectionResponse response) {
        final IManagedAppOperationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ManagedAppOperationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ManagedAppOperationCollectionPage page = new ManagedAppOperationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
