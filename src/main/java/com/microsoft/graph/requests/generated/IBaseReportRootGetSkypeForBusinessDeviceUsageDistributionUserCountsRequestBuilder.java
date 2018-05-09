// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Report Root Get Skype For Business Device Usage Distribution User Counts Request Builder.
 */
public interface IBaseReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequest
     *
     * @return the IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequest instance
     */
    IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequest buildRequest();

    /**
     * Creates the IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequest instance
     */
    IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
