// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemRangeRequest;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemRangeRequest;

/**
 * The class for the Base Workbook Named Item Range Request Builder.
 */
public class BaseWorkbookNamedItemRangeRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookNamedItemRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookNamedItemRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookNamedItemRangeRequest
     *
     * @return the IWorkbookNamedItemRangeRequest instance
     */
    public IWorkbookNamedItemRangeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookNamedItemRangeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookNamedItemRangeRequest instance
     */
    public IWorkbookNamedItemRangeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookNamedItemRangeRequest request = new WorkbookNamedItemRangeRequest(
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
