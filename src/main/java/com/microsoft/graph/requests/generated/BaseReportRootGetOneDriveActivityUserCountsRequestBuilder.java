// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveActivityUserCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveActivityUserCountsRequest;

/**
 * The class for the Base Report Root Get One Drive Activity User Counts Request Builder.
 */
public class BaseReportRootGetOneDriveActivityUserCountsRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetOneDriveActivityUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetOneDriveActivityUserCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetOneDriveActivityUserCountsRequest
     *
     * @return the IReportRootGetOneDriveActivityUserCountsRequest instance
     */
    public IReportRootGetOneDriveActivityUserCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetOneDriveActivityUserCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOneDriveActivityUserCountsRequest instance
     */
    public IReportRootGetOneDriveActivityUserCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetOneDriveActivityUserCountsRequest request = new ReportRootGetOneDriveActivityUserCountsRequest(
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
