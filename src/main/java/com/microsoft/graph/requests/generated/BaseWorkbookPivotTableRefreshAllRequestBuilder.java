// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookPivotTableRefreshAllRequest;
import com.microsoft.graph.requests.extensions.WorkbookPivotTableRefreshAllRequest;

/**
 * The class for the Base Workbook Pivot Table Refresh All Request Builder.
 */
public class BaseWorkbookPivotTableRefreshAllRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookPivotTableRefreshAll
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookPivotTableRefreshAllRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookPivotTableRefreshAllRequest
     *
     * @return the IWorkbookPivotTableRefreshAllRequest instance
     */
    public IWorkbookPivotTableRefreshAllRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookPivotTableRefreshAllRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookPivotTableRefreshAllRequest instance
     */
    public IWorkbookPivotTableRefreshAllRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookPivotTableRefreshAllRequest request = new WorkbookPivotTableRefreshAllRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
