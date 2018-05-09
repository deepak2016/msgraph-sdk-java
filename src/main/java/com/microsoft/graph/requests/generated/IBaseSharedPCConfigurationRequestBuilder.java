// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.ISharedPCConfigurationRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Shared PCConfiguration Request Builder.
 */
public interface IBaseSharedPCConfigurationRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ISharedPCConfigurationRequest instance
     */
    ISharedPCConfigurationRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISharedPCConfigurationRequest instance
     */
    ISharedPCConfigurationRequest buildRequest(final java.util.List<? extends Option> requestOptions);

}
