// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsAcosRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsAcosRequest;

/**
 * The class for the Base Workbook Functions Acos Request Builder.
 */
public class BaseWorkbookFunctionsAcosRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAcos
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     */
    public BaseWorkbookFunctionsAcosRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
    }

    /**
     * Creates the IWorkbookFunctionsAcosRequest
     *
     * @return the IWorkbookFunctionsAcosRequest instance
     */
    public IWorkbookFunctionsAcosRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsAcosRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsAcosRequest instance
     */
    public IWorkbookFunctionsAcosRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsAcosRequest request = new WorkbookFunctionsAcosRequest(
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
