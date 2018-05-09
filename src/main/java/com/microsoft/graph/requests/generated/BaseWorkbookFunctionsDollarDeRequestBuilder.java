// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDollarDeRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDollarDeRequest;

/**
 * The class for the Base Workbook Functions Dollar De Request Builder.
 */
public class BaseWorkbookFunctionsDollarDeRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDollarDe
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param fractionalDollar the fractionalDollar
     * @param fraction the fraction
     */
    public BaseWorkbookFunctionsDollarDeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement fractionalDollar, final com.google.gson.JsonElement fraction) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("fractionalDollar", fractionalDollar);
        bodyParams.put("fraction", fraction);
    }

    /**
     * Creates the IWorkbookFunctionsDollarDeRequest
     *
     * @return the IWorkbookFunctionsDollarDeRequest instance
     */
    public IWorkbookFunctionsDollarDeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDollarDeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDollarDeRequest instance
     */
    public IWorkbookFunctionsDollarDeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsDollarDeRequest request = new WorkbookFunctionsDollarDeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("fractionalDollar")) {
            request.body.fractionalDollar = getParameter("fractionalDollar");
        }

        if (hasParameter("fraction")) {
            request.body.fraction = getParameter("fraction");
        }

        return request;
    }
}
