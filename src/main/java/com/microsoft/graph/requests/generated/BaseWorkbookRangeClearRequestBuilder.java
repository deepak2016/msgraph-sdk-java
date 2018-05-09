// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeClearRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeClearRequest;

/**
 * The class for the Base Workbook Range Clear Request Builder.
 */
public class BaseWorkbookRangeClearRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeClear
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param applyTo the applyTo
     */
    public BaseWorkbookRangeClearRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String applyTo) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("applyTo", applyTo);
    }

    /**
     * Creates the IWorkbookRangeClearRequest
     *
     * @return the IWorkbookRangeClearRequest instance
     */
    public IWorkbookRangeClearRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeClearRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeClearRequest instance
     */
    public IWorkbookRangeClearRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeClearRequest request = new WorkbookRangeClearRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("applyTo")) {
            request.body.applyTo = getParameter("applyTo");
        }

        return request;
    }
}
