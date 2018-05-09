// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCheckMemberGroupsCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Directory Object Check Member Groups Collection Page.
 */
public class BaseDirectoryObjectCheckMemberGroupsCollectionPage extends BaseCollectionPage<String, IDirectoryObjectCheckMemberGroupsCollectionRequestBuilder> implements IBaseDirectoryObjectCheckMemberGroupsCollectionPage {

    /**
     * A collection page for DirectoryObjectCheckMemberGroups.
     *
     * @param response The serialized BaseDirectoryObjectCheckMemberGroupsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public BaseDirectoryObjectCheckMemberGroupsCollectionPage(final BaseDirectoryObjectCheckMemberGroupsCollectionResponse response, final IDirectoryObjectCheckMemberGroupsCollectionRequestBuilder builder) {
       super(response.value, builder);
    }
}
