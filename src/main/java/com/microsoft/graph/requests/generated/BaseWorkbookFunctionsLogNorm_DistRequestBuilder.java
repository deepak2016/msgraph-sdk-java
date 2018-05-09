// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsLogNorm_DistRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsLogNorm_DistRequest;

/**
 * The class for the Base Workbook Functions Log Norm_Dist Request Builder.
 */
public class BaseWorkbookFunctionsLogNorm_DistRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsLogNorm_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param mean the mean
     * @param standardDev the standardDev
     * @param cumulative the cumulative
     */
    public BaseWorkbookFunctionsLogNorm_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement mean, final com.google.gson.JsonElement standardDev, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("x", x);
        bodyParams.put("mean", mean);
        bodyParams.put("standardDev", standardDev);
        bodyParams.put("cumulative", cumulative);
    }

    /**
     * Creates the IWorkbookFunctionsLogNorm_DistRequest
     *
     * @return the IWorkbookFunctionsLogNorm_DistRequest instance
     */
    public IWorkbookFunctionsLogNorm_DistRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsLogNorm_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsLogNorm_DistRequest instance
     */
    public IWorkbookFunctionsLogNorm_DistRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsLogNorm_DistRequest request = new WorkbookFunctionsLogNorm_DistRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("x")) {
            request.body.x = getParameter("x");
        }

        if (hasParameter("mean")) {
            request.body.mean = getParameter("mean");
        }

        if (hasParameter("standardDev")) {
            request.body.standardDev = getParameter("standardDev");
        }

        if (hasParameter("cumulative")) {
            request.body.cumulative = getParameter("cumulative");
        }

        return request;
    }
}
