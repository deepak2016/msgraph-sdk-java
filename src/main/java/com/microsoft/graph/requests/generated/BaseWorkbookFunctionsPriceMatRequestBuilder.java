// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPriceMatRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsPriceMatRequest;

/**
 * The class for the Base Workbook Functions Price Mat Request Builder.
 */
public class BaseWorkbookFunctionsPriceMatRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPriceMat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param settlement the settlement
     * @param maturity the maturity
     * @param issue the issue
     * @param rate the rate
     * @param yld the yld
     * @param basis the basis
     */
    public BaseWorkbookFunctionsPriceMatRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement issue, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement yld, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("settlement", settlement);
        bodyParams.put("maturity", maturity);
        bodyParams.put("issue", issue);
        bodyParams.put("rate", rate);
        bodyParams.put("yld", yld);
        bodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsPriceMatRequest
     *
     * @return the IWorkbookFunctionsPriceMatRequest instance
     */
    public IWorkbookFunctionsPriceMatRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsPriceMatRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPriceMatRequest instance
     */
    public IWorkbookFunctionsPriceMatRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsPriceMatRequest request = new WorkbookFunctionsPriceMatRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("settlement")) {
            request.body.settlement = getParameter("settlement");
        }

        if (hasParameter("maturity")) {
            request.body.maturity = getParameter("maturity");
        }

        if (hasParameter("issue")) {
            request.body.issue = getParameter("issue");
        }

        if (hasParameter("rate")) {
            request.body.rate = getParameter("rate");
        }

        if (hasParameter("yld")) {
            request.body.yld = getParameter("yld");
        }

        if (hasParameter("basis")) {
            request.body.basis = getParameter("basis");
        }

        return request;
    }
}
