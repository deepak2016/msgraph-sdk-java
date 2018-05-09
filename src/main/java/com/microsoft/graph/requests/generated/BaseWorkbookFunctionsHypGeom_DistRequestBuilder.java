// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsHypGeom_DistRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsHypGeom_DistRequest;

/**
 * The class for the Base Workbook Functions Hyp Geom_Dist Request Builder.
 */
public class BaseWorkbookFunctionsHypGeom_DistRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsHypGeom_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param sampleS the sampleS
     * @param numberSample the numberSample
     * @param populationS the populationS
     * @param numberPop the numberPop
     * @param cumulative the cumulative
     */
    public BaseWorkbookFunctionsHypGeom_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement sampleS, final com.google.gson.JsonElement numberSample, final com.google.gson.JsonElement populationS, final com.google.gson.JsonElement numberPop, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("sampleS", sampleS);
        bodyParams.put("numberSample", numberSample);
        bodyParams.put("populationS", populationS);
        bodyParams.put("numberPop", numberPop);
        bodyParams.put("cumulative", cumulative);
    }

    /**
     * Creates the IWorkbookFunctionsHypGeom_DistRequest
     *
     * @return the IWorkbookFunctionsHypGeom_DistRequest instance
     */
    public IWorkbookFunctionsHypGeom_DistRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsHypGeom_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsHypGeom_DistRequest instance
     */
    public IWorkbookFunctionsHypGeom_DistRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsHypGeom_DistRequest request = new WorkbookFunctionsHypGeom_DistRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("sampleS")) {
            request.body.sampleS = getParameter("sampleS");
        }

        if (hasParameter("numberSample")) {
            request.body.numberSample = getParameter("numberSample");
        }

        if (hasParameter("populationS")) {
            request.body.populationS = getParameter("populationS");
        }

        if (hasParameter("numberPop")) {
            request.body.numberPop = getParameter("numberPop");
        }

        if (hasParameter("cumulative")) {
            request.body.cumulative = getParameter("cumulative");
        }

        return request;
    }
}
