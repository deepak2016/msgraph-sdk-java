// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPmtRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsPmtRequest;

/**
 * The class for the Base Workbook Functions Pmt Request Builder.
 */
public class BaseWorkbookFunctionsPmtRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPmt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param rate the rate
     * @param nper the nper
     * @param pv the pv
     * @param fv the fv
     * @param type the type
     */
    public BaseWorkbookFunctionsPmtRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement fv, final com.google.gson.JsonElement type) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("rate", rate);
        bodyParams.put("nper", nper);
        bodyParams.put("pv", pv);
        bodyParams.put("fv", fv);
        bodyParams.put("type", type);
    }

    /**
     * Creates the IWorkbookFunctionsPmtRequest
     *
     * @return the IWorkbookFunctionsPmtRequest instance
     */
    public IWorkbookFunctionsPmtRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsPmtRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPmtRequest instance
     */
    public IWorkbookFunctionsPmtRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsPmtRequest request = new WorkbookFunctionsPmtRequest(
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

        if (hasParameter("fv")) {
            request.body.fv = getParameter("fv");
        }

        if (hasParameter("type")) {
            request.body.type = getParameter("type");
        }

        return request;
    }
}
