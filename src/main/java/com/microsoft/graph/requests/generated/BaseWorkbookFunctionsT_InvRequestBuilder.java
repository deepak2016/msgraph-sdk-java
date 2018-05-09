// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsT_InvRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsT_InvRequest;

/**
 * The class for the Base Workbook Functions T_Inv Request Builder.
 */
public class BaseWorkbookFunctionsT_InvRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsT_Inv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param probability the probability
     * @param degFreedom the degFreedom
     */
    public BaseWorkbookFunctionsT_InvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement probability, final com.google.gson.JsonElement degFreedom) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("probability", probability);
        bodyParams.put("degFreedom", degFreedom);
    }

    /**
     * Creates the IWorkbookFunctionsT_InvRequest
     *
     * @return the IWorkbookFunctionsT_InvRequest instance
     */
    public IWorkbookFunctionsT_InvRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsT_InvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsT_InvRequest instance
     */
    public IWorkbookFunctionsT_InvRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsT_InvRequest request = new WorkbookFunctionsT_InvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("probability")) {
            request.body.probability = getParameter("probability");
        }

        if (hasParameter("degFreedom")) {
            request.body.degFreedom = getParameter("degFreedom");
        }

        return request;
    }
}
