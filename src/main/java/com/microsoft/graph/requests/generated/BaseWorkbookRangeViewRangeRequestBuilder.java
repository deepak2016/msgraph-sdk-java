// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeViewRangeRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeViewRangeRequest;

/**
 * The class for the Base Workbook Range View Range Request Builder.
 */
public class BaseWorkbookRangeViewRangeRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeViewRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookRangeViewRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookRangeViewRangeRequest
     *
     * @return the IWorkbookRangeViewRangeRequest instance
     */
    public IWorkbookRangeViewRangeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeViewRangeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeViewRangeRequest instance
     */
    public IWorkbookRangeViewRangeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeViewRangeRequest request = new WorkbookRangeViewRangeRequest(
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
