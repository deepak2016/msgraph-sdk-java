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
import com.microsoft.graph.models.extensions.TelecomExpenseManagementPartner;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.ITelecomExpenseManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.ITelecomExpenseManagementPartnerCollectionRequest;
import com.microsoft.graph.requests.extensions.ITelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionRequest;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Telecom Expense Management Partner Collection Request.
 */
public class BaseTelecomExpenseManagementPartnerCollectionRequest extends BaseCollectionRequest<BaseTelecomExpenseManagementPartnerCollectionResponse, ITelecomExpenseManagementPartnerCollectionPage> implements IBaseTelecomExpenseManagementPartnerCollectionRequest {

    /**
     * The request builder for this collection of TelecomExpenseManagementPartner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseTelecomExpenseManagementPartnerCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseTelecomExpenseManagementPartnerCollectionResponse.class, ITelecomExpenseManagementPartnerCollectionPage.class);
    }

    public void get(final ICallback<ITelecomExpenseManagementPartnerCollectionPage> callback) {
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

    public ITelecomExpenseManagementPartnerCollectionPage get() throws ClientException {
        final BaseTelecomExpenseManagementPartnerCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TelecomExpenseManagementPartner newTelecomExpenseManagementPartner, final ICallback<TelecomExpenseManagementPartner> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TelecomExpenseManagementPartnerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTelecomExpenseManagementPartner, callback);
    }

    public TelecomExpenseManagementPartner post(final TelecomExpenseManagementPartner newTelecomExpenseManagementPartner) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TelecomExpenseManagementPartnerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTelecomExpenseManagementPartner);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITelecomExpenseManagementPartnerCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (TelecomExpenseManagementPartnerCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITelecomExpenseManagementPartnerCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (TelecomExpenseManagementPartnerCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITelecomExpenseManagementPartnerCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (TelecomExpenseManagementPartnerCollectionRequest)this;
    }

    public ITelecomExpenseManagementPartnerCollectionPage buildFromResponse(final BaseTelecomExpenseManagementPartnerCollectionResponse response) {
        final ITelecomExpenseManagementPartnerCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TelecomExpenseManagementPartnerCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TelecomExpenseManagementPartnerCollectionPage page = new TelecomExpenseManagementPartnerCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
