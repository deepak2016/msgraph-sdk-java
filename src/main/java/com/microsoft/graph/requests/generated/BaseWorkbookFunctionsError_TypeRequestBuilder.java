// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsError_TypeRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsError_TypeRequest;

/**
 * The class for the Base Workbook Functions Error_Type Request Builder.
 */
public class BaseWorkbookFunctionsError_TypeRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsError_Type
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param errorVal the errorVal
     */
    public BaseWorkbookFunctionsError_TypeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement errorVal) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("errorVal", errorVal);
    }

    /**
     * Creates the IWorkbookFunctionsError_TypeRequest
     *
     * @return the IWorkbookFunctionsError_TypeRequest instance
     */
    public IWorkbookFunctionsError_TypeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsError_TypeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsError_TypeRequest instance
     */
    public IWorkbookFunctionsError_TypeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsError_TypeRequest request = new WorkbookFunctionsError_TypeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("errorVal")) {
            request.body.errorVal = getParameter("errorVal");
        }

        return request;
    }
}
