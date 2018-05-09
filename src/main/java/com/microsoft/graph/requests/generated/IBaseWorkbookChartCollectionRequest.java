// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.requests.extensions.IWorkbookChartCollectionPage;
import com.microsoft.graph.requests.extensions.IWorkbookChartCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Chart Collection Request.
 */
public interface IBaseWorkbookChartCollectionRequest {

    void get(final ICallback<IWorkbookChartCollectionPage> callback);

    IWorkbookChartCollectionPage get() throws ClientException;

    void post(final WorkbookChart newWorkbookChart, final ICallback<WorkbookChart> callback);

    WorkbookChart post(final WorkbookChart newWorkbookChart) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookChartCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookChartCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IWorkbookChartCollectionRequest top(final int value);

}
