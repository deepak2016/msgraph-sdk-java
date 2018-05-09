// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Directory Object Collection With References Request Builder.
 */
public interface IBaseDirectoryObjectCollectionWithReferencesRequestBuilder extends IRequestBuilder {

    IDirectoryObjectCollectionWithReferencesRequest buildRequest();

    IDirectoryObjectCollectionWithReferencesRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IDirectoryObjectWithReferenceRequestBuilder byId(final String id);

    IDirectoryObjectCollectionReferenceRequestBuilder references();
}
