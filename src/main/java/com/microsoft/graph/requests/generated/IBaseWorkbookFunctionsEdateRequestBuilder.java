// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsEdateRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Edate Request Builder.
 */
public interface IBaseWorkbookFunctionsEdateRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsEdateRequest
     *
     * @return the IWorkbookFunctionsEdateRequest instance
     */
    IWorkbookFunctionsEdateRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsEdateRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsEdateRequest instance
     */
    IWorkbookFunctionsEdateRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
