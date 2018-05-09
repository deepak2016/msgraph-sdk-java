// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDvarRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDvarRequest;

/**
 * The class for the Base Workbook Functions Dvar Request Builder.
 */
public class BaseWorkbookFunctionsDvarRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDvar
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param database the database
     * @param field the field
     * @param criteria the criteria
     */
    public BaseWorkbookFunctionsDvarRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement database, final com.google.gson.JsonElement field, final com.google.gson.JsonElement criteria) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("database", database);
        bodyParams.put("field", field);
        bodyParams.put("criteria", criteria);
    }

    /**
     * Creates the IWorkbookFunctionsDvarRequest
     *
     * @return the IWorkbookFunctionsDvarRequest instance
     */
    public IWorkbookFunctionsDvarRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDvarRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDvarRequest instance
     */
    public IWorkbookFunctionsDvarRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsDvarRequest request = new WorkbookFunctionsDvarRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("database")) {
            request.body.database = getParameter("database");
        }

        if (hasParameter("field")) {
            request.body.field = getParameter("field");
        }

        if (hasParameter("criteria")) {
            request.body.criteria = getParameter("criteria");
        }

        return request;
    }
}
