// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsVdbRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsVdbRequest;

/**
 * The class for the Base Workbook Functions Vdb Request Builder.
 */
public class BaseWorkbookFunctionsVdbRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsVdb
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param cost the cost
     * @param salvage the salvage
     * @param life the life
     * @param startPeriod the startPeriod
     * @param endPeriod the endPeriod
     * @param factor the factor
     * @param noSwitch the noSwitch
     */
    public BaseWorkbookFunctionsVdbRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement cost, final com.google.gson.JsonElement salvage, final com.google.gson.JsonElement life, final com.google.gson.JsonElement startPeriod, final com.google.gson.JsonElement endPeriod, final com.google.gson.JsonElement factor, final com.google.gson.JsonElement noSwitch) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("cost", cost);
        bodyParams.put("salvage", salvage);
        bodyParams.put("life", life);
        bodyParams.put("startPeriod", startPeriod);
        bodyParams.put("endPeriod", endPeriod);
        bodyParams.put("factor", factor);
        bodyParams.put("noSwitch", noSwitch);
    }

    /**
     * Creates the IWorkbookFunctionsVdbRequest
     *
     * @return the IWorkbookFunctionsVdbRequest instance
     */
    public IWorkbookFunctionsVdbRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsVdbRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsVdbRequest instance
     */
    public IWorkbookFunctionsVdbRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsVdbRequest request = new WorkbookFunctionsVdbRequest(
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

        if (hasParameter("startPeriod")) {
            request.body.startPeriod = getParameter("startPeriod");
        }

        if (hasParameter("endPeriod")) {
            request.body.endPeriod = getParameter("endPeriod");
        }

        if (hasParameter("factor")) {
            request.body.factor = getParameter("factor");
        }

        if (hasParameter("noSwitch")) {
            request.body.noSwitch = getParameter("noSwitch");
        }

        return request;
    }
}
