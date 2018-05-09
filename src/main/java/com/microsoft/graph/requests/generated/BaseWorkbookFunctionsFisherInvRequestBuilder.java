// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsFisherInvRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsFisherInvRequest;

/**
 * The class for the Base Workbook Functions Fisher Inv Request Builder.
 */
public class BaseWorkbookFunctionsFisherInvRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFisherInv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param y the y
     */
    public BaseWorkbookFunctionsFisherInvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement y) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("y", y);
    }

    /**
     * Creates the IWorkbookFunctionsFisherInvRequest
     *
     * @return the IWorkbookFunctionsFisherInvRequest instance
     */
    public IWorkbookFunctionsFisherInvRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsFisherInvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFisherInvRequest instance
     */
    public IWorkbookFunctionsFisherInvRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsFisherInvRequest request = new WorkbookFunctionsFisherInvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("y")) {
            request.body.y = getParameter("y");
        }

        return request;
    }
}
