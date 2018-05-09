// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyTopPercentFilterRequest;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyTopPercentFilterRequest;

/**
 * The class for the Base Workbook Filter Apply Top Percent Filter Request Builder.
 */
public class BaseWorkbookFilterApplyTopPercentFilterRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyTopPercentFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param percent the percent
     */
    public BaseWorkbookFilterApplyTopPercentFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer percent) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("percent", percent);
    }

    /**
     * Creates the IWorkbookFilterApplyTopPercentFilterRequest
     *
     * @return the IWorkbookFilterApplyTopPercentFilterRequest instance
     */
    public IWorkbookFilterApplyTopPercentFilterRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFilterApplyTopPercentFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFilterApplyTopPercentFilterRequest instance
     */
    public IWorkbookFilterApplyTopPercentFilterRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFilterApplyTopPercentFilterRequest request = new WorkbookFilterApplyTopPercentFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("percent")) {
            request.body.percent = getParameter("percent");
        }

        return request;
    }
}
