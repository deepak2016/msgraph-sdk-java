// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesItemAtRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartSeriesItemAtRequest;

/**
 * The class for the Base Workbook Chart Series Item At Request Builder.
 */
public class BaseWorkbookChartSeriesItemAtRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookChartSeriesItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param index the index
     */
    public BaseWorkbookChartSeriesItemAtRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer index) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("index", index));
    }

    /**
     * Creates the IWorkbookChartSeriesItemAtRequest
     *
     * @return the IWorkbookChartSeriesItemAtRequest instance
     */
    public IWorkbookChartSeriesItemAtRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookChartSeriesItemAtRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartSeriesItemAtRequest instance
     */
    public IWorkbookChartSeriesItemAtRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookChartSeriesItemAtRequest request = new WorkbookChartSeriesItemAtRequest(
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
