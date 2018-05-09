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
import com.microsoft.graph.models.extensions.DeviceComplianceActionItem;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.DeviceComplianceActionItemCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceComplianceActionItemCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceComplianceActionItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceActionItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceActionItemCollectionPage;
import com.microsoft.graph.requests.extensions.IDeviceComplianceActionItemCollectionRequest;
import com.microsoft.graph.requests.extensions.IDeviceComplianceActionItemCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Compliance Action Item Collection Request.
 */
public class BaseDeviceComplianceActionItemCollectionRequest extends BaseCollectionRequest<BaseDeviceComplianceActionItemCollectionResponse, IDeviceComplianceActionItemCollectionPage> implements IBaseDeviceComplianceActionItemCollectionRequest {

    /**
     * The request builder for this collection of DeviceComplianceActionItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDeviceComplianceActionItemCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseDeviceComplianceActionItemCollectionResponse.class, IDeviceComplianceActionItemCollectionPage.class);
    }

    public void get(final ICallback<IDeviceComplianceActionItemCollectionPage> callback) {
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

    public IDeviceComplianceActionItemCollectionPage get() throws ClientException {
        final BaseDeviceComplianceActionItemCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceComplianceActionItem newDeviceComplianceActionItem, final ICallback<DeviceComplianceActionItem> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceComplianceActionItemRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceComplianceActionItem, callback);
    }

    public DeviceComplianceActionItem post(final DeviceComplianceActionItem newDeviceComplianceActionItem) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceComplianceActionItemRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceComplianceActionItem);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceComplianceActionItemCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (DeviceComplianceActionItemCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceComplianceActionItemCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DeviceComplianceActionItemCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceComplianceActionItemCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DeviceComplianceActionItemCollectionRequest)this;
    }

    public IDeviceComplianceActionItemCollectionPage buildFromResponse(final BaseDeviceComplianceActionItemCollectionResponse response) {
        final IDeviceComplianceActionItemCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceComplianceActionItemCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceComplianceActionItemCollectionPage page = new DeviceComplianceActionItemCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
