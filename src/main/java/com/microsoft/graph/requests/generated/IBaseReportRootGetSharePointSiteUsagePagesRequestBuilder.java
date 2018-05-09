// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsagePagesRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Report Root Get Share Point Site Usage Pages Request Builder.
 */
public interface IBaseReportRootGetSharePointSiteUsagePagesRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetSharePointSiteUsagePagesRequest
     *
     * @return the IReportRootGetSharePointSiteUsagePagesRequest instance
     */
    IReportRootGetSharePointSiteUsagePagesRequest buildRequest();

    /**
     * Creates the IReportRootGetSharePointSiteUsagePagesRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSharePointSiteUsagePagesRequest instance
     */
    IReportRootGetSharePointSiteUsagePagesRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
