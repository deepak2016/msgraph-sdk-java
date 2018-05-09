// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookTableAddRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableAddRequest;

/**
 * The class for the Base Workbook Table Add Request Builder.
 */
public class BaseWorkbookTableAddRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookTableAdd
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param address the address
     * @param hasHeaders the hasHeaders
     */
    public BaseWorkbookTableAddRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String address, final Boolean hasHeaders) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("address", address);
        bodyParams.put("hasHeaders", hasHeaders);
    }

    /**
     * Creates the IWorkbookTableAddRequest
     *
     * @return the IWorkbookTableAddRequest instance
     */
    public IWorkbookTableAddRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableAddRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableAddRequest instance
     */
    public IWorkbookTableAddRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookTableAddRequest request = new WorkbookTableAddRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("address")) {
            request.body.address = getParameter("address");
        }

        if (hasParameter("hasHeaders")) {
            request.body.hasHeaders = getParameter("hasHeaders");
        }

        return request;
    }
}
