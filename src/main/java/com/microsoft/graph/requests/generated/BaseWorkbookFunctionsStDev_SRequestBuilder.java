// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsStDev_SRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsStDev_SRequest;

/**
 * The class for the Base Workbook Functions St Dev_SRequest Builder.
 */
public class BaseWorkbookFunctionsStDev_SRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsStDev_S
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param values the values
     */
    public BaseWorkbookFunctionsStDev_SRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsStDev_SRequest
     *
     * @return the IWorkbookFunctionsStDev_SRequest instance
     */
    public IWorkbookFunctionsStDev_SRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsStDev_SRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsStDev_SRequest instance
     */
    public IWorkbookFunctionsStDev_SRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsStDev_SRequest request = new WorkbookFunctionsStDev_SRequest(
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
