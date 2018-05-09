// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRoundDownRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsRoundDownRequest;

/**
 * The class for the Base Workbook Functions Round Down Request Builder.
 */
public class BaseWorkbookFunctionsRoundDownRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRoundDown
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param numDigits the numDigits
     */
    public BaseWorkbookFunctionsRoundDownRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement numDigits) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("numDigits", numDigits);
    }

    /**
     * Creates the IWorkbookFunctionsRoundDownRequest
     *
     * @return the IWorkbookFunctionsRoundDownRequest instance
     */
    public IWorkbookFunctionsRoundDownRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsRoundDownRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRoundDownRequest instance
     */
    public IWorkbookFunctionsRoundDownRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsRoundDownRequest request = new WorkbookFunctionsRoundDownRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("numDigits")) {
            request.body.numDigits = getParameter("numDigits");
        }

        return request;
    }
}
