// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsAtan2RequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Atan2Request Builder.
 */
public class WorkbookFunctionsAtan2RequestBuilder extends BaseWorkbookFunctionsAtan2RequestBuilder implements IWorkbookFunctionsAtan2RequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAtan2
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param xNum the xNum
     * @param yNum the yNum
     */
    public WorkbookFunctionsAtan2RequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement xNum, final com.google.gson.JsonElement yNum) {
        super(requestUrl, client, requestOptions, xNum, yNum);
    }
}
