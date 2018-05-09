// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowAddRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableRowAddRequest;

/**
 * The class for the Base Workbook Table Row Add Request Builder.
 */
public class BaseWorkbookTableRowAddRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookTableRowAdd
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param index the index
     * @param values the values
     */
    public BaseWorkbookTableRowAddRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer index, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("index", index);
        bodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookTableRowAddRequest
     *
     * @return the IWorkbookTableRowAddRequest instance
     */
    public IWorkbookTableRowAddRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableRowAddRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableRowAddRequest instance
     */
    public IWorkbookTableRowAddRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookTableRowAddRequest request = new WorkbookTableRowAddRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("index")) {
            request.body.index = getParameter("index");
        }

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        return request;
    }
}
