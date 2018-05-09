// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemAddRequest;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemAddRequest;

/**
 * The class for the Base Workbook Named Item Add Request Builder.
 */
public class BaseWorkbookNamedItemAddRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookNamedItemAdd
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param name the name
     * @param reference the reference
     * @param comment the comment
     */
    public BaseWorkbookNamedItemAddRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String name, final com.google.gson.JsonElement reference, final String comment) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("name", name);
        bodyParams.put("reference", reference);
        bodyParams.put("comment", comment);
    }

    /**
     * Creates the IWorkbookNamedItemAddRequest
     *
     * @return the IWorkbookNamedItemAddRequest instance
     */
    public IWorkbookNamedItemAddRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookNamedItemAddRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookNamedItemAddRequest instance
     */
    public IWorkbookNamedItemAddRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookNamedItemAddRequest request = new WorkbookNamedItemAddRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("name")) {
            request.body.name = getParameter("name");
        }

        if (hasParameter("reference")) {
            request.body.reference = getParameter("reference");
        }

        if (hasParameter("comment")) {
            request.body.comment = getParameter("comment");
        }

        return request;
    }
}
