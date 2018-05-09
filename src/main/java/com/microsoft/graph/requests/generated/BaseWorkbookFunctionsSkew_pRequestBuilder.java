// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsSkew_pRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsSkew_pRequest;

/**
 * The class for the Base Workbook Functions Skew_p Request Builder.
 */
public class BaseWorkbookFunctionsSkew_pRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsSkew_p
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param values the values
     */
    public BaseWorkbookFunctionsSkew_pRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsSkew_pRequest
     *
     * @return the IWorkbookFunctionsSkew_pRequest instance
     */
    public IWorkbookFunctionsSkew_pRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsSkew_pRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsSkew_pRequest instance
     */
    public IWorkbookFunctionsSkew_pRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsSkew_pRequest request = new WorkbookFunctionsSkew_pRequest(
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
