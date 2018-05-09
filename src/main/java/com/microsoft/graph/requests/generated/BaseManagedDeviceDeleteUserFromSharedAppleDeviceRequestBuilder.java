// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IManagedDeviceDeleteUserFromSharedAppleDeviceRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceDeleteUserFromSharedAppleDeviceRequest;

/**
 * The class for the Base Managed Device Delete User From Shared Apple Device Request Builder.
 */
public class BaseManagedDeviceDeleteUserFromSharedAppleDeviceRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedDeviceDeleteUserFromSharedAppleDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param userPrincipalName the userPrincipalName
     */
    public BaseManagedDeviceDeleteUserFromSharedAppleDeviceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String userPrincipalName) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("userPrincipalName", userPrincipalName);
    }

    /**
     * Creates the IManagedDeviceDeleteUserFromSharedAppleDeviceRequest
     *
     * @return the IManagedDeviceDeleteUserFromSharedAppleDeviceRequest instance
     */
    public IManagedDeviceDeleteUserFromSharedAppleDeviceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IManagedDeviceDeleteUserFromSharedAppleDeviceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceDeleteUserFromSharedAppleDeviceRequest instance
     */
    public IManagedDeviceDeleteUserFromSharedAppleDeviceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagedDeviceDeleteUserFromSharedAppleDeviceRequest request = new ManagedDeviceDeleteUserFromSharedAppleDeviceRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("userPrincipalName")) {
            request.body.userPrincipalName = getParameter("userPrincipalName");
        }

        return request;
    }
}
