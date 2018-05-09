// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsCollectionRequest;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Terms And Conditions Collection Request Builder.
 */
public interface IBaseTermsAndConditionsCollectionRequestBuilder extends IRequestBuilder {

    ITermsAndConditionsCollectionRequest buildRequest();

    ITermsAndConditionsCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    ITermsAndConditionsRequestBuilder byId(final String id);

}
