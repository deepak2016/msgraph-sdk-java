// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.DeviceComplianceUserStatus;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserStatusCollectionPage;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserStatusCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Compliance User Status Collection Request.
 */
public interface IBaseDeviceComplianceUserStatusCollectionRequest {

    void get(final ICallback<IDeviceComplianceUserStatusCollectionPage> callback);

    IDeviceComplianceUserStatusCollectionPage get() throws ClientException;

    void post(final DeviceComplianceUserStatus newDeviceComplianceUserStatus, final ICallback<DeviceComplianceUserStatus> callback);

    DeviceComplianceUserStatus post(final DeviceComplianceUserStatus newDeviceComplianceUserStatus) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceComplianceUserStatusCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceComplianceUserStatusCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDeviceComplianceUserStatusCollectionRequest top(final int value);

}
