// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IManagedDeviceShutDownRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceShutDownRequest;

/**
 * The class for the Base Managed Device Shut Down Request Builder.
 */
public class BaseManagedDeviceShutDownRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedDeviceShutDown
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedDeviceShutDownRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IManagedDeviceShutDownRequest
     *
     * @return the IManagedDeviceShutDownRequest instance
     */
    public IManagedDeviceShutDownRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IManagedDeviceShutDownRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceShutDownRequest instance
     */
    public IManagedDeviceShutDownRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagedDeviceShutDownRequest request = new ManagedDeviceShutDownRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
