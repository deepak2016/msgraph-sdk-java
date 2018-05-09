// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryCollectionRequest;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionRequest;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Windows Information Protection App Learning Summary Collection Request Builder.
 */
public class BaseWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder extends BaseRequestBuilder implements IBaseWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IWindowsInformationProtectionAppLearningSummaryCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IWindowsInformationProtectionAppLearningSummaryCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WindowsInformationProtectionAppLearningSummaryCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWindowsInformationProtectionAppLearningSummaryRequestBuilder byId(final String id) {
        return new WindowsInformationProtectionAppLearningSummaryRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
