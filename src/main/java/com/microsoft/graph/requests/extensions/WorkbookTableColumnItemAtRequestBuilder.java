// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookTableColumnItemAtRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Table Column Item At Request Builder.
 */
public class WorkbookTableColumnItemAtRequestBuilder extends BaseWorkbookTableColumnItemAtRequestBuilder implements IWorkbookTableColumnItemAtRequestBuilder {

    /**
     * The request builder for this WorkbookTableColumnItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param index the index
     */
    public WorkbookTableColumnItemAtRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer index) {
        super(requestUrl, client, requestOptions, index);
    }
}
