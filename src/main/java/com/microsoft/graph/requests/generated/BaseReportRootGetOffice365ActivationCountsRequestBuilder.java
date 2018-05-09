// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationCountsRequest;

/**
 * The class for the Base Report Root Get Office365Activation Counts Request Builder.
 */
public class BaseReportRootGetOffice365ActivationCountsRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetOffice365ActivationCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseReportRootGetOffice365ActivationCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IReportRootGetOffice365ActivationCountsRequest
     *
     * @return the IReportRootGetOffice365ActivationCountsRequest instance
     */
    public IReportRootGetOffice365ActivationCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetOffice365ActivationCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOffice365ActivationCountsRequest instance
     */
    public IReportRootGetOffice365ActivationCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetOffice365ActivationCountsRequest request = new ReportRootGetOffice365ActivationCountsRequest(
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
