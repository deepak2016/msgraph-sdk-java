// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsUnicharRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsUnicharRequest;

/**
 * The class for the Base Workbook Functions Unichar Request Builder.
 */
public class BaseWorkbookFunctionsUnicharRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsUnichar
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     */
    public BaseWorkbookFunctionsUnicharRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
    }

    /**
     * Creates the IWorkbookFunctionsUnicharRequest
     *
     * @return the IWorkbookFunctionsUnicharRequest instance
     */
    public IWorkbookFunctionsUnicharRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsUnicharRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsUnicharRequest instance
     */
    public IWorkbookFunctionsUnicharRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsUnicharRequest request = new WorkbookFunctionsUnicharRequest(
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
