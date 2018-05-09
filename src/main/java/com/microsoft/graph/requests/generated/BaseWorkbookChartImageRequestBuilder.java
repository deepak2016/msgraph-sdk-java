// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookChartImageRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartImageRequest;

/**
 * The class for the Base Workbook Chart Image Request Builder.
 */
public class BaseWorkbookChartImageRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookChartImage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookChartImageRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this WorkbookChartImage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param width the width
     */
    public BaseWorkbookChartImageRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer width) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("width", width));
    }
    /**
     * The request builder for this WorkbookChartImage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param width the width
     * @param height the height
     */
    public BaseWorkbookChartImageRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer width, final Integer height) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("width", width));
        functionOptions.add(new FunctionOption("height", height));
    }
    /**
     * The request builder for this WorkbookChartImage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param width the width
     * @param height the height
     * @param fittingMode the fittingMode
     */
    public BaseWorkbookChartImageRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer width, final Integer height, final String fittingMode) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("width", width));
        functionOptions.add(new FunctionOption("height", height));
        functionOptions.add(new FunctionOption("fittingMode", fittingMode));
    }

    /**
     * Creates the IWorkbookChartImageRequest
     *
     * @return the IWorkbookChartImageRequest instance
     */
    public IWorkbookChartImageRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookChartImageRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartImageRequest instance
     */
    public IWorkbookChartImageRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookChartImageRequest request = new WorkbookChartImageRequest(
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
