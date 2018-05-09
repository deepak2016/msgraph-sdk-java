// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IManagedDeviceCleanWindowsDeviceRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceCleanWindowsDeviceRequest;

/**
 * The class for the Base Managed Device Clean Windows Device Request Builder.
 */
public class BaseManagedDeviceCleanWindowsDeviceRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedDeviceCleanWindowsDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param keepUserData the keepUserData
     */
    public BaseManagedDeviceCleanWindowsDeviceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Boolean keepUserData) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("keepUserData", keepUserData);
    }

    /**
     * Creates the IManagedDeviceCleanWindowsDeviceRequest
     *
     * @return the IManagedDeviceCleanWindowsDeviceRequest instance
     */
    public IManagedDeviceCleanWindowsDeviceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IManagedDeviceCleanWindowsDeviceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceCleanWindowsDeviceRequest instance
     */
    public IManagedDeviceCleanWindowsDeviceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagedDeviceCleanWindowsDeviceRequest request = new ManagedDeviceCleanWindowsDeviceRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("keepUserData")) {
            request.body.keepUserData = getParameter("keepUserData");
        }

        return request;
    }
}
