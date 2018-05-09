// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseSingleValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.generated.BaseSingleValueLegacyExtendedPropertyCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Single Value Legacy Extended Property Collection Page.
 */
public class SingleValueLegacyExtendedPropertyCollectionPage extends BaseSingleValueLegacyExtendedPropertyCollectionPage implements ISingleValueLegacyExtendedPropertyCollectionPage {

    /**
     * A collection page for Post.
     *
     * @param response the serialized BaseSingleValueLegacyExtendedPropertyCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public SingleValueLegacyExtendedPropertyCollectionPage(final BaseSingleValueLegacyExtendedPropertyCollectionResponse response, final ISingleValueLegacyExtendedPropertyCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
