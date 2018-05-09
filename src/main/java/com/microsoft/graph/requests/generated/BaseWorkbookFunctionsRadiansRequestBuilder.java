// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRadiansRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsRadiansRequest;

/**
 * The class for the Base Workbook Functions Radians Request Builder.
 */
public class BaseWorkbookFunctionsRadiansRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRadians
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param angle the angle
     */
    public BaseWorkbookFunctionsRadiansRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement angle) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("angle", angle);
    }

    /**
     * Creates the IWorkbookFunctionsRadiansRequest
     *
     * @return the IWorkbookFunctionsRadiansRequest instance
     */
    public IWorkbookFunctionsRadiansRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsRadiansRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRadiansRequest instance
     */
    public IWorkbookFunctionsRadiansRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsRadiansRequest request = new WorkbookFunctionsRadiansRequest(
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
