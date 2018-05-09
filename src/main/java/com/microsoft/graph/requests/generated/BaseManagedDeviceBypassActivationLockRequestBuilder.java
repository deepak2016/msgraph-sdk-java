// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IManagedDeviceBypassActivationLockRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceBypassActivationLockRequest;

/**
 * The class for the Base Managed Device Bypass Activation Lock Request Builder.
 */
public class BaseManagedDeviceBypassActivationLockRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedDeviceBypassActivationLock
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedDeviceBypassActivationLockRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IManagedDeviceBypassActivationLockRequest
     *
     * @return the IManagedDeviceBypassActivationLockRequest instance
     */
    public IManagedDeviceBypassActivationLockRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IManagedDeviceBypassActivationLockRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceBypassActivationLockRequest instance
     */
    public IManagedDeviceBypassActivationLockRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagedDeviceBypassActivationLockRequest request = new ManagedDeviceBypassActivationLockRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
