// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsWorkDay_IntlRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsWorkDay_IntlRequest;

/**
 * The class for the Base Workbook Functions Work Day_Intl Request Builder.
 */
public class BaseWorkbookFunctionsWorkDay_IntlRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsWorkDay_Intl
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param startDate the startDate
     * @param days the days
     * @param weekend the weekend
     * @param holidays the holidays
     */
    public BaseWorkbookFunctionsWorkDay_IntlRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement startDate, final com.google.gson.JsonElement days, final com.google.gson.JsonElement weekend, final com.google.gson.JsonElement holidays) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("startDate", startDate);
        bodyParams.put("days", days);
        bodyParams.put("weekend", weekend);
        bodyParams.put("holidays", holidays);
    }

    /**
     * Creates the IWorkbookFunctionsWorkDay_IntlRequest
     *
     * @return the IWorkbookFunctionsWorkDay_IntlRequest instance
     */
    public IWorkbookFunctionsWorkDay_IntlRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsWorkDay_IntlRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsWorkDay_IntlRequest instance
     */
    public IWorkbookFunctionsWorkDay_IntlRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsWorkDay_IntlRequest request = new WorkbookFunctionsWorkDay_IntlRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("startDate")) {
            request.body.startDate = getParameter("startDate");
        }

        if (hasParameter("days")) {
            request.body.days = getParameter("days");
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
