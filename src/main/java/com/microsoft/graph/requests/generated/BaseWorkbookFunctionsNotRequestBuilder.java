// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNotRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsNotRequest;

/**
 * The class for the Base Workbook Functions Not Request Builder.
 */
public class BaseWorkbookFunctionsNotRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param logical the logical
     */
    public BaseWorkbookFunctionsNotRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement logical) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("logical", logical);
    }

    /**
     * Creates the IWorkbookFunctionsNotRequest
     *
     * @return the IWorkbookFunctionsNotRequest instance
     */
    public IWorkbookFunctionsNotRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsNotRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNotRequest instance
     */
    public IWorkbookFunctionsNotRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsNotRequest request = new WorkbookFunctionsNotRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("logical")) {
            request.body.logical = getParameter("logical");
        }

        return request;
    }
}
