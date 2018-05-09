// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsEoMonthRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsEoMonthRequest;

/**
 * The class for the Base Workbook Functions Eo Month Request Builder.
 */
public class BaseWorkbookFunctionsEoMonthRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsEoMonth
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param startDate the startDate
     * @param months the months
     */
    public BaseWorkbookFunctionsEoMonthRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement startDate, final com.google.gson.JsonElement months) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("startDate", startDate);
        bodyParams.put("months", months);
    }

    /**
     * Creates the IWorkbookFunctionsEoMonthRequest
     *
     * @return the IWorkbookFunctionsEoMonthRequest instance
     */
    public IWorkbookFunctionsEoMonthRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsEoMonthRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsEoMonthRequest instance
     */
    public IWorkbookFunctionsEoMonthRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsEoMonthRequest request = new WorkbookFunctionsEoMonthRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("startDate")) {
            request.body.startDate = getParameter("startDate");
        }

        if (hasParameter("months")) {
            request.body.months = getParameter("months");
        }

        return request;
    }
}
