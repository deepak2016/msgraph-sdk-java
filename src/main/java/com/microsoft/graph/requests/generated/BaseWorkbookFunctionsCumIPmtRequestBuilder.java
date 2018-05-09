// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCumIPmtRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsCumIPmtRequest;

/**
 * The class for the Base Workbook Functions Cum IPmt Request Builder.
 */
public class BaseWorkbookFunctionsCumIPmtRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCumIPmt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param rate the rate
     * @param nper the nper
     * @param pv the pv
     * @param startPeriod the startPeriod
     * @param endPeriod the endPeriod
     * @param type the type
     */
    public BaseWorkbookFunctionsCumIPmtRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement startPeriod, final com.google.gson.JsonElement endPeriod, final com.google.gson.JsonElement type) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("rate", rate);
        bodyParams.put("nper", nper);
        bodyParams.put("pv", pv);
        bodyParams.put("startPeriod", startPeriod);
        bodyParams.put("endPeriod", endPeriod);
        bodyParams.put("type", type);
    }

    /**
     * Creates the IWorkbookFunctionsCumIPmtRequest
     *
     * @return the IWorkbookFunctionsCumIPmtRequest instance
     */
    public IWorkbookFunctionsCumIPmtRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsCumIPmtRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCumIPmtRequest instance
     */
    public IWorkbookFunctionsCumIPmtRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsCumIPmtRequest request = new WorkbookFunctionsCumIPmtRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("rate")) {
            request.body.rate = getParameter("rate");
        }

        if (hasParameter("nper")) {
            request.body.nper = getParameter("nper");
        }

        if (hasParameter("pv")) {
            request.body.pv = getParameter("pv");
        }

        if (hasParameter("startPeriod")) {
            request.body.startPeriod = getParameter("startPeriod");
        }

        if (hasParameter("endPeriod")) {
            request.body.endPeriod = getParameter("endPeriod");
        }

        if (hasParameter("type")) {
            request.body.type = getParameter("type");
        }

        return request;
    }
}
