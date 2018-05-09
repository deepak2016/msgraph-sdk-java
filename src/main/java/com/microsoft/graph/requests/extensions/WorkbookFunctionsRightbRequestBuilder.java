// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsRightbRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Rightb Request Builder.
 */
public class WorkbookFunctionsRightbRequestBuilder extends BaseWorkbookFunctionsRightbRequestBuilder implements IWorkbookFunctionsRightbRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRightb
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text the text
     * @param numBytes the numBytes
     */
    public WorkbookFunctionsRightbRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement text, final com.google.gson.JsonElement numBytes) {
        super(requestUrl, client, requestOptions, text, numBytes);
    }
}
