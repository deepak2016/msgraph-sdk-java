// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsNorm_S_InvRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Norm_S_Inv Request Builder.
 */
public class WorkbookFunctionsNorm_S_InvRequestBuilder extends BaseWorkbookFunctionsNorm_S_InvRequestBuilder implements IWorkbookFunctionsNorm_S_InvRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNorm_S_Inv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param probability the probability
     */
    public WorkbookFunctionsNorm_S_InvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement probability) {
        super(requestUrl, client, requestOptions, probability);
    }
}
