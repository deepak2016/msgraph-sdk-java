// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Drive Collection Page.
 */
public class BaseDriveCollectionPage extends BaseCollectionPage<Drive, IDriveCollectionRequestBuilder> implements IBaseDriveCollectionPage {

    /**
     * A collection page for Drive
     *
     * @param response the serialized BaseDriveCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseDriveCollectionPage(final BaseDriveCollectionResponse response, final IDriveCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
