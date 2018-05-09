// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetProtectionUnprotectRequest;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetProtectionUnprotectRequest;

/**
 * The class for the Base Workbook Worksheet Protection Unprotect Request Builder.
 */
public class BaseWorkbookWorksheetProtectionUnprotectRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookWorksheetProtectionUnprotect
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookWorksheetProtectionUnprotectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookWorksheetProtectionUnprotectRequest
     *
     * @return the IWorkbookWorksheetProtectionUnprotectRequest instance
     */
    public IWorkbookWorksheetProtectionUnprotectRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookWorksheetProtectionUnprotectRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookWorksheetProtectionUnprotectRequest instance
     */
    public IWorkbookWorksheetProtectionUnprotectRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookWorksheetProtectionUnprotectRequest request = new WorkbookWorksheetProtectionUnprotectRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
