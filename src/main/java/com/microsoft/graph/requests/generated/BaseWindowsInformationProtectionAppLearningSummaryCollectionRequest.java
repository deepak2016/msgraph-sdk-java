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
import com.microsoft.graph.models.extensions.WindowsInformationProtectionAppLearningSummary;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryCollectionRequest;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionRequest;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Windows Information Protection App Learning Summary Collection Request.
 */
public class BaseWindowsInformationProtectionAppLearningSummaryCollectionRequest extends BaseCollectionRequest<BaseWindowsInformationProtectionAppLearningSummaryCollectionResponse, IWindowsInformationProtectionAppLearningSummaryCollectionPage> implements IBaseWindowsInformationProtectionAppLearningSummaryCollectionRequest {

    /**
     * The request builder for this collection of WindowsInformationProtectionAppLearningSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWindowsInformationProtectionAppLearningSummaryCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseWindowsInformationProtectionAppLearningSummaryCollectionResponse.class, IWindowsInformationProtectionAppLearningSummaryCollectionPage.class);
    }

    public void get(final ICallback<IWindowsInformationProtectionAppLearningSummaryCollectionPage> callback) {
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

    public IWindowsInformationProtectionAppLearningSummaryCollectionPage get() throws ClientException {
        final BaseWindowsInformationProtectionAppLearningSummaryCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WindowsInformationProtectionAppLearningSummary newWindowsInformationProtectionAppLearningSummary, final ICallback<WindowsInformationProtectionAppLearningSummary> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WindowsInformationProtectionAppLearningSummaryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWindowsInformationProtectionAppLearningSummary, callback);
    }

    public WindowsInformationProtectionAppLearningSummary post(final WindowsInformationProtectionAppLearningSummary newWindowsInformationProtectionAppLearningSummary) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WindowsInformationProtectionAppLearningSummaryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWindowsInformationProtectionAppLearningSummary);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWindowsInformationProtectionAppLearningSummaryCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (WindowsInformationProtectionAppLearningSummaryCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWindowsInformationProtectionAppLearningSummaryCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (WindowsInformationProtectionAppLearningSummaryCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWindowsInformationProtectionAppLearningSummaryCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (WindowsInformationProtectionAppLearningSummaryCollectionRequest)this;
    }

    public IWindowsInformationProtectionAppLearningSummaryCollectionPage buildFromResponse(final BaseWindowsInformationProtectionAppLearningSummaryCollectionResponse response) {
        final IWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WindowsInformationProtectionAppLearningSummaryCollectionPage page = new WindowsInformationProtectionAppLearningSummaryCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
