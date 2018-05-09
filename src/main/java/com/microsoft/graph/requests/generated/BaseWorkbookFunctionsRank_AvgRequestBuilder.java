// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRank_AvgRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsRank_AvgRequest;

/**
 * The class for the Base Workbook Functions Rank_Avg Request Builder.
 */
public class BaseWorkbookFunctionsRank_AvgRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRank_Avg
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param ref the ref
     * @param order the order
     */
    public BaseWorkbookFunctionsRank_AvgRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement ref, final com.google.gson.JsonElement order) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("ref", ref);
        bodyParams.put("order", order);
    }

    /**
     * Creates the IWorkbookFunctionsRank_AvgRequest
     *
     * @return the IWorkbookFunctionsRank_AvgRequest instance
     */
    public IWorkbookFunctionsRank_AvgRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsRank_AvgRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRank_AvgRequest instance
     */
    public IWorkbookFunctionsRank_AvgRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsRank_AvgRequest request = new WorkbookFunctionsRank_AvgRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("ref")) {
            request.body.ref = getParameter("ref");
        }

        if (hasParameter("order")) {
            request.body.order = getParameter("order");
        }

        return request;
    }
}
