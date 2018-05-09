// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsImDivRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsImDivRequest;

/**
 * The class for the Base Workbook Functions Im Div Request Builder.
 */
public class BaseWorkbookFunctionsImDivRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsImDiv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param inumber1 the inumber1
     * @param inumber2 the inumber2
     */
    public BaseWorkbookFunctionsImDivRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement inumber1, final com.google.gson.JsonElement inumber2) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("inumber1", inumber1);
        bodyParams.put("inumber2", inumber2);
    }

    /**
     * Creates the IWorkbookFunctionsImDivRequest
     *
     * @return the IWorkbookFunctionsImDivRequest instance
     */
    public IWorkbookFunctionsImDivRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsImDivRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImDivRequest instance
     */
    public IWorkbookFunctionsImDivRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsImDivRequest request = new WorkbookFunctionsImDivRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("inumber1")) {
            request.body.inumber1 = getParameter("inumber1");
        }

        if (hasParameter("inumber2")) {
            request.body.inumber2 = getParameter("inumber2");
        }

        return request;
    }
}
