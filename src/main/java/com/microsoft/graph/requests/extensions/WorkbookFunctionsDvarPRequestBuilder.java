// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsDvarPRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Dvar PRequest Builder.
 */
public class WorkbookFunctionsDvarPRequestBuilder extends BaseWorkbookFunctionsDvarPRequestBuilder implements IWorkbookFunctionsDvarPRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDvarP
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param database the database
     * @param field the field
     * @param criteria the criteria
     */
    public WorkbookFunctionsDvarPRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement database, final com.google.gson.JsonElement field, final com.google.gson.JsonElement criteria) {
        super(requestUrl, client, requestOptions, database, field, criteria);
    }
}
