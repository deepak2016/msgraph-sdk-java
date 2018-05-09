// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPdurationRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsPdurationRequest;

/**
 * The class for the Base Workbook Functions Pduration Request Builder.
 */
public class BaseWorkbookFunctionsPdurationRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPduration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param rate the rate
     * @param pv the pv
     * @param fv the fv
     */
    public BaseWorkbookFunctionsPdurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement fv) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("rate", rate);
        bodyParams.put("pv", pv);
        bodyParams.put("fv", fv);
    }

    /**
     * Creates the IWorkbookFunctionsPdurationRequest
     *
     * @return the IWorkbookFunctionsPdurationRequest instance
     */
    public IWorkbookFunctionsPdurationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsPdurationRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPdurationRequest instance
     */
    public IWorkbookFunctionsPdurationRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsPdurationRequest request = new WorkbookFunctionsPdurationRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("rate")) {
            request.body.rate = getParameter("rate");
        }

        if (hasParameter("pv")) {
            request.body.pv = getParameter("pv");
        }

        if (hasParameter("fv")) {
            request.body.fv = getParameter("fv");
        }

        return request;
    }
}
