// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootDeviceConfigurationUserActivityRequest;
import com.microsoft.graph.requests.extensions.ReportRootDeviceConfigurationUserActivityRequest;

/**
 * The class for the Base Report Root Device Configuration User Activity Request Builder.
 */
public class BaseReportRootDeviceConfigurationUserActivityRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootDeviceConfigurationUserActivity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseReportRootDeviceConfigurationUserActivityRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IReportRootDeviceConfigurationUserActivityRequest
     *
     * @return the IReportRootDeviceConfigurationUserActivityRequest instance
     */
    public IReportRootDeviceConfigurationUserActivityRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootDeviceConfigurationUserActivityRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootDeviceConfigurationUserActivityRequest instance
     */
    public IReportRootDeviceConfigurationUserActivityRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootDeviceConfigurationUserActivityRequest request = new ReportRootDeviceConfigurationUserActivityRequest(
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
