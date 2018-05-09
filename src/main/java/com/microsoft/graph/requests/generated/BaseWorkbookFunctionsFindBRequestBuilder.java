// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsFindBRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsFindBRequest;

/**
 * The class for the Base Workbook Functions Find BRequest Builder.
 */
public class BaseWorkbookFunctionsFindBRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFindB
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param findText the findText
     * @param withinText the withinText
     * @param startNum the startNum
     */
    public BaseWorkbookFunctionsFindBRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement findText, final com.google.gson.JsonElement withinText, final com.google.gson.JsonElement startNum) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("findText", findText);
        bodyParams.put("withinText", withinText);
        bodyParams.put("startNum", startNum);
    }

    /**
     * Creates the IWorkbookFunctionsFindBRequest
     *
     * @return the IWorkbookFunctionsFindBRequest instance
     */
    public IWorkbookFunctionsFindBRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsFindBRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFindBRequest instance
     */
    public IWorkbookFunctionsFindBRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsFindBRequest request = new WorkbookFunctionsFindBRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("findText")) {
            request.body.findText = getParameter("findText");
        }

        if (hasParameter("withinText")) {
            request.body.withinText = getParameter("withinText");
        }

        if (hasParameter("startNum")) {
            request.body.startNum = getParameter("startNum");
        }

        return request;
    }
}
