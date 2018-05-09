// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDatevalueRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDatevalueRequest;

/**
 * The class for the Base Workbook Functions Datevalue Request Builder.
 */
public class BaseWorkbookFunctionsDatevalueRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDatevalue
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param dateText the dateText
     */
    public BaseWorkbookFunctionsDatevalueRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement dateText) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("dateText", dateText);
    }

    /**
     * Creates the IWorkbookFunctionsDatevalueRequest
     *
     * @return the IWorkbookFunctionsDatevalueRequest instance
     */
    public IWorkbookFunctionsDatevalueRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDatevalueRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDatevalueRequest instance
     */
    public IWorkbookFunctionsDatevalueRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsDatevalueRequest request = new WorkbookFunctionsDatevalueRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("dateText")) {
            request.body.dateText = getParameter("dateText");
        }

        return request;
    }
}
