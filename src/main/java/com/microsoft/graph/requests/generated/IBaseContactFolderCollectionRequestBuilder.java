// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IContactFolderCollectionRequest;
import com.microsoft.graph.requests.extensions.IContactFolderDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContactFolderRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Contact Folder Collection Request Builder.
 */
public interface IBaseContactFolderCollectionRequestBuilder extends IRequestBuilder {

    IContactFolderCollectionRequest buildRequest();

    IContactFolderCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IContactFolderRequestBuilder byId(final String id);


    IContactFolderDeltaCollectionRequestBuilder delta();

	IContactFolderDeltaCollectionRequestBuilder delta(final String deltaLink);
}
