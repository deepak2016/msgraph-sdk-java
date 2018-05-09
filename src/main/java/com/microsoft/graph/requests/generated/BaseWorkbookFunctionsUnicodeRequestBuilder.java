// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsUnicodeRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsUnicodeRequest;

/**
 * The class for the Base Workbook Functions Unicode Request Builder.
 */
public class BaseWorkbookFunctionsUnicodeRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsUnicode
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text the text
     */
    public BaseWorkbookFunctionsUnicodeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement text) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("text", text);
    }

    /**
     * Creates the IWorkbookFunctionsUnicodeRequest
     *
     * @return the IWorkbookFunctionsUnicodeRequest instance
     */
    public IWorkbookFunctionsUnicodeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsUnicodeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsUnicodeRequest instance
     */
    public IWorkbookFunctionsUnicodeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsUnicodeRequest request = new WorkbookFunctionsUnicodeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("text")) {
            request.body.text = getParameter("text");
        }

        return request;
    }
}
