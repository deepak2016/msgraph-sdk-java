// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.requests.extensions.IDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Management Verify Windows Enrollment Auto Discovery Request.
 */
public interface IBaseDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest {

    /**
     * Gets the Boolean
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Boolean> callback);

    /**
     * Gets the Boolean
     *
     * @return the Boolean
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Boolean get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest expand(final String value);

}
