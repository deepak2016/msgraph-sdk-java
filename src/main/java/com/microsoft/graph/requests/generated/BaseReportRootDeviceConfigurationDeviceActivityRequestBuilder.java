// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IReportRootDeviceConfigurationDeviceActivityRequest;
import com.microsoft.graph.requests.extensions.ReportRootDeviceConfigurationDeviceActivityRequest;

/**
 * The class for the Base Report Root Device Configuration Device Activity Request Builder.
 */
public class BaseReportRootDeviceConfigurationDeviceActivityRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootDeviceConfigurationDeviceActivity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseReportRootDeviceConfigurationDeviceActivityRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IReportRootDeviceConfigurationDeviceActivityRequest
     *
     * @return the IReportRootDeviceConfigurationDeviceActivityRequest instance
     */
    public IReportRootDeviceConfigurationDeviceActivityRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootDeviceConfigurationDeviceActivityRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootDeviceConfigurationDeviceActivityRequest instance
     */
    public IReportRootDeviceConfigurationDeviceActivityRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootDeviceConfigurationDeviceActivityRequest request = new ReportRootDeviceConfigurationDeviceActivityRequest(
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
