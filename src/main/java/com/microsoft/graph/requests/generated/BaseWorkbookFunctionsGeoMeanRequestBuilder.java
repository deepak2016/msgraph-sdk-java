// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsGeoMeanRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsGeoMeanRequest;

/**
 * The class for the Base Workbook Functions Geo Mean Request Builder.
 */
public class BaseWorkbookFunctionsGeoMeanRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsGeoMean
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param values the values
     */
    public BaseWorkbookFunctionsGeoMeanRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsGeoMeanRequest
     *
     * @return the IWorkbookFunctionsGeoMeanRequest instance
     */
    public IWorkbookFunctionsGeoMeanRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsGeoMeanRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsGeoMeanRequest instance
     */
    public IWorkbookFunctionsGeoMeanRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsGeoMeanRequest request = new WorkbookFunctionsGeoMeanRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        return request;
    }
}
