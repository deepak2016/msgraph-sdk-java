// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookPivotTableRefreshRequest;
import com.microsoft.graph.requests.extensions.WorkbookPivotTableRefreshRequest;

/**
 * The class for the Base Workbook Pivot Table Refresh Request Builder.
 */
public class BaseWorkbookPivotTableRefreshRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookPivotTableRefresh
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookPivotTableRefreshRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookPivotTableRefreshRequest
     *
     * @return the IWorkbookPivotTableRefreshRequest instance
     */
    public IWorkbookPivotTableRefreshRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookPivotTableRefreshRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookPivotTableRefreshRequest instance
     */
    public IWorkbookPivotTableRefreshRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookPivotTableRefreshRequest request = new WorkbookPivotTableRefreshRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
