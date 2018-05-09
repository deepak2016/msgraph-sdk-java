// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.DirectoryRole;
import com.microsoft.graph.requests.extensions.IDirectoryRoleCollectionPage;
import com.microsoft.graph.requests.extensions.IDirectoryRoleCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Directory Role Collection Request.
 */
public interface IBaseDirectoryRoleCollectionRequest {

    void get(final ICallback<IDirectoryRoleCollectionPage> callback);

    IDirectoryRoleCollectionPage get() throws ClientException;

    void post(final DirectoryRole newDirectoryRole, final ICallback<DirectoryRole> callback);

    DirectoryRole post(final DirectoryRole newDirectoryRole) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDirectoryRoleCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDirectoryRoleCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDirectoryRoleCollectionRequest top(final int value);

}
