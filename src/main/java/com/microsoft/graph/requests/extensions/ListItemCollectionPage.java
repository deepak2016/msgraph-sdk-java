// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseListItemCollectionPage;
import com.microsoft.graph.requests.generated.BaseListItemCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the List Item Collection Page.
 */
public class ListItemCollectionPage extends BaseListItemCollectionPage implements IListItemCollectionPage {

    /**
     * A collection page for List.
     *
     * @param response the serialized BaseListItemCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ListItemCollectionPage(final BaseListItemCollectionResponse response, final IListItemCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
