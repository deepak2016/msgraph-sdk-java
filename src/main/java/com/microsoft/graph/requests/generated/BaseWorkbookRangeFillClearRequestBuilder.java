// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFillClearRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeFillClearRequest;

/**
 * The class for the Base Workbook Range Fill Clear Request Builder.
 */
public class BaseWorkbookRangeFillClearRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeFillClear
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookRangeFillClearRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookRangeFillClearRequest
     *
     * @return the IWorkbookRangeFillClearRequest instance
     */
    public IWorkbookRangeFillClearRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeFillClearRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeFillClearRequest instance
     */
    public IWorkbookRangeFillClearRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeFillClearRequest request = new WorkbookRangeFillClearRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
