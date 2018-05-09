// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageMailboxCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageMailboxCountsRequest;

/**
 * The class for the Base Report Root Get Mailbox Usage Mailbox Counts Request Builder.
 */
public class BaseReportRootGetMailboxUsageMailboxCountsRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetMailboxUsageMailboxCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetMailboxUsageMailboxCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetMailboxUsageMailboxCountsRequest
     *
     * @return the IReportRootGetMailboxUsageMailboxCountsRequest instance
     */
    public IReportRootGetMailboxUsageMailboxCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetMailboxUsageMailboxCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetMailboxUsageMailboxCountsRequest instance
     */
    public IReportRootGetMailboxUsageMailboxCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetMailboxUsageMailboxCountsRequest request = new ReportRootGetMailboxUsageMailboxCountsRequest(
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
