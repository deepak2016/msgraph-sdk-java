// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesCountRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Chart Series Count Request.
 */
public interface IBaseWorkbookChartSeriesCountRequest {

    /**
     * Gets the Integer
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Integer> callback);

    /**
     * Gets the Integer
     *
     * @return the Integer
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Integer get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookChartSeriesCountRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookChartSeriesCountRequest expand(final String value);

}
