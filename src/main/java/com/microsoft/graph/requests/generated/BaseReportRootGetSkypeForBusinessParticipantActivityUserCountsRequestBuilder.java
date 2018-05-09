// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessParticipantActivityUserCountsRequest;

/**
 * The class for the Base Report Root Get Skype For Business Participant Activity User Counts Request Builder.
 */
public class BaseReportRootGetSkypeForBusinessParticipantActivityUserCountsRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetSkypeForBusinessParticipantActivityUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetSkypeForBusinessParticipantActivityUserCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequest
     *
     * @return the IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequest instance
     */
    public IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequest instance
     */
    public IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetSkypeForBusinessParticipantActivityUserCountsRequest request = new ReportRootGetSkypeForBusinessParticipantActivityUserCountsRequest(
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
