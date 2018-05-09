// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCosRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsCosRequest;

/**
 * The class for the Base Workbook Functions Cos Request Builder.
 */
public class BaseWorkbookFunctionsCosRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCos
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     */
    public BaseWorkbookFunctionsCosRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
    }

    /**
     * Creates the IWorkbookFunctionsCosRequest
     *
     * @return the IWorkbookFunctionsCosRequest instance
     */
    public IWorkbookFunctionsCosRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsCosRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCosRequest instance
     */
    public IWorkbookFunctionsCosRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsCosRequest request = new WorkbookFunctionsCosRequest(
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
