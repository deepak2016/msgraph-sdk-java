// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsUsdollarRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsUsdollarRequest;

/**
 * The class for the Base Workbook Functions Usdollar Request Builder.
 */
public class BaseWorkbookFunctionsUsdollarRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsUsdollar
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param decimals the decimals
     */
    public BaseWorkbookFunctionsUsdollarRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement decimals) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("decimals", decimals);
    }

    /**
     * Creates the IWorkbookFunctionsUsdollarRequest
     *
     * @return the IWorkbookFunctionsUsdollarRequest instance
     */
    public IWorkbookFunctionsUsdollarRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsUsdollarRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsUsdollarRequest instance
     */
    public IWorkbookFunctionsUsdollarRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsUsdollarRequest request = new WorkbookFunctionsUsdollarRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("decimals")) {
            request.body.decimals = getParameter("decimals");
        }

        return request;
    }
}
