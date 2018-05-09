// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookProcessQueryRequest;
import com.microsoft.graph.requests.extensions.WorkbookProcessQueryRequest;

/**
 * The class for the Base Workbook Process Query Request Builder.
 */
public class BaseWorkbookProcessQueryRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookProcessQuery
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param input the input
     */
    public BaseWorkbookProcessQueryRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final byte[] input) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("input", input);
    }

    /**
     * Creates the IWorkbookProcessQueryRequest
     *
     * @return the IWorkbookProcessQueryRequest instance
     */
    public IWorkbookProcessQueryRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookProcessQueryRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookProcessQueryRequest instance
     */
    public IWorkbookProcessQueryRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookProcessQueryRequest request = new WorkbookProcessQueryRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("input")) {
            request.body.input = getParameter("input");
        }

        return request;
    }
}
