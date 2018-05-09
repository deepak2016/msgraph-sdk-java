// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseWorkbookTableCollectionPage;
import com.microsoft.graph.requests.generated.BaseWorkbookTableCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Table Collection Page.
 */
public class WorkbookTableCollectionPage extends BaseWorkbookTableCollectionPage implements IWorkbookTableCollectionPage {

    /**
     * A collection page for WorkbookWorksheet.
     *
     * @param response the serialized BaseWorkbookTableCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public WorkbookTableCollectionPage(final BaseWorkbookTableCollectionResponse response, final IWorkbookTableCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
