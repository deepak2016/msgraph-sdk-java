// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.WorkbookNamedItem;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Named Item Request.
 */
public interface IBaseWorkbookNamedItemRequest extends IHttpRequest {

    /**
     * Gets the WorkbookNamedItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookNamedItem> callback);

    /**
     * Gets the WorkbookNamedItem from the service
     *
     * @return the WorkbookNamedItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookNamedItem get() throws ClientException;

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
     * Patches this WorkbookNamedItem with a source
     *
     * @param sourceWorkbookNamedItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookNamedItem sourceWorkbookNamedItem, final ICallback<WorkbookNamedItem> callback);

    /**
     * Patches this WorkbookNamedItem with a source
     *
     * @param sourceWorkbookNamedItem the source object with updates
     * @return the updated WorkbookNamedItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookNamedItem patch(final WorkbookNamedItem sourceWorkbookNamedItem) throws ClientException;

    /**
     * Posts a WorkbookNamedItem with a new object
     *
     * @param newWorkbookNamedItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookNamedItem newWorkbookNamedItem, final ICallback<WorkbookNamedItem> callback);

    /**
     * Posts a WorkbookNamedItem with a new object
     *
     * @param newWorkbookNamedItem the new object to create
     * @return the created WorkbookNamedItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookNamedItem post(final WorkbookNamedItem newWorkbookNamedItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWorkbookNamedItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWorkbookNamedItemRequest expand(final String value);

}

