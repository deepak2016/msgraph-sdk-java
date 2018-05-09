// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.WorkbookSortField;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookRangeSortApplyRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeSortApplyRequest;

/**
 * The class for the Base Workbook Range Sort Apply Request Builder.
 */
public class BaseWorkbookRangeSortApplyRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeSortApply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param fields the fields
     * @param matchCase the matchCase
     * @param hasHeaders the hasHeaders
     * @param orientation the orientation
     * @param method the method
     */
    public BaseWorkbookRangeSortApplyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<WorkbookSortField> fields, final Boolean matchCase, final Boolean hasHeaders, final String orientation, final String method) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("fields", fields);
        bodyParams.put("matchCase", matchCase);
        bodyParams.put("hasHeaders", hasHeaders);
        bodyParams.put("orientation", orientation);
        bodyParams.put("method", method);
    }

    /**
     * Creates the IWorkbookRangeSortApplyRequest
     *
     * @return the IWorkbookRangeSortApplyRequest instance
     */
    public IWorkbookRangeSortApplyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeSortApplyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeSortApplyRequest instance
     */
    public IWorkbookRangeSortApplyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeSortApplyRequest request = new WorkbookRangeSortApplyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("fields")) {
            request.body.fields = getParameter("fields");
        }

        if (hasParameter("matchCase")) {
            request.body.matchCase = getParameter("matchCase");
        }

        if (hasParameter("hasHeaders")) {
            request.body.hasHeaders = getParameter("hasHeaders");
        }

        if (hasParameter("orientation")) {
            request.body.orientation = getParameter("orientation");
        }

        if (hasParameter("method")) {
            request.body.method = getParameter("method");
        }

        return request;
    }
}
