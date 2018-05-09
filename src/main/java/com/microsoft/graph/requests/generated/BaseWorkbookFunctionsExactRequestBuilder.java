// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsExactRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsExactRequest;

/**
 * The class for the Base Workbook Functions Exact Request Builder.
 */
public class BaseWorkbookFunctionsExactRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsExact
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text1 the text1
     * @param text2 the text2
     */
    public BaseWorkbookFunctionsExactRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement text1, final com.google.gson.JsonElement text2) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("text1", text1);
        bodyParams.put("text2", text2);
    }

    /**
     * Creates the IWorkbookFunctionsExactRequest
     *
     * @return the IWorkbookFunctionsExactRequest instance
     */
    public IWorkbookFunctionsExactRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsExactRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsExactRequest instance
     */
    public IWorkbookFunctionsExactRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsExactRequest request = new WorkbookFunctionsExactRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("text1")) {
            request.body.text1 = getParameter("text1");
        }

        if (hasParameter("text2")) {
            request.body.text2 = getParameter("text2");
        }

        return request;
    }
}
