// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsSqrtPiRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsSqrtPiRequest;

/**
 * The class for the Base Workbook Functions Sqrt Pi Request Builder.
 */
public class BaseWorkbookFunctionsSqrtPiRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsSqrtPi
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     */
    public BaseWorkbookFunctionsSqrtPiRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
    }

    /**
     * Creates the IWorkbookFunctionsSqrtPiRequest
     *
     * @return the IWorkbookFunctionsSqrtPiRequest instance
     */
    public IWorkbookFunctionsSqrtPiRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsSqrtPiRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsSqrtPiRequest instance
     */
    public IWorkbookFunctionsSqrtPiRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsSqrtPiRequest request = new WorkbookFunctionsSqrtPiRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        return request;
    }
}
