// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationsUserDetailRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationsUserDetailRequest;

/**
 * The class for the Base Report Root Get Office365Activations User Detail Request Builder.
 */
public class BaseReportRootGetOffice365ActivationsUserDetailRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetOffice365ActivationsUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseReportRootGetOffice365ActivationsUserDetailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IReportRootGetOffice365ActivationsUserDetailRequest
     *
     * @return the IReportRootGetOffice365ActivationsUserDetailRequest instance
     */
    public IReportRootGetOffice365ActivationsUserDetailRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetOffice365ActivationsUserDetailRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOffice365ActivationsUserDetailRequest instance
     */
    public IReportRootGetOffice365ActivationsUserDetailRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetOffice365ActivationsUserDetailRequest request = new ReportRootGetOffice365ActivationsUserDetailRequest(
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
