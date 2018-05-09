// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRightRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsRightRequest;

/**
 * The class for the Base Workbook Functions Right Request Builder.
 */
public class BaseWorkbookFunctionsRightRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRight
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text the text
     * @param numChars the numChars
     */
    public BaseWorkbookFunctionsRightRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement text, final com.google.gson.JsonElement numChars) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("text", text);
        bodyParams.put("numChars", numChars);
    }

    /**
     * Creates the IWorkbookFunctionsRightRequest
     *
     * @return the IWorkbookFunctionsRightRequest instance
     */
    public IWorkbookFunctionsRightRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsRightRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRightRequest instance
     */
    public IWorkbookFunctionsRightRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsRightRequest request = new WorkbookFunctionsRightRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("text")) {
            request.body.text = getParameter("text");
        }

        if (hasParameter("numChars")) {
            request.body.numChars = getParameter("numChars");
        }

        return request;
    }
}
