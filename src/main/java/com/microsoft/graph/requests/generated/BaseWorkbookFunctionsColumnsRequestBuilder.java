// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsColumnsRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsColumnsRequest;

/**
 * The class for the Base Workbook Functions Columns Request Builder.
 */
public class BaseWorkbookFunctionsColumnsRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsColumns
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param array the array
     */
    public BaseWorkbookFunctionsColumnsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement array) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("array", array);
    }

    /**
     * Creates the IWorkbookFunctionsColumnsRequest
     *
     * @return the IWorkbookFunctionsColumnsRequest instance
     */
    public IWorkbookFunctionsColumnsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsColumnsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsColumnsRequest instance
     */
    public IWorkbookFunctionsColumnsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsColumnsRequest request = new WorkbookFunctionsColumnsRequest(
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
