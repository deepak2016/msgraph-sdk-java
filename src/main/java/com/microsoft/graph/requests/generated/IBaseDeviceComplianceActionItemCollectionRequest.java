// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.DeviceComplianceActionItem;
import com.microsoft.graph.requests.extensions.IDeviceComplianceActionItemCollectionPage;
import com.microsoft.graph.requests.extensions.IDeviceComplianceActionItemCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Compliance Action Item Collection Request.
 */
public interface IBaseDeviceComplianceActionItemCollectionRequest {

    void get(final ICallback<IDeviceComplianceActionItemCollectionPage> callback);

    IDeviceComplianceActionItemCollectionPage get() throws ClientException;

    void post(final DeviceComplianceActionItem newDeviceComplianceActionItem, final ICallback<DeviceComplianceActionItem> callback);

    DeviceComplianceActionItem post(final DeviceComplianceActionItem newDeviceComplianceActionItem) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceComplianceActionItemCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceComplianceActionItemCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDeviceComplianceActionItemCollectionRequest top(final int value);

}
