// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsHyperlinkRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsHyperlinkRequest;

/**
 * The class for the Base Workbook Functions Hyperlink Request Builder.
 */
public class BaseWorkbookFunctionsHyperlinkRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsHyperlink
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param linkLocation the linkLocation
     * @param friendlyName the friendlyName
     */
    public BaseWorkbookFunctionsHyperlinkRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement linkLocation, final com.google.gson.JsonElement friendlyName) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("linkLocation", linkLocation);
        bodyParams.put("friendlyName", friendlyName);
    }

    /**
     * Creates the IWorkbookFunctionsHyperlinkRequest
     *
     * @return the IWorkbookFunctionsHyperlinkRequest instance
     */
    public IWorkbookFunctionsHyperlinkRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsHyperlinkRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsHyperlinkRequest instance
     */
    public IWorkbookFunctionsHyperlinkRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsHyperlinkRequest request = new WorkbookFunctionsHyperlinkRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("linkLocation")) {
            request.body.linkLocation = getParameter("linkLocation");
        }

        if (hasParameter("friendlyName")) {
            request.body.friendlyName = getParameter("friendlyName");
        }

        return request;
    }
}
