// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNowRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsNowRequest;

/**
 * The class for the Base Workbook Functions Now Request Builder.
 */
public class BaseWorkbookFunctionsNowRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNow
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookFunctionsNowRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookFunctionsNowRequest
     *
     * @return the IWorkbookFunctionsNowRequest instance
     */
    public IWorkbookFunctionsNowRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsNowRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNowRequest instance
     */
    public IWorkbookFunctionsNowRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsNowRequest request = new WorkbookFunctionsNowRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
