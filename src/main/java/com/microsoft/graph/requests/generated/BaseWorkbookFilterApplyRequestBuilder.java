// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.WorkbookFilterCriteria;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyRequest;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyRequest;

/**
 * The class for the Base Workbook Filter Apply Request Builder.
 */
public class BaseWorkbookFilterApplyRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param criteria the criteria
     */
    public BaseWorkbookFilterApplyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final WorkbookFilterCriteria criteria) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("criteria", criteria);
    }

    /**
     * Creates the IWorkbookFilterApplyRequest
     *
     * @return the IWorkbookFilterApplyRequest instance
     */
    public IWorkbookFilterApplyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFilterApplyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFilterApplyRequest instance
     */
    public IWorkbookFilterApplyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFilterApplyRequest request = new WorkbookFilterApplyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("criteria")) {
            request.body.criteria = getParameter("criteria");
        }

        return request;
    }
}
