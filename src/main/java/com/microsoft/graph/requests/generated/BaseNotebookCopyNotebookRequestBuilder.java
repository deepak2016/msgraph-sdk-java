// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.INotebookCopyNotebookRequest;
import com.microsoft.graph.requests.extensions.NotebookCopyNotebookRequest;

/**
 * The class for the Base Notebook Copy Notebook Request Builder.
 */
public class BaseNotebookCopyNotebookRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this NotebookCopyNotebook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param groupId the groupId
     * @param renameAs the renameAs
     * @param notebookFolder the notebookFolder
     */
    public BaseNotebookCopyNotebookRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String groupId, final String renameAs, final String notebookFolder) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("groupId", groupId);
        bodyParams.put("renameAs", renameAs);
        bodyParams.put("notebookFolder", notebookFolder);
    }

    /**
     * Creates the INotebookCopyNotebookRequest
     *
     * @return the INotebookCopyNotebookRequest instance
     */
    public INotebookCopyNotebookRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the INotebookCopyNotebookRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the INotebookCopyNotebookRequest instance
     */
    public INotebookCopyNotebookRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        NotebookCopyNotebookRequest request = new NotebookCopyNotebookRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("groupId")) {
            request.body.groupId = getParameter("groupId");
        }

        if (hasParameter("renameAs")) {
            request.body.renameAs = getParameter("renameAs");
        }

        if (hasParameter("notebookFolder")) {
            request.body.notebookFolder = getParameter("notebookFolder");
        }

        return request;
    }
}
