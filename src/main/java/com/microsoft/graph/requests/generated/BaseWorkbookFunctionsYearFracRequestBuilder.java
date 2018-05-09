// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsYearFracRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsYearFracRequest;

/**
 * The class for the Base Workbook Functions Year Frac Request Builder.
 */
public class BaseWorkbookFunctionsYearFracRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsYearFrac
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param startDate the startDate
     * @param endDate the endDate
     * @param basis the basis
     */
    public BaseWorkbookFunctionsYearFracRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement startDate, final com.google.gson.JsonElement endDate, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("startDate", startDate);
        bodyParams.put("endDate", endDate);
        bodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsYearFracRequest
     *
     * @return the IWorkbookFunctionsYearFracRequest instance
     */
    public IWorkbookFunctionsYearFracRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsYearFracRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsYearFracRequest instance
     */
    public IWorkbookFunctionsYearFracRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsYearFracRequest request = new WorkbookFunctionsYearFracRequest(
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

        if (hasParameter("basis")) {
            request.body.basis = getParameter("basis");
        }

        return request;
    }
}
