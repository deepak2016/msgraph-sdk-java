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
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyCollectionRequest;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Compliance Policy Collection Request.
 */
public class BaseDeviceCompliancePolicyCollectionRequest extends BaseCollectionRequest<BaseDeviceCompliancePolicyCollectionResponse, IDeviceCompliancePolicyCollectionPage> implements IBaseDeviceCompliancePolicyCollectionRequest {

    /**
     * The request builder for this collection of DeviceCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDeviceCompliancePolicyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseDeviceCompliancePolicyCollectionResponse.class, IDeviceCompliancePolicyCollectionPage.class);
    }

    public void get(final ICallback<IDeviceCompliancePolicyCollectionPage> callback) {
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

    public IDeviceCompliancePolicyCollectionPage get() throws ClientException {
        final BaseDeviceCompliancePolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceCompliancePolicy newDeviceCompliancePolicy, final ICallback<DeviceCompliancePolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceCompliancePolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceCompliancePolicy, callback);
    }

    public DeviceCompliancePolicy post(final DeviceCompliancePolicy newDeviceCompliancePolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceCompliancePolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceCompliancePolicy);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceCompliancePolicyCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (DeviceCompliancePolicyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceCompliancePolicyCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DeviceCompliancePolicyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceCompliancePolicyCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DeviceCompliancePolicyCollectionRequest)this;
    }

    public IDeviceCompliancePolicyCollectionPage buildFromResponse(final BaseDeviceCompliancePolicyCollectionResponse response) {
        final IDeviceCompliancePolicyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceCompliancePolicyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceCompliancePolicyCollectionPage page = new DeviceCompliancePolicyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
