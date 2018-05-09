// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IManagedDeviceRebootNowRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceRebootNowRequest;

/**
 * The class for the Base Managed Device Reboot Now Request Builder.
 */
public class BaseManagedDeviceRebootNowRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedDeviceRebootNow
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedDeviceRebootNowRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IManagedDeviceRebootNowRequest
     *
     * @return the IManagedDeviceRebootNowRequest instance
     */
    public IManagedDeviceRebootNowRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IManagedDeviceRebootNowRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceRebootNowRequest instance
     */
    public IManagedDeviceRebootNowRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagedDeviceRebootNowRequest request = new ManagedDeviceRebootNowRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
