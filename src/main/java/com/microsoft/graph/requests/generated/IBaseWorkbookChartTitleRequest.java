// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.WorkbookChartTitle;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Chart Title Request.
 */
public interface IBaseWorkbookChartTitleRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChartTitle from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookChartTitle> callback);

    /**
     * Gets the WorkbookChartTitle from the service
     *
     * @return the WorkbookChartTitle from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartTitle get() throws ClientException;

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
     * Patches this WorkbookChartTitle with a source
     *
     * @param sourceWorkbookChartTitle the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookChartTitle sourceWorkbookChartTitle, final ICallback<WorkbookChartTitle> callback);

    /**
     * Patches this WorkbookChartTitle with a source
     *
     * @param sourceWorkbookChartTitle the source object with updates
     * @return the updated WorkbookChartTitle
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartTitle patch(final WorkbookChartTitle sourceWorkbookChartTitle) throws ClientException;

    /**
     * Posts a WorkbookChartTitle with a new object
     *
     * @param newWorkbookChartTitle the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookChartTitle newWorkbookChartTitle, final ICallback<WorkbookChartTitle> callback);

    /**
     * Posts a WorkbookChartTitle with a new object
     *
     * @param newWorkbookChartTitle the new object to create
     * @return the created WorkbookChartTitle
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartTitle post(final WorkbookChartTitle newWorkbookChartTitle) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWorkbookChartTitleRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWorkbookChartTitleRequest expand(final String value);

}

