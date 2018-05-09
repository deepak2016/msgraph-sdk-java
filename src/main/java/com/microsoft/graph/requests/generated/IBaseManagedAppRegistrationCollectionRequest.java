// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationCollectionPage;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Managed App Registration Collection Request.
 */
public interface IBaseManagedAppRegistrationCollectionRequest {

    void get(final ICallback<IManagedAppRegistrationCollectionPage> callback);

    IManagedAppRegistrationCollectionPage get() throws ClientException;

    void post(final ManagedAppRegistration newManagedAppRegistration, final ICallback<ManagedAppRegistration> callback);

    ManagedAppRegistration post(final ManagedAppRegistration newManagedAppRegistration) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagedAppRegistrationCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagedAppRegistrationCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IManagedAppRegistrationCollectionRequest top(final int value);

}
