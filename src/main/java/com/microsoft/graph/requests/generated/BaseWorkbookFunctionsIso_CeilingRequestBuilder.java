// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsIso_CeilingRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsIso_CeilingRequest;

/**
 * The class for the Base Workbook Functions Iso_Ceiling Request Builder.
 */
public class BaseWorkbookFunctionsIso_CeilingRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsIso_Ceiling
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param significance the significance
     */
    public BaseWorkbookFunctionsIso_CeilingRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement significance) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("significance", significance);
    }

    /**
     * Creates the IWorkbookFunctionsIso_CeilingRequest
     *
     * @return the IWorkbookFunctionsIso_CeilingRequest instance
     */
    public IWorkbookFunctionsIso_CeilingRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsIso_CeilingRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIso_CeilingRequest instance
     */
    public IWorkbookFunctionsIso_CeilingRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsIso_CeilingRequest request = new WorkbookFunctionsIso_CeilingRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("significance")) {
            request.body.significance = getParameter("significance");
        }

        return request;
    }
}
