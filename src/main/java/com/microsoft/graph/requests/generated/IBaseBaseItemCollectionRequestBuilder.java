// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IBaseItemCollectionRequest;
import com.microsoft.graph.requests.extensions.IBaseItemRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Base Item Collection Request Builder.
 */
public interface IBaseBaseItemCollectionRequestBuilder extends IRequestBuilder {

    IBaseItemCollectionRequest buildRequest();

    IBaseItemCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IBaseItemRequestBuilder byId(final String id);

}
