// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRowsRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsRowsRequest;

/**
 * The class for the Base Workbook Functions Rows Request Builder.
 */
public class BaseWorkbookFunctionsRowsRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRows
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param array the array
     */
    public BaseWorkbookFunctionsRowsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement array) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("array", array);
    }

    /**
     * Creates the IWorkbookFunctionsRowsRequest
     *
     * @return the IWorkbookFunctionsRowsRequest instance
     */
    public IWorkbookFunctionsRowsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsRowsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRowsRequest instance
     */
    public IWorkbookFunctionsRowsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsRowsRequest request = new WorkbookFunctionsRowsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("array")) {
            request.body.array = getParameter("array");
        }

        return request;
    }
}
