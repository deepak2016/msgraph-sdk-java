// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsTextRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsTextRequest;

/**
 * The class for the Base Workbook Functions Text Request Builder.
 */
public class BaseWorkbookFunctionsTextRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsText
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param value the value
     * @param formatText the formatText
     */
    public BaseWorkbookFunctionsTextRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement value, final com.google.gson.JsonElement formatText) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("value", value);
        bodyParams.put("formatText", formatText);
    }

    /**
     * Creates the IWorkbookFunctionsTextRequest
     *
     * @return the IWorkbookFunctionsTextRequest instance
     */
    public IWorkbookFunctionsTextRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsTextRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsTextRequest instance
     */
    public IWorkbookFunctionsTextRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsTextRequest request = new WorkbookFunctionsTextRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("value")) {
            request.body.value = getParameter("value");
        }

        if (hasParameter("formatText")) {
            request.body.formatText = getParameter("formatText");
        }

        return request;
    }
}
