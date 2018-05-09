// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsMidbRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsMidbRequest;

/**
 * The class for the Base Workbook Functions Midb Request Builder.
 */
public class BaseWorkbookFunctionsMidbRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsMidb
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text the text
     * @param startNum the startNum
     * @param numBytes the numBytes
     */
    public BaseWorkbookFunctionsMidbRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement text, final com.google.gson.JsonElement startNum, final com.google.gson.JsonElement numBytes) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("text", text);
        bodyParams.put("startNum", startNum);
        bodyParams.put("numBytes", numBytes);
    }

    /**
     * Creates the IWorkbookFunctionsMidbRequest
     *
     * @return the IWorkbookFunctionsMidbRequest instance
     */
    public IWorkbookFunctionsMidbRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsMidbRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsMidbRequest instance
     */
    public IWorkbookFunctionsMidbRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsMidbRequest request = new WorkbookFunctionsMidbRequest(
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

        if (hasParameter("numBytes")) {
            request.body.numBytes = getParameter("numBytes");
        }

        return request;
    }
}
