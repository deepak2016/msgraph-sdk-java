// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCleanRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsCleanRequest;

/**
 * The class for the Base Workbook Functions Clean Request Builder.
 */
public class BaseWorkbookFunctionsCleanRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsClean
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text the text
     */
    public BaseWorkbookFunctionsCleanRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement text) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("text", text);
    }

    /**
     * Creates the IWorkbookFunctionsCleanRequest
     *
     * @return the IWorkbookFunctionsCleanRequest instance
     */
    public IWorkbookFunctionsCleanRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsCleanRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCleanRequest instance
     */
    public IWorkbookFunctionsCleanRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsCleanRequest request = new WorkbookFunctionsCleanRequest(
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
