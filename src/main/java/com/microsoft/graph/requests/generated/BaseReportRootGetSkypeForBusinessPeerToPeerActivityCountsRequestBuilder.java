// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequest;

/**
 * The class for the Base Report Root Get Skype For Business Peer To Peer Activity Counts Request Builder.
 */
public class BaseReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetSkypeForBusinessPeerToPeerActivityCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequest
     *
     * @return the IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequest instance
     */
    public IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequest instance
     */
    public IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequest request = new ReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
