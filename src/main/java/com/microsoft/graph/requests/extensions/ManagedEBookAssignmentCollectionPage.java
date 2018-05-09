// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseManagedEBookAssignmentCollectionPage;
import com.microsoft.graph.requests.generated.BaseManagedEBookAssignmentCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed EBook Assignment Collection Page.
 */
public class ManagedEBookAssignmentCollectionPage extends BaseManagedEBookAssignmentCollectionPage implements IManagedEBookAssignmentCollectionPage {

    /**
     * A collection page for ManagedEBook.
     *
     * @param response the serialized BaseManagedEBookAssignmentCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ManagedEBookAssignmentCollectionPage(final BaseManagedEBookAssignmentCollectionResponse response, final IManagedEBookAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
