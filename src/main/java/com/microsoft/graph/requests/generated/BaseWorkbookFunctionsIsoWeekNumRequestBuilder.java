// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsIsoWeekNumRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsIsoWeekNumRequest;

/**
 * The class for the Base Workbook Functions Iso Week Num Request Builder.
 */
public class BaseWorkbookFunctionsIsoWeekNumRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsIsoWeekNum
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param date the date
     */
    public BaseWorkbookFunctionsIsoWeekNumRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement date) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("date", date);
    }

    /**
     * Creates the IWorkbookFunctionsIsoWeekNumRequest
     *
     * @return the IWorkbookFunctionsIsoWeekNumRequest instance
     */
    public IWorkbookFunctionsIsoWeekNumRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsIsoWeekNumRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIsoWeekNumRequest instance
     */
    public IWorkbookFunctionsIsoWeekNumRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsIsoWeekNumRequest request = new WorkbookFunctionsIsoWeekNumRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("date")) {
            request.body.date = getParameter("date");
        }

        return request;
    }
}
