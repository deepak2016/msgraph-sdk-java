// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsHourRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsHourRequest;

/**
 * The class for the Base Workbook Functions Hour Request Builder.
 */
public class BaseWorkbookFunctionsHourRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsHour
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param serialNumber the serialNumber
     */
    public BaseWorkbookFunctionsHourRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement serialNumber) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("serialNumber", serialNumber);
    }

    /**
     * Creates the IWorkbookFunctionsHourRequest
     *
     * @return the IWorkbookFunctionsHourRequest instance
     */
    public IWorkbookFunctionsHourRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsHourRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsHourRequest instance
     */
    public IWorkbookFunctionsHourRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsHourRequest request = new WorkbookFunctionsHourRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("serialNumber")) {
            request.body.serialNumber = getParameter("serialNumber");
        }

        return request;
    }
}
