// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityUserDetailRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointActivityUserDetailRequest;

/**
 * The class for the Base Report Root Get Share Point Activity User Detail Request Builder.
 */
public class BaseReportRootGetSharePointActivityUserDetailRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetSharePointActivityUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param date the date
     */
    public BaseReportRootGetSharePointActivityUserDetailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.microsoft.graph.models.extensions.DateOnly date) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("date", date));
    }
    /**
     * The request builder for this ReportRootGetSharePointActivityUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetSharePointActivityUserDetailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetSharePointActivityUserDetailRequest
     *
     * @return the IReportRootGetSharePointActivityUserDetailRequest instance
     */
    public IReportRootGetSharePointActivityUserDetailRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetSharePointActivityUserDetailRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSharePointActivityUserDetailRequest instance
     */
    public IReportRootGetSharePointActivityUserDetailRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetSharePointActivityUserDetailRequest request = new ReportRootGetSharePointActivityUserDetailRequest(
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
