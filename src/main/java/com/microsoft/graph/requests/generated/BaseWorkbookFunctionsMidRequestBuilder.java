// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsMidRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsMidRequest;

/**
 * The class for the Base Workbook Functions Mid Request Builder.
 */
public class BaseWorkbookFunctionsMidRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsMid
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text the text
     * @param startNum the startNum
     * @param numChars the numChars
     */
    public BaseWorkbookFunctionsMidRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement text, final com.google.gson.JsonElement startNum, final com.google.gson.JsonElement numChars) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("text", text);
        bodyParams.put("startNum", startNum);
        bodyParams.put("numChars", numChars);
    }

    /**
     * Creates the IWorkbookFunctionsMidRequest
     *
     * @return the IWorkbookFunctionsMidRequest instance
     */
    public IWorkbookFunctionsMidRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsMidRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsMidRequest instance
     */
    public IWorkbookFunctionsMidRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsMidRequest request = new WorkbookFunctionsMidRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("text")) {
            request.body.text = getParameter("text");
        }

        if (hasParameter("startNum")) {
            request.body.startNum = getParameter("startNum");
        }

        if (hasParameter("numChars")) {
            request.body.numChars = getParameter("numChars");
        }

        return request;
    }
}
