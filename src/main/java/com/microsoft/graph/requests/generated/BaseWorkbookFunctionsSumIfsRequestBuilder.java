// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsSumIfsRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsSumIfsRequest;

/**
 * The class for the Base Workbook Functions Sum Ifs Request Builder.
 */
public class BaseWorkbookFunctionsSumIfsRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsSumIfs
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param sumRange the sumRange
     * @param values the values
     */
    public BaseWorkbookFunctionsSumIfsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement sumRange, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("sumRange", sumRange);
        bodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsSumIfsRequest
     *
     * @return the IWorkbookFunctionsSumIfsRequest instance
     */
    public IWorkbookFunctionsSumIfsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsSumIfsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsSumIfsRequest instance
     */
    public IWorkbookFunctionsSumIfsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsSumIfsRequest request = new WorkbookFunctionsSumIfsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("sumRange")) {
            request.body.sumRange = getParameter("sumRange");
        }

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        return request;
    }
}
