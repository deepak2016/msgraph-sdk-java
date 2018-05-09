// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.SchemaExtension;
import com.microsoft.graph.requests.extensions.ISchemaExtensionCollectionPage;
import com.microsoft.graph.requests.extensions.ISchemaExtensionCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Schema Extension Collection Request.
 */
public interface IBaseSchemaExtensionCollectionRequest {

    void get(final ICallback<ISchemaExtensionCollectionPage> callback);

    ISchemaExtensionCollectionPage get() throws ClientException;

    void post(final SchemaExtension newSchemaExtension, final ICallback<SchemaExtension> callback);

    SchemaExtension post(final SchemaExtension newSchemaExtension) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISchemaExtensionCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISchemaExtensionCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    ISchemaExtensionCollectionRequest top(final int value);

}
