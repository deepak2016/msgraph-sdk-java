// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsNorm_InvRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Norm_Inv Request Builder.
 */
public class WorkbookFunctionsNorm_InvRequestBuilder extends BaseWorkbookFunctionsNorm_InvRequestBuilder implements IWorkbookFunctionsNorm_InvRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNorm_Inv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param probability the probability
     * @param mean the mean
     * @param standardDev the standardDev
     */
    public WorkbookFunctionsNorm_InvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement probability, final com.google.gson.JsonElement mean, final com.google.gson.JsonElement standardDev) {
        super(requestUrl, client, requestOptions, probability, mean, standardDev);
    }
}
