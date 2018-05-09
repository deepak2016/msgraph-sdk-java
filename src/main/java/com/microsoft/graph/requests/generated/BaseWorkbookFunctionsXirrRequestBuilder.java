// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsXirrRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsXirrRequest;

/**
 * The class for the Base Workbook Functions Xirr Request Builder.
 */
public class BaseWorkbookFunctionsXirrRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsXirr
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param values the values
     * @param dates the dates
     * @param guess the guess
     */
    public BaseWorkbookFunctionsXirrRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement values, final com.google.gson.JsonElement dates, final com.google.gson.JsonElement guess) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("values", values);
        bodyParams.put("dates", dates);
        bodyParams.put("guess", guess);
    }

    /**
     * Creates the IWorkbookFunctionsXirrRequest
     *
     * @return the IWorkbookFunctionsXirrRequest instance
     */
    public IWorkbookFunctionsXirrRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsXirrRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsXirrRequest instance
     */
    public IWorkbookFunctionsXirrRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsXirrRequest request = new WorkbookFunctionsXirrRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        if (hasParameter("dates")) {
            request.body.dates = getParameter("dates");
        }

        if (hasParameter("guess")) {
            request.body.guess = getParameter("guess");
        }

        return request;
    }
}
