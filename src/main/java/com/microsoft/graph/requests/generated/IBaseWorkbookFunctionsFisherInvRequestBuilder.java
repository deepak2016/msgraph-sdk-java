// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsFisherInvRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Fisher Inv Request Builder.
 */
public interface IBaseWorkbookFunctionsFisherInvRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsFisherInvRequest
     *
     * @return the IWorkbookFunctionsFisherInvRequest instance
     */
    IWorkbookFunctionsFisherInvRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsFisherInvRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFisherInvRequest instance
     */
    IWorkbookFunctionsFisherInvRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
