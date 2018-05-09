// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsT_Dist_2TRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsT_Dist_2TRequest;

/**
 * The class for the Base Workbook Functions T_Dist_2TRequest Builder.
 */
public class BaseWorkbookFunctionsT_Dist_2TRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsT_Dist_2T
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param degFreedom the degFreedom
     */
    public BaseWorkbookFunctionsT_Dist_2TRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement degFreedom) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("x", x);
        bodyParams.put("degFreedom", degFreedom);
    }

    /**
     * Creates the IWorkbookFunctionsT_Dist_2TRequest
     *
     * @return the IWorkbookFunctionsT_Dist_2TRequest instance
     */
    public IWorkbookFunctionsT_Dist_2TRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsT_Dist_2TRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsT_Dist_2TRequest instance
     */
    public IWorkbookFunctionsT_Dist_2TRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsT_Dist_2TRequest request = new WorkbookFunctionsT_Dist_2TRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("x")) {
            request.body.x = getParameter("x");
        }

        if (hasParameter("degFreedom")) {
            request.body.degFreedom = getParameter("degFreedom");
        }

        return request;
    }
}
