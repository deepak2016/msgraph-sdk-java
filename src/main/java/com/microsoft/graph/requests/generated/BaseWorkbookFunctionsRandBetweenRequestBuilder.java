// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRandBetweenRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsRandBetweenRequest;

/**
 * The class for the Base Workbook Functions Rand Between Request Builder.
 */
public class BaseWorkbookFunctionsRandBetweenRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRandBetween
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param bottom the bottom
     * @param top the top
     */
    public BaseWorkbookFunctionsRandBetweenRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement bottom, final com.google.gson.JsonElement top) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("bottom", bottom);
        bodyParams.put("top", top);
    }

    /**
     * Creates the IWorkbookFunctionsRandBetweenRequest
     *
     * @return the IWorkbookFunctionsRandBetweenRequest instance
     */
    public IWorkbookFunctionsRandBetweenRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsRandBetweenRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRandBetweenRequest instance
     */
    public IWorkbookFunctionsRandBetweenRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsRandBetweenRequest request = new WorkbookFunctionsRandBetweenRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("bottom")) {
            request.body.bottom = getParameter("bottom");
        }

        if (hasParameter("top")) {
            request.body.top = getParameter("top");
        }

        return request;
    }
}
