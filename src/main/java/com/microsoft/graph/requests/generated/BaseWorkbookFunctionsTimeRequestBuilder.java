// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsTimeRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsTimeRequest;

/**
 * The class for the Base Workbook Functions Time Request Builder.
 */
public class BaseWorkbookFunctionsTimeRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsTime
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param hour the hour
     * @param minute the minute
     * @param second the second
     */
    public BaseWorkbookFunctionsTimeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement hour, final com.google.gson.JsonElement minute, final com.google.gson.JsonElement second) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("hour", hour);
        bodyParams.put("minute", minute);
        bodyParams.put("second", second);
    }

    /**
     * Creates the IWorkbookFunctionsTimeRequest
     *
     * @return the IWorkbookFunctionsTimeRequest instance
     */
    public IWorkbookFunctionsTimeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsTimeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsTimeRequest instance
     */
    public IWorkbookFunctionsTimeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsTimeRequest request = new WorkbookFunctionsTimeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("hour")) {
            request.body.hour = getParameter("hour");
        }

        if (hasParameter("minute")) {
            request.body.minute = getParameter("minute");
        }

        if (hasParameter("second")) {
            request.body.second = getParameter("second");
        }

        return request;
    }
}
