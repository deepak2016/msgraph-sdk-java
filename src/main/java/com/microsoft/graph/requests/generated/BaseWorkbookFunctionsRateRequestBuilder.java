// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRateRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsRateRequest;

/**
 * The class for the Base Workbook Functions Rate Request Builder.
 */
public class BaseWorkbookFunctionsRateRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param nper the nper
     * @param pmt the pmt
     * @param pv the pv
     * @param fv the fv
     * @param type the type
     * @param guess the guess
     */
    public BaseWorkbookFunctionsRateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pmt, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement fv, final com.google.gson.JsonElement type, final com.google.gson.JsonElement guess) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("nper", nper);
        bodyParams.put("pmt", pmt);
        bodyParams.put("pv", pv);
        bodyParams.put("fv", fv);
        bodyParams.put("type", type);
        bodyParams.put("guess", guess);
    }

    /**
     * Creates the IWorkbookFunctionsRateRequest
     *
     * @return the IWorkbookFunctionsRateRequest instance
     */
    public IWorkbookFunctionsRateRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsRateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRateRequest instance
     */
    public IWorkbookFunctionsRateRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsRateRequest request = new WorkbookFunctionsRateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("nper")) {
            request.body.nper = getParameter("nper");
        }

        if (hasParameter("pmt")) {
            request.body.pmt = getParameter("pmt");
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

        if (hasParameter("guess")) {
            request.body.guess = getParameter("guess");
        }

        return request;
    }
}
