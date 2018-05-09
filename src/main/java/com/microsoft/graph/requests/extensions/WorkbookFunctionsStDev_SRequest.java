// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsStDev_SRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions St Dev_SRequest.
 */
public class WorkbookFunctionsStDev_SRequest extends BaseWorkbookFunctionsStDev_SRequest implements IWorkbookFunctionsStDev_SRequest {

    /**
     * The request for this WorkbookFunctionsStDev_S
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsStDev_SRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
