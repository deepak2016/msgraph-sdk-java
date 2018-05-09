// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.requests.extensions.INotebookGetRecentNotebooksCollectionPage;
import com.microsoft.graph.requests.extensions.INotebookGetRecentNotebooksCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Notebook Get Recent Notebooks Collection Request.
 */
public interface IBaseNotebookGetRecentNotebooksCollectionRequest {

    void get(final ICallback<INotebookGetRecentNotebooksCollectionPage> callback);

    INotebookGetRecentNotebooksCollectionPage get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    INotebookGetRecentNotebooksCollectionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    INotebookGetRecentNotebooksCollectionRequest expand(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    INotebookGetRecentNotebooksCollectionRequest top(final int value);

}
