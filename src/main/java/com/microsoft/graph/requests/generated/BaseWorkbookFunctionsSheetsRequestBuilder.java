// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsSheetsRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsSheetsRequest;

/**
 * The class for the Base Workbook Functions Sheets Request Builder.
 */
public class BaseWorkbookFunctionsSheetsRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsSheets
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param reference the reference
     */
    public BaseWorkbookFunctionsSheetsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement reference) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("reference", reference);
    }

    /**
     * Creates the IWorkbookFunctionsSheetsRequest
     *
     * @return the IWorkbookFunctionsSheetsRequest instance
     */
    public IWorkbookFunctionsSheetsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsSheetsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsSheetsRequest instance
     */
    public IWorkbookFunctionsSheetsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsSheetsRequest request = new WorkbookFunctionsSheetsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("reference")) {
            request.body.reference = getParameter("reference");
        }

        return request;
    }
}
