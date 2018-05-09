// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyCellColorFilterRequest;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyCellColorFilterRequest;

/**
 * The class for the Base Workbook Filter Apply Cell Color Filter Request Builder.
 */
public class BaseWorkbookFilterApplyCellColorFilterRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyCellColorFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param color the color
     */
    public BaseWorkbookFilterApplyCellColorFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String color) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("color", color);
    }

    /**
     * Creates the IWorkbookFilterApplyCellColorFilterRequest
     *
     * @return the IWorkbookFilterApplyCellColorFilterRequest instance
     */
    public IWorkbookFilterApplyCellColorFilterRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFilterApplyCellColorFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFilterApplyCellColorFilterRequest instance
     */
    public IWorkbookFilterApplyCellColorFilterRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFilterApplyCellColorFilterRequest request = new WorkbookFilterApplyCellColorFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("color")) {
            request.body.color = getParameter("color");
        }

        return request;
    }
}
