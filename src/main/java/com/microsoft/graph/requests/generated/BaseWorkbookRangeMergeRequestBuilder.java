// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeMergeRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeMergeRequest;

/**
 * The class for the Base Workbook Range Merge Request Builder.
 */
public class BaseWorkbookRangeMergeRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeMerge
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param across the across
     */
    public BaseWorkbookRangeMergeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Boolean across) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("across", across);
    }

    /**
     * Creates the IWorkbookRangeMergeRequest
     *
     * @return the IWorkbookRangeMergeRequest instance
     */
    public IWorkbookRangeMergeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeMergeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeMergeRequest instance
     */
    public IWorkbookRangeMergeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeMergeRequest request = new WorkbookRangeMergeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("across")) {
            request.body.across = getParameter("across");
        }

        return request;
    }
}
