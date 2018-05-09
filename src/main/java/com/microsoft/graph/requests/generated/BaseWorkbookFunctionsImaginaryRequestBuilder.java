// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsImaginaryRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsImaginaryRequest;

/**
 * The class for the Base Workbook Functions Imaginary Request Builder.
 */
public class BaseWorkbookFunctionsImaginaryRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsImaginary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param inumber the inumber
     */
    public BaseWorkbookFunctionsImaginaryRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement inumber) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("inumber", inumber);
    }

    /**
     * Creates the IWorkbookFunctionsImaginaryRequest
     *
     * @return the IWorkbookFunctionsImaginaryRequest instance
     */
    public IWorkbookFunctionsImaginaryRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsImaginaryRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImaginaryRequest instance
     */
    public IWorkbookFunctionsImaginaryRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsImaginaryRequest request = new WorkbookFunctionsImaginaryRequest(
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
