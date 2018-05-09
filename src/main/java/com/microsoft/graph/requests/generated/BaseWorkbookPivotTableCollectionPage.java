// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.WorkbookPivotTable;
import com.microsoft.graph.requests.extensions.IWorkbookPivotTableCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Pivot Table Collection Page.
 */
public class BaseWorkbookPivotTableCollectionPage extends BaseCollectionPage<WorkbookPivotTable, IWorkbookPivotTableCollectionRequestBuilder> implements IBaseWorkbookPivotTableCollectionPage {

    /**
     * A collection page for WorkbookPivotTable
     *
     * @param response the serialized BaseWorkbookPivotTableCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseWorkbookPivotTableCollectionPage(final BaseWorkbookPivotTableCollectionResponse response, final IWorkbookPivotTableCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
