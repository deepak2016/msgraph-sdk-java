// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDaysRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDaysRequest;

/**
 * The class for the Base Workbook Functions Days Request Builder.
 */
public class BaseWorkbookFunctionsDaysRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDays
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param endDate the endDate
     * @param startDate the startDate
     */
    public BaseWorkbookFunctionsDaysRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement endDate, final com.google.gson.JsonElement startDate) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("endDate", endDate);
        bodyParams.put("startDate", startDate);
    }

    /**
     * Creates the IWorkbookFunctionsDaysRequest
     *
     * @return the IWorkbookFunctionsDaysRequest instance
     */
    public IWorkbookFunctionsDaysRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDaysRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDaysRequest instance
     */
    public IWorkbookFunctionsDaysRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsDaysRequest request = new WorkbookFunctionsDaysRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("endDate")) {
            request.body.endDate = getParameter("endDate");
        }

        if (hasParameter("startDate")) {
            request.body.startDate = getParameter("startDate");
        }

        return request;
    }
}
