// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsAmorLincRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsAmorLincRequest;

/**
 * The class for the Base Workbook Functions Amor Linc Request Builder.
 */
public class BaseWorkbookFunctionsAmorLincRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAmorLinc
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param cost the cost
     * @param datePurchased the datePurchased
     * @param firstPeriod the firstPeriod
     * @param salvage the salvage
     * @param period the period
     * @param rate the rate
     * @param basis the basis
     */
    public BaseWorkbookFunctionsAmorLincRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement cost, final com.google.gson.JsonElement datePurchased, final com.google.gson.JsonElement firstPeriod, final com.google.gson.JsonElement salvage, final com.google.gson.JsonElement period, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("cost", cost);
        bodyParams.put("datePurchased", datePurchased);
        bodyParams.put("firstPeriod", firstPeriod);
        bodyParams.put("salvage", salvage);
        bodyParams.put("period", period);
        bodyParams.put("rate", rate);
        bodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsAmorLincRequest
     *
     * @return the IWorkbookFunctionsAmorLincRequest instance
     */
    public IWorkbookFunctionsAmorLincRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsAmorLincRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsAmorLincRequest instance
     */
    public IWorkbookFunctionsAmorLincRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsAmorLincRequest request = new WorkbookFunctionsAmorLincRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("cost")) {
            request.body.cost = getParameter("cost");
        }

        if (hasParameter("datePurchased")) {
            request.body.datePurchased = getParameter("datePurchased");
        }

        if (hasParameter("firstPeriod")) {
            request.body.firstPeriod = getParameter("firstPeriod");
        }

        if (hasParameter("salvage")) {
            request.body.salvage = getParameter("salvage");
        }

        if (hasParameter("period")) {
            request.body.period = getParameter("period");
        }

        if (hasParameter("rate")) {
            request.body.rate = getParameter("rate");
        }

        if (hasParameter("basis")) {
            request.body.basis = getParameter("basis");
        }

        return request;
    }
}
