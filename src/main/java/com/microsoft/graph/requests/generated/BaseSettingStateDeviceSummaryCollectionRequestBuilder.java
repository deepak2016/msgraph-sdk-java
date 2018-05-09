// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryCollectionRequest;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryCollectionRequest;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Setting State Device Summary Collection Request Builder.
 */
public class BaseSettingStateDeviceSummaryCollectionRequestBuilder extends BaseRequestBuilder implements IBaseSettingStateDeviceSummaryCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseSettingStateDeviceSummaryCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ISettingStateDeviceSummaryCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ISettingStateDeviceSummaryCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new SettingStateDeviceSummaryCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ISettingStateDeviceSummaryRequestBuilder byId(final String id) {
        return new SettingStateDeviceSummaryRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
