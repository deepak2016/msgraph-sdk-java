// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IManagedDeviceWindowsDefenderUpdateSignaturesRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceWindowsDefenderUpdateSignaturesRequest;

/**
 * The class for the Base Managed Device Windows Defender Update Signatures Request Builder.
 */
public class BaseManagedDeviceWindowsDefenderUpdateSignaturesRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedDeviceWindowsDefenderUpdateSignatures
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedDeviceWindowsDefenderUpdateSignaturesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IManagedDeviceWindowsDefenderUpdateSignaturesRequest
     *
     * @return the IManagedDeviceWindowsDefenderUpdateSignaturesRequest instance
     */
    public IManagedDeviceWindowsDefenderUpdateSignaturesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IManagedDeviceWindowsDefenderUpdateSignaturesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceWindowsDefenderUpdateSignaturesRequest instance
     */
    public IManagedDeviceWindowsDefenderUpdateSignaturesRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagedDeviceWindowsDefenderUpdateSignaturesRequest request = new ManagedDeviceWindowsDefenderUpdateSignaturesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
