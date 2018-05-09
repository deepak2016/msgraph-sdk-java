// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNetworkDays_IntlRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsNetworkDays_IntlRequest;

/**
 * The class for the Base Workbook Functions Network Days_Intl Request Builder.
 */
public class BaseWorkbookFunctionsNetworkDays_IntlRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNetworkDays_Intl
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param startDate the startDate
     * @param endDate the endDate
     * @param weekend the weekend
     * @param holidays the holidays
     */
    public BaseWorkbookFunctionsNetworkDays_IntlRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement startDate, final com.google.gson.JsonElement endDate, final com.google.gson.JsonElement weekend, final com.google.gson.JsonElement holidays) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("startDate", startDate);
        bodyParams.put("endDate", endDate);
        bodyParams.put("weekend", weekend);
        bodyParams.put("holidays", holidays);
    }

    /**
     * Creates the IWorkbookFunctionsNetworkDays_IntlRequest
     *
     * @return the IWorkbookFunctionsNetworkDays_IntlRequest instance
     */
    public IWorkbookFunctionsNetworkDays_IntlRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsNetworkDays_IntlRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNetworkDays_IntlRequest instance
     */
    public IWorkbookFunctionsNetworkDays_IntlRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsNetworkDays_IntlRequest request = new WorkbookFunctionsNetworkDays_IntlRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("startDate")) {
            request.body.startDate = getParameter("startDate");
        }

        if (hasParameter("endDate")) {
            request.body.endDate = getParameter("endDate");
        }

        if (hasParameter("weekend")) {
            request.body.weekend = getParameter("weekend");
        }

        if (hasParameter("holidays")) {
            request.body.holidays = getParameter("holidays");
        }

        return request;
    }
}
