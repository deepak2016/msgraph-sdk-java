// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsDecimalRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Decimal Request Builder.
 */
public class WorkbookFunctionsDecimalRequestBuilder extends BaseWorkbookFunctionsDecimalRequestBuilder implements IWorkbookFunctionsDecimalRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDecimal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param radix the radix
     */
    public WorkbookFunctionsDecimalRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement radix) {
        super(requestUrl, client, requestOptions, number, radix);
    }
}
