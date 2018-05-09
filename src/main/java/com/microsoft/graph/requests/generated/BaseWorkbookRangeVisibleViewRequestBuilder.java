// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeVisibleViewRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeVisibleViewRequest;

/**
 * The class for the Base Workbook Range Visible View Request Builder.
 */
public class BaseWorkbookRangeVisibleViewRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeVisibleView
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookRangeVisibleViewRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookRangeVisibleViewRequest
     *
     * @return the IWorkbookRangeVisibleViewRequest instance
     */
    public IWorkbookRangeVisibleViewRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeVisibleViewRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeVisibleViewRequest instance
     */
    public IWorkbookRangeVisibleViewRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeVisibleViewRequest request = new WorkbookRangeVisibleViewRequest(
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
