// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsCeiling_MathRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Ceiling_Math Request Builder.
 */
public class WorkbookFunctionsCeiling_MathRequestBuilder extends BaseWorkbookFunctionsCeiling_MathRequestBuilder implements IWorkbookFunctionsCeiling_MathRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCeiling_Math
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param significance the significance
     * @param mode the mode
     */
    public WorkbookFunctionsCeiling_MathRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement significance, final com.google.gson.JsonElement mode) {
        super(requestUrl, client, requestOptions, number, significance, mode);
    }
}
