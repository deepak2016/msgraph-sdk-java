// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsReptRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsReptRequest;

/**
 * The class for the Base Workbook Functions Rept Request Builder.
 */
public class BaseWorkbookFunctionsReptRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRept
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text the text
     * @param numberTimes the numberTimes
     */
    public BaseWorkbookFunctionsReptRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement text, final com.google.gson.JsonElement numberTimes) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("text", text);
        bodyParams.put("numberTimes", numberTimes);
    }

    /**
     * Creates the IWorkbookFunctionsReptRequest
     *
     * @return the IWorkbookFunctionsReptRequest instance
     */
    public IWorkbookFunctionsReptRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsReptRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsReptRequest instance
     */
    public IWorkbookFunctionsReptRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsReptRequest request = new WorkbookFunctionsReptRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("text")) {
            request.body.text = getParameter("text");
        }

        if (hasParameter("numberTimes")) {
            request.body.numberTimes = getParameter("numberTimes");
        }

        return request;
    }
}
