// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDdbRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDdbRequest;

/**
 * The class for the Base Workbook Functions Ddb Request Builder.
 */
public class BaseWorkbookFunctionsDdbRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDdb
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param cost the cost
     * @param salvage the salvage
     * @param life the life
     * @param period the period
     * @param factor the factor
     */
    public BaseWorkbookFunctionsDdbRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement cost, final com.google.gson.JsonElement salvage, final com.google.gson.JsonElement life, final com.google.gson.JsonElement period, final com.google.gson.JsonElement factor) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("cost", cost);
        bodyParams.put("salvage", salvage);
        bodyParams.put("life", life);
        bodyParams.put("period", period);
        bodyParams.put("factor", factor);
    }

    /**
     * Creates the IWorkbookFunctionsDdbRequest
     *
     * @return the IWorkbookFunctionsDdbRequest instance
     */
    public IWorkbookFunctionsDdbRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDdbRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDdbRequest instance
     */
    public IWorkbookFunctionsDdbRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsDdbRequest request = new WorkbookFunctionsDdbRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("cost")) {
            request.body.cost = getParameter("cost");
        }

        if (hasParameter("salvage")) {
            request.body.salvage = getParameter("salvage");
        }

        if (hasParameter("life")) {
            request.body.life = getParameter("life");
        }

        if (hasParameter("period")) {
            request.body.period = getParameter("period");
        }

        if (hasParameter("factor")) {
            request.body.factor = getParameter("factor");
        }

        return request;
    }
}
