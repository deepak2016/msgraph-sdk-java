// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IDeviceComplianceActionItemCollectionRequest;
import com.microsoft.graph.requests.extensions.IDeviceComplianceActionItemRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Compliance Action Item Collection Request Builder.
 */
public interface IBaseDeviceComplianceActionItemCollectionRequestBuilder extends IRequestBuilder {

    IDeviceComplianceActionItemCollectionRequest buildRequest();

    IDeviceComplianceActionItemCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IDeviceComplianceActionItemRequestBuilder byId(final String id);

}
