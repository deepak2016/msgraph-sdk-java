// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Report Root Get Skype For Business Peer To Peer Activity Counts Request Builder.
 */
public interface IBaseReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequest
     *
     * @return the IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequest instance
     */
    IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequest buildRequest();

    /**
     * Creates the IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequest instance
     */
    IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
