// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsVlookupRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsVlookupRequest;

/**
 * The class for the Base Workbook Functions Vlookup Request Builder.
 */
public class BaseWorkbookFunctionsVlookupRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsVlookup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param lookupValue the lookupValue
     * @param tableArray the tableArray
     * @param colIndexNum the colIndexNum
     * @param rangeLookup the rangeLookup
     */
    public BaseWorkbookFunctionsVlookupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement lookupValue, final com.google.gson.JsonElement tableArray, final com.google.gson.JsonElement colIndexNum, final com.google.gson.JsonElement rangeLookup) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("lookupValue", lookupValue);
        bodyParams.put("tableArray", tableArray);
        bodyParams.put("colIndexNum", colIndexNum);
        bodyParams.put("rangeLookup", rangeLookup);
    }

    /**
     * Creates the IWorkbookFunctionsVlookupRequest
     *
     * @return the IWorkbookFunctionsVlookupRequest instance
     */
    public IWorkbookFunctionsVlookupRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsVlookupRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsVlookupRequest instance
     */
    public IWorkbookFunctionsVlookupRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsVlookupRequest request = new WorkbookFunctionsVlookupRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("lookupValue")) {
            request.body.lookupValue = getParameter("lookupValue");
        }

        if (hasParameter("tableArray")) {
            request.body.tableArray = getParameter("tableArray");
        }

        if (hasParameter("colIndexNum")) {
            request.body.colIndexNum = getParameter("colIndexNum");
        }

        if (hasParameter("rangeLookup")) {
            request.body.rangeLookup = getParameter("rangeLookup");
        }

        return request;
    }
}
