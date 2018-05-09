// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookTableReapplyFiltersRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableReapplyFiltersRequest;

/**
 * The class for the Base Workbook Table Reapply Filters Request Builder.
 */
public class BaseWorkbookTableReapplyFiltersRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookTableReapplyFilters
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookTableReapplyFiltersRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookTableReapplyFiltersRequest
     *
     * @return the IWorkbookTableReapplyFiltersRequest instance
     */
    public IWorkbookTableReapplyFiltersRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableReapplyFiltersRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableReapplyFiltersRequest instance
     */
    public IWorkbookTableReapplyFiltersRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookTableReapplyFiltersRequest request = new WorkbookTableReapplyFiltersRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
