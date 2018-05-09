// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBeta_DistRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsBeta_DistRequest;

/**
 * The class for the Base Workbook Functions Beta_Dist Request Builder.
 */
public class BaseWorkbookFunctionsBeta_DistRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBeta_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param alpha the alpha
     * @param beta the beta
     * @param cumulative the cumulative
     * @param a the a
     * @param b the b
     */
    public BaseWorkbookFunctionsBeta_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement alpha, final com.google.gson.JsonElement beta, final com.google.gson.JsonElement cumulative, final com.google.gson.JsonElement a, final com.google.gson.JsonElement b) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("x", x);
        bodyParams.put("alpha", alpha);
        bodyParams.put("beta", beta);
        bodyParams.put("cumulative", cumulative);
        bodyParams.put("a", a);
        bodyParams.put("b", b);
    }

    /**
     * Creates the IWorkbookFunctionsBeta_DistRequest
     *
     * @return the IWorkbookFunctionsBeta_DistRequest instance
     */
    public IWorkbookFunctionsBeta_DistRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBeta_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBeta_DistRequest instance
     */
    public IWorkbookFunctionsBeta_DistRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsBeta_DistRequest request = new WorkbookFunctionsBeta_DistRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("x")) {
            request.body.x = getParameter("x");
        }

        if (hasParameter("alpha")) {
            request.body.alpha = getParameter("alpha");
        }

        if (hasParameter("beta")) {
            request.body.beta = getParameter("beta");
        }

        if (hasParameter("cumulative")) {
            request.body.cumulative = getParameter("cumulative");
        }

        if (hasParameter("a")) {
            request.body.a = getParameter("a");
        }

        if (hasParameter("b")) {
            request.body.b = getParameter("b");
        }

        return request;
    }
}
