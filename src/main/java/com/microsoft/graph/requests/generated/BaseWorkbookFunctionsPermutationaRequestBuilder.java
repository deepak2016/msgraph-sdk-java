// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPermutationaRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsPermutationaRequest;

/**
 * The class for the Base Workbook Functions Permutationa Request Builder.
 */
public class BaseWorkbookFunctionsPermutationaRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPermutationa
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param numberChosen the numberChosen
     */
    public BaseWorkbookFunctionsPermutationaRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement numberChosen) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("numberChosen", numberChosen);
    }

    /**
     * Creates the IWorkbookFunctionsPermutationaRequest
     *
     * @return the IWorkbookFunctionsPermutationaRequest instance
     */
    public IWorkbookFunctionsPermutationaRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsPermutationaRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPermutationaRequest instance
     */
    public IWorkbookFunctionsPermutationaRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsPermutationaRequest request = new WorkbookFunctionsPermutationaRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("numberChosen")) {
            request.body.numberChosen = getParameter("numberChosen");
        }

        return request;
    }
}
