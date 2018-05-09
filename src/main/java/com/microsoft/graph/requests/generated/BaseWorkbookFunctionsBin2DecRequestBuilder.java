// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBin2DecRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsBin2DecRequest;

/**
 * The class for the Base Workbook Functions Bin2Dec Request Builder.
 */
public class BaseWorkbookFunctionsBin2DecRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBin2Dec
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     */
    public BaseWorkbookFunctionsBin2DecRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
    }

    /**
     * Creates the IWorkbookFunctionsBin2DecRequest
     *
     * @return the IWorkbookFunctionsBin2DecRequest instance
     */
    public IWorkbookFunctionsBin2DecRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBin2DecRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBin2DecRequest instance
     */
    public IWorkbookFunctionsBin2DecRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsBin2DecRequest request = new WorkbookFunctionsBin2DecRequest(
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
