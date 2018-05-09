// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IManagedDeviceRemoteLockRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceRemoteLockRequest;

/**
 * The class for the Base Managed Device Remote Lock Request Builder.
 */
public class BaseManagedDeviceRemoteLockRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedDeviceRemoteLock
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedDeviceRemoteLockRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IManagedDeviceRemoteLockRequest
     *
     * @return the IManagedDeviceRemoteLockRequest instance
     */
    public IManagedDeviceRemoteLockRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IManagedDeviceRemoteLockRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceRemoteLockRequest instance
     */
    public IManagedDeviceRemoteLockRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagedDeviceRemoteLockRequest request = new ManagedDeviceRemoteLockRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
