// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnAddRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableColumnAddRequest;

/**
 * The class for the Base Workbook Table Column Add Request Builder.
 */
public class BaseWorkbookTableColumnAddRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookTableColumnAdd
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param index the index
     * @param values the values
     * @param name the name
     */
    public BaseWorkbookTableColumnAddRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer index, final com.google.gson.JsonElement values, final String name) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("index", index);
        bodyParams.put("values", values);
        bodyParams.put("name", name);
    }

    /**
     * Creates the IWorkbookTableColumnAddRequest
     *
     * @return the IWorkbookTableColumnAddRequest instance
     */
    public IWorkbookTableColumnAddRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableColumnAddRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableColumnAddRequest instance
     */
    public IWorkbookTableColumnAddRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookTableColumnAddRequest request = new WorkbookTableColumnAddRequest(
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

        if (hasParameter("name")) {
            request.body.name = getParameter("name");
        }

        return request;
    }
}
