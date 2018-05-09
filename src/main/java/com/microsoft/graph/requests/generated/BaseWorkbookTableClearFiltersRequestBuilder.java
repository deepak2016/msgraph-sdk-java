// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookTableClearFiltersRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableClearFiltersRequest;

/**
 * The class for the Base Workbook Table Clear Filters Request Builder.
 */
public class BaseWorkbookTableClearFiltersRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookTableClearFilters
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookTableClearFiltersRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookTableClearFiltersRequest
     *
     * @return the IWorkbookTableClearFiltersRequest instance
     */
    public IWorkbookTableClearFiltersRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableClearFiltersRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableClearFiltersRequest instance
     */
    public IWorkbookTableClearFiltersRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookTableClearFiltersRequest request = new WorkbookTableClearFiltersRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
