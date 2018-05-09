// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookTableDataBodyRangeRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableDataBodyRangeRequest;

/**
 * The class for the Base Workbook Table Data Body Range Request Builder.
 */
public class BaseWorkbookTableDataBodyRangeRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookTableDataBodyRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookTableDataBodyRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookTableDataBodyRangeRequest
     *
     * @return the IWorkbookTableDataBodyRangeRequest instance
     */
    public IWorkbookTableDataBodyRangeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableDataBodyRangeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableDataBodyRangeRequest instance
     */
    public IWorkbookTableDataBodyRangeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookTableDataBodyRangeRequest request = new WorkbookTableDataBodyRangeRequest(
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
