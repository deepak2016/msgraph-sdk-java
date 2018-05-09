// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsReplaceBRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsReplaceBRequest;

/**
 * The class for the Base Workbook Functions Replace BRequest Builder.
 */
public class BaseWorkbookFunctionsReplaceBRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsReplaceB
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param oldText the oldText
     * @param startNum the startNum
     * @param numBytes the numBytes
     * @param newText the newText
     */
    public BaseWorkbookFunctionsReplaceBRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement oldText, final com.google.gson.JsonElement startNum, final com.google.gson.JsonElement numBytes, final com.google.gson.JsonElement newText) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("oldText", oldText);
        bodyParams.put("startNum", startNum);
        bodyParams.put("numBytes", numBytes);
        bodyParams.put("newText", newText);
    }

    /**
     * Creates the IWorkbookFunctionsReplaceBRequest
     *
     * @return the IWorkbookFunctionsReplaceBRequest instance
     */
    public IWorkbookFunctionsReplaceBRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsReplaceBRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsReplaceBRequest instance
     */
    public IWorkbookFunctionsReplaceBRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsReplaceBRequest request = new WorkbookFunctionsReplaceBRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("oldText")) {
            request.body.oldText = getParameter("oldText");
        }

        if (hasParameter("startNum")) {
            request.body.startNum = getParameter("startNum");
        }

        if (hasParameter("numBytes")) {
            request.body.numBytes = getParameter("numBytes");
        }

        if (hasParameter("newText")) {
            request.body.newText = getParameter("newText");
        }

        return request;
    }
}
