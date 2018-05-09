// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsConfidence_NormRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsConfidence_NormRequest;

/**
 * The class for the Base Workbook Functions Confidence_Norm Request Builder.
 */
public class BaseWorkbookFunctionsConfidence_NormRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsConfidence_Norm
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param alpha the alpha
     * @param standardDev the standardDev
     * @param size the size
     */
    public BaseWorkbookFunctionsConfidence_NormRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement alpha, final com.google.gson.JsonElement standardDev, final com.google.gson.JsonElement size) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("alpha", alpha);
        bodyParams.put("standardDev", standardDev);
        bodyParams.put("size", size);
    }

    /**
     * Creates the IWorkbookFunctionsConfidence_NormRequest
     *
     * @return the IWorkbookFunctionsConfidence_NormRequest instance
     */
    public IWorkbookFunctionsConfidence_NormRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsConfidence_NormRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsConfidence_NormRequest instance
     */
    public IWorkbookFunctionsConfidence_NormRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsConfidence_NormRequest request = new WorkbookFunctionsConfidence_NormRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("alpha")) {
            request.body.alpha = getParameter("alpha");
        }

        if (hasParameter("standardDev")) {
            request.body.standardDev = getParameter("standardDev");
        }

        if (hasParameter("size")) {
            request.body.size = getParameter("size");
        }

        return request;
    }
}
