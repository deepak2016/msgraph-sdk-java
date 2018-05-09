// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.IosVppEBook;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Ios Vpp EBook Request.
 */
public interface IBaseIosVppEBookRequest extends IHttpRequest {

    /**
     * Gets the IosVppEBook from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<IosVppEBook> callback);

    /**
     * Gets the IosVppEBook from the service
     *
     * @return the IosVppEBook from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosVppEBook get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this IosVppEBook with a source
     *
     * @param sourceIosVppEBook the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IosVppEBook sourceIosVppEBook, final ICallback<IosVppEBook> callback);

    /**
     * Patches this IosVppEBook with a source
     *
     * @param sourceIosVppEBook the source object with updates
     * @return the updated IosVppEBook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosVppEBook patch(final IosVppEBook sourceIosVppEBook) throws ClientException;

    /**
     * Posts a IosVppEBook with a new object
     *
     * @param newIosVppEBook the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IosVppEBook newIosVppEBook, final ICallback<IosVppEBook> callback);

    /**
     * Posts a IosVppEBook with a new object
     *
     * @param newIosVppEBook the new object to create
     * @return the created IosVppEBook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosVppEBook post(final IosVppEBook newIosVppEBook) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseIosVppEBookRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseIosVppEBookRequest expand(final String value);

}

