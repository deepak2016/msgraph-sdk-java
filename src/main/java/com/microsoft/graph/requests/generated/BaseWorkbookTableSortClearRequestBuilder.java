// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookTableSortClearRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableSortClearRequest;

/**
 * The class for the Base Workbook Table Sort Clear Request Builder.
 */
public class BaseWorkbookTableSortClearRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookTableSortClear
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookTableSortClearRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookTableSortClearRequest
     *
     * @return the IWorkbookTableSortClearRequest instance
     */
    public IWorkbookTableSortClearRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableSortClearRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableSortClearRequest instance
     */
    public IWorkbookTableSortClearRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookTableSortClearRequest request = new WorkbookTableSortClearRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
