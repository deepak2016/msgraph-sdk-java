// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsAccrIntMRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsAccrIntMRequest;

/**
 * The class for the Base Workbook Functions Accr Int MRequest Builder.
 */
public class BaseWorkbookFunctionsAccrIntMRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAccrIntM
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param issue the issue
     * @param settlement the settlement
     * @param rate the rate
     * @param par the par
     * @param basis the basis
     */
    public BaseWorkbookFunctionsAccrIntMRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement issue, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement par, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("issue", issue);
        bodyParams.put("settlement", settlement);
        bodyParams.put("rate", rate);
        bodyParams.put("par", par);
        bodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsAccrIntMRequest
     *
     * @return the IWorkbookFunctionsAccrIntMRequest instance
     */
    public IWorkbookFunctionsAccrIntMRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsAccrIntMRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsAccrIntMRequest instance
     */
    public IWorkbookFunctionsAccrIntMRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsAccrIntMRequest request = new WorkbookFunctionsAccrIntMRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("issue")) {
            request.body.issue = getParameter("issue");
        }

        if (hasParameter("settlement")) {
            request.body.settlement = getParameter("settlement");
        }

        if (hasParameter("rate")) {
            request.body.rate = getParameter("rate");
        }

        if (hasParameter("par")) {
            request.body.par = getParameter("par");
        }

        if (hasParameter("basis")) {
            request.body.basis = getParameter("basis");
        }

        return request;
    }
}
