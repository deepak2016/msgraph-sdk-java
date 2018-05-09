// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsModRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsModRequest;

/**
 * The class for the Base Workbook Functions Mod Request Builder.
 */
public class BaseWorkbookFunctionsModRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsMod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param divisor the divisor
     */
    public BaseWorkbookFunctionsModRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement divisor) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("divisor", divisor);
    }

    /**
     * Creates the IWorkbookFunctionsModRequest
     *
     * @return the IWorkbookFunctionsModRequest instance
     */
    public IWorkbookFunctionsModRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsModRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsModRequest instance
     */
    public IWorkbookFunctionsModRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsModRequest request = new WorkbookFunctionsModRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("divisor")) {
            request.body.divisor = getParameter("divisor");
        }

        return request;
    }
}
