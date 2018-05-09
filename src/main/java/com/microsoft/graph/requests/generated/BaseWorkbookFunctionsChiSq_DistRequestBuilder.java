// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsChiSq_DistRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsChiSq_DistRequest;

/**
 * The class for the Base Workbook Functions Chi Sq_Dist Request Builder.
 */
public class BaseWorkbookFunctionsChiSq_DistRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsChiSq_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param degFreedom the degFreedom
     * @param cumulative the cumulative
     */
    public BaseWorkbookFunctionsChiSq_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement degFreedom, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("x", x);
        bodyParams.put("degFreedom", degFreedom);
        bodyParams.put("cumulative", cumulative);
    }

    /**
     * Creates the IWorkbookFunctionsChiSq_DistRequest
     *
     * @return the IWorkbookFunctionsChiSq_DistRequest instance
     */
    public IWorkbookFunctionsChiSq_DistRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsChiSq_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsChiSq_DistRequest instance
     */
    public IWorkbookFunctionsChiSq_DistRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsChiSq_DistRequest request = new WorkbookFunctionsChiSq_DistRequest(
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

        if (hasParameter("cumulative")) {
            request.body.cumulative = getParameter("cumulative");
        }

        return request;
    }
}
