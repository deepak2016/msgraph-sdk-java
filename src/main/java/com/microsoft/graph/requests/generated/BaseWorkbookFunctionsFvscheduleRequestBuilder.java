// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsFvscheduleRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsFvscheduleRequest;

/**
 * The class for the Base Workbook Functions Fvschedule Request Builder.
 */
public class BaseWorkbookFunctionsFvscheduleRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFvschedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param principal the principal
     * @param schedule the schedule
     */
    public BaseWorkbookFunctionsFvscheduleRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement principal, final com.google.gson.JsonElement schedule) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("principal", principal);
        bodyParams.put("schedule", schedule);
    }

    /**
     * Creates the IWorkbookFunctionsFvscheduleRequest
     *
     * @return the IWorkbookFunctionsFvscheduleRequest instance
     */
    public IWorkbookFunctionsFvscheduleRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsFvscheduleRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFvscheduleRequest instance
     */
    public IWorkbookFunctionsFvscheduleRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsFvscheduleRequest request = new WorkbookFunctionsFvscheduleRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("principal")) {
            request.body.principal = getParameter("principal");
        }

        if (hasParameter("schedule")) {
            request.body.schedule = getParameter("schedule");
        }

        return request;
    }
}
