// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.WorkbookIcon;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyIconFilterRequest;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyIconFilterRequest;

/**
 * The class for the Base Workbook Filter Apply Icon Filter Request Builder.
 */
public class BaseWorkbookFilterApplyIconFilterRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyIconFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param icon the icon
     */
    public BaseWorkbookFilterApplyIconFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final WorkbookIcon icon) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("icon", icon);
    }

    /**
     * Creates the IWorkbookFilterApplyIconFilterRequest
     *
     * @return the IWorkbookFilterApplyIconFilterRequest instance
     */
    public IWorkbookFilterApplyIconFilterRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFilterApplyIconFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFilterApplyIconFilterRequest instance
     */
    public IWorkbookFilterApplyIconFilterRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFilterApplyIconFilterRequest request = new WorkbookFilterApplyIconFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("icon")) {
            request.body.icon = getParameter("icon");
        }

        return request;
    }
}
