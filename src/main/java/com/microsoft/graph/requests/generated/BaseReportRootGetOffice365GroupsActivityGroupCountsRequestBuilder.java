// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityGroupCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityGroupCountsRequest;

/**
 * The class for the Base Report Root Get Office365Groups Activity Group Counts Request Builder.
 */
public class BaseReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetOffice365GroupsActivityGroupCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetOffice365GroupsActivityGroupCountsRequest
     *
     * @return the IReportRootGetOffice365GroupsActivityGroupCountsRequest instance
     */
    public IReportRootGetOffice365GroupsActivityGroupCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetOffice365GroupsActivityGroupCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOffice365GroupsActivityGroupCountsRequest instance
     */
    public IReportRootGetOffice365GroupsActivityGroupCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetOffice365GroupsActivityGroupCountsRequest request = new ReportRootGetOffice365GroupsActivityGroupCountsRequest(
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
