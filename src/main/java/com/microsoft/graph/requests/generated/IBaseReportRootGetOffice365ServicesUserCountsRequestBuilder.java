// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ServicesUserCountsRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Report Root Get Office365Services User Counts Request Builder.
 */
public interface IBaseReportRootGetOffice365ServicesUserCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetOffice365ServicesUserCountsRequest
     *
     * @return the IReportRootGetOffice365ServicesUserCountsRequest instance
     */
    IReportRootGetOffice365ServicesUserCountsRequest buildRequest();

    /**
     * Creates the IReportRootGetOffice365ServicesUserCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOffice365ServicesUserCountsRequest instance
     */
    IReportRootGetOffice365ServicesUserCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
