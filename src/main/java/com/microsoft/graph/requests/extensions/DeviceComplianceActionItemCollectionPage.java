// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseDeviceComplianceActionItemCollectionPage;
import com.microsoft.graph.requests.generated.BaseDeviceComplianceActionItemCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Compliance Action Item Collection Page.
 */
public class DeviceComplianceActionItemCollectionPage extends BaseDeviceComplianceActionItemCollectionPage implements IDeviceComplianceActionItemCollectionPage {

    /**
     * A collection page for DeviceComplianceScheduledActionForRule.
     *
     * @param response the serialized BaseDeviceComplianceActionItemCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public DeviceComplianceActionItemCollectionPage(final BaseDeviceComplianceActionItemCollectionResponse response, final IDeviceComplianceActionItemCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
