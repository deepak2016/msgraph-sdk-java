// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeUnmergeRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeUnmergeRequest;

/**
 * The class for the Base Workbook Range Unmerge Request Builder.
 */
public class BaseWorkbookRangeUnmergeRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeUnmerge
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookRangeUnmergeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookRangeUnmergeRequest
     *
     * @return the IWorkbookRangeUnmergeRequest instance
     */
    public IWorkbookRangeUnmergeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeUnmergeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeUnmergeRequest instance
     */
    public IWorkbookRangeUnmergeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeUnmergeRequest request = new WorkbookRangeUnmergeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
