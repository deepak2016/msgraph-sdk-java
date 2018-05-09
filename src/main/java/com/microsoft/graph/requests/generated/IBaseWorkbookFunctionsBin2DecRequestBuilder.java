// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBin2DecRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Bin2Dec Request Builder.
 */
public interface IBaseWorkbookFunctionsBin2DecRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsBin2DecRequest
     *
     * @return the IWorkbookFunctionsBin2DecRequest instance
     */
    IWorkbookFunctionsBin2DecRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsBin2DecRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBin2DecRequest instance
     */
    IWorkbookFunctionsBin2DecRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
