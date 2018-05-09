// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseOnenoteSectionCopyToNotebookRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Onenote Section Copy To Notebook Request Builder.
 */
public class OnenoteSectionCopyToNotebookRequestBuilder extends BaseOnenoteSectionCopyToNotebookRequestBuilder implements IOnenoteSectionCopyToNotebookRequestBuilder {

    /**
     * The request builder for this OnenoteSectionCopyToNotebook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param id the id
     * @param groupId the groupId
     * @param renameAs the renameAs
     */
    public OnenoteSectionCopyToNotebookRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String id, final String groupId, final String renameAs) {
        super(requestUrl, client, requestOptions, id, groupId, renameAs);
    }
}
