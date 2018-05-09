// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsMaxRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsMaxRequest;

/**
 * The class for the Base Workbook Functions Max Request Builder.
 */
public class BaseWorkbookFunctionsMaxRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsMax
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param values the values
     */
    public BaseWorkbookFunctionsMaxRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsMaxRequest
     *
     * @return the IWorkbookFunctionsMaxRequest instance
     */
    public IWorkbookFunctionsMaxRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsMaxRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsMaxRequest instance
     */
    public IWorkbookFunctionsMaxRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsMaxRequest request = new WorkbookFunctionsMaxRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        return request;
    }
}
