// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.requests.extensions.IManagedDeviceCollectionPage;
import com.microsoft.graph.requests.extensions.IManagedDeviceCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Managed Device Collection Request.
 */
public interface IBaseManagedDeviceCollectionRequest {

    void get(final ICallback<IManagedDeviceCollectionPage> callback);

    IManagedDeviceCollectionPage get() throws ClientException;

    void post(final ManagedDevice newManagedDevice, final ICallback<ManagedDevice> callback);

    ManagedDevice post(final ManagedDevice newManagedDevice) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagedDeviceCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagedDeviceCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IManagedDeviceCollectionRequest top(final int value);

}
