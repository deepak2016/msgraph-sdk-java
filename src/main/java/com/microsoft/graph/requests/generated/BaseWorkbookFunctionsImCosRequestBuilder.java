// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsImCosRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsImCosRequest;

/**
 * The class for the Base Workbook Functions Im Cos Request Builder.
 */
public class BaseWorkbookFunctionsImCosRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsImCos
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param inumber the inumber
     */
    public BaseWorkbookFunctionsImCosRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement inumber) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("inumber", inumber);
    }

    /**
     * Creates the IWorkbookFunctionsImCosRequest
     *
     * @return the IWorkbookFunctionsImCosRequest instance
     */
    public IWorkbookFunctionsImCosRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsImCosRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImCosRequest instance
     */
    public IWorkbookFunctionsImCosRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsImCosRequest request = new WorkbookFunctionsImCosRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("inumber")) {
            request.body.inumber = getParameter("inumber");
        }

        return request;
    }
}
