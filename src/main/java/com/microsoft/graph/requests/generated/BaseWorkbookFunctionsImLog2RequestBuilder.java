// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsImLog2Request;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsImLog2Request;

/**
 * The class for the Base Workbook Functions Im Log2Request Builder.
 */
public class BaseWorkbookFunctionsImLog2RequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsImLog2
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param inumber the inumber
     */
    public BaseWorkbookFunctionsImLog2RequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement inumber) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("inumber", inumber);
    }

    /**
     * Creates the IWorkbookFunctionsImLog2Request
     *
     * @return the IWorkbookFunctionsImLog2Request instance
     */
    public IWorkbookFunctionsImLog2Request buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsImLog2Request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImLog2Request instance
     */
    public IWorkbookFunctionsImLog2Request buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsImLog2Request request = new WorkbookFunctionsImLog2Request(
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
