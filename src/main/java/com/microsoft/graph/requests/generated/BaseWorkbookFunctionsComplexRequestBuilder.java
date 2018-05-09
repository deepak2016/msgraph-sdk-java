// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsComplexRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsComplexRequest;

/**
 * The class for the Base Workbook Functions Complex Request Builder.
 */
public class BaseWorkbookFunctionsComplexRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsComplex
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param realNum the realNum
     * @param iNum the iNum
     * @param suffix the suffix
     */
    public BaseWorkbookFunctionsComplexRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement realNum, final com.google.gson.JsonElement iNum, final com.google.gson.JsonElement suffix) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("realNum", realNum);
        bodyParams.put("iNum", iNum);
        bodyParams.put("suffix", suffix);
    }

    /**
     * Creates the IWorkbookFunctionsComplexRequest
     *
     * @return the IWorkbookFunctionsComplexRequest instance
     */
    public IWorkbookFunctionsComplexRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsComplexRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsComplexRequest instance
     */
    public IWorkbookFunctionsComplexRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsComplexRequest request = new WorkbookFunctionsComplexRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("realNum")) {
            request.body.realNum = getParameter("realNum");
        }

        if (hasParameter("iNum")) {
            request.body.iNum = getParameter("iNum");
        }

        if (hasParameter("suffix")) {
            request.body.suffix = getParameter("suffix");
        }

        return request;
    }
}
