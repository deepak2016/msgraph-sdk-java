// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseManagedAppOperationCollectionPage;
import com.microsoft.graph.requests.generated.BaseManagedAppOperationCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Managed App Operation Collection Page.
 */
public class ManagedAppOperationCollectionPage extends BaseManagedAppOperationCollectionPage implements IManagedAppOperationCollectionPage {

    /**
     * A collection page for ManagedAppRegistration.
     *
     * @param response the serialized BaseManagedAppOperationCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public ManagedAppOperationCollectionPage(final BaseManagedAppOperationCollectionResponse response, final IManagedAppOperationCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
