// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Compliance Policy State Request Builder.
 */
public interface IBaseDeviceCompliancePolicyStateRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDeviceCompliancePolicyStateRequest instance
     */
    IDeviceCompliancePolicyStateRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceCompliancePolicyStateRequest instance
     */
    IDeviceCompliancePolicyStateRequest buildRequest(final java.util.List<? extends Option> requestOptions);

}
