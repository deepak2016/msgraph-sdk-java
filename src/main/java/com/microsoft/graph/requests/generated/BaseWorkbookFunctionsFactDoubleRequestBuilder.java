// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsFactDoubleRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsFactDoubleRequest;

/**
 * The class for the Base Workbook Functions Fact Double Request Builder.
 */
public class BaseWorkbookFunctionsFactDoubleRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFactDouble
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     */
    public BaseWorkbookFunctionsFactDoubleRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
    }

    /**
     * Creates the IWorkbookFunctionsFactDoubleRequest
     *
     * @return the IWorkbookFunctionsFactDoubleRequest instance
     */
    public IWorkbookFunctionsFactDoubleRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsFactDoubleRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFactDoubleRequest instance
     */
    public IWorkbookFunctionsFactDoubleRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsFactDoubleRequest request = new WorkbookFunctionsFactDoubleRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        return request;
    }
}
