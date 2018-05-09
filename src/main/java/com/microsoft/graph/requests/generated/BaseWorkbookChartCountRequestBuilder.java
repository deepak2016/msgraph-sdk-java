// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookChartCountRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartCountRequest;

/**
 * The class for the Base Workbook Chart Count Request Builder.
 */
public class BaseWorkbookChartCountRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookChartCount
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookChartCountRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookChartCountRequest
     *
     * @return the IWorkbookChartCountRequest instance
     */
    public IWorkbookChartCountRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookChartCountRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartCountRequest instance
     */
    public IWorkbookChartCountRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookChartCountRequest request = new WorkbookChartCountRequest(
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
