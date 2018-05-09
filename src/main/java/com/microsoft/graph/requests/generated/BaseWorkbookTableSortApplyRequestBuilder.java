// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.WorkbookSortField;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookTableSortApplyRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableSortApplyRequest;

/**
 * The class for the Base Workbook Table Sort Apply Request Builder.
 */
public class BaseWorkbookTableSortApplyRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookTableSortApply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param fields the fields
     * @param matchCase the matchCase
     * @param method the method
     */
    public BaseWorkbookTableSortApplyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<WorkbookSortField> fields, final Boolean matchCase, final String method) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("fields", fields);
        bodyParams.put("matchCase", matchCase);
        bodyParams.put("method", method);
    }

    /**
     * Creates the IWorkbookTableSortApplyRequest
     *
     * @return the IWorkbookTableSortApplyRequest instance
     */
    public IWorkbookTableSortApplyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableSortApplyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableSortApplyRequest instance
     */
    public IWorkbookTableSortApplyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookTableSortApplyRequest request = new WorkbookTableSortApplyRequest(
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

        if (hasParameter("method")) {
            request.body.method = getParameter("method");
        }

        return request;
    }
}
