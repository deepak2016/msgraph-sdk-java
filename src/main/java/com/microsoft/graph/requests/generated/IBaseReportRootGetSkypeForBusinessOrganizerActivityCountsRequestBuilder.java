// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessOrganizerActivityCountsRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Report Root Get Skype For Business Organizer Activity Counts Request Builder.
 */
public interface IBaseReportRootGetSkypeForBusinessOrganizerActivityCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetSkypeForBusinessOrganizerActivityCountsRequest
     *
     * @return the IReportRootGetSkypeForBusinessOrganizerActivityCountsRequest instance
     */
    IReportRootGetSkypeForBusinessOrganizerActivityCountsRequest buildRequest();

    /**
     * Creates the IReportRootGetSkypeForBusinessOrganizerActivityCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessOrganizerActivityCountsRequest instance
     */
    IReportRootGetSkypeForBusinessOrganizerActivityCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
