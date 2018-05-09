// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDegreesRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDegreesRequest;

/**
 * The class for the Base Workbook Functions Degrees Request Builder.
 */
public class BaseWorkbookFunctionsDegreesRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDegrees
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param angle the angle
     */
    public BaseWorkbookFunctionsDegreesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement angle) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("angle", angle);
    }

    /**
     * Creates the IWorkbookFunctionsDegreesRequest
     *
     * @return the IWorkbookFunctionsDegreesRequest instance
     */
    public IWorkbookFunctionsDegreesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDegreesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDegreesRequest instance
     */
    public IWorkbookFunctionsDegreesRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsDegreesRequest request = new WorkbookFunctionsDegreesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("angle")) {
            request.body.angle = getParameter("angle");
        }

        return request;
    }
}
