// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.OnenotePage;
import com.microsoft.graph.requests.extensions.IOnenotePageCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Onenote Page Collection Page.
 */
public class BaseOnenotePageCollectionPage extends BaseCollectionPage<OnenotePage, IOnenotePageCollectionRequestBuilder> implements IBaseOnenotePageCollectionPage {

    /**
     * A collection page for OnenotePage
     *
     * @param response the serialized BaseOnenotePageCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseOnenotePageCollectionPage(final BaseOnenotePageCollectionResponse response, final IOnenotePageCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
