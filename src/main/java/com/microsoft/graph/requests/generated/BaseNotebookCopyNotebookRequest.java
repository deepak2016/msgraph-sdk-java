// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.NotebookCopyNotebookBody;
import com.microsoft.graph.models.extensions.OnenoteOperation;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.INotebookCopyNotebookRequest;
import com.microsoft.graph.requests.extensions.NotebookCopyNotebookRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Notebook Copy Notebook Request.
 */
public class BaseNotebookCopyNotebookRequest extends BaseRequest implements IBaseNotebookCopyNotebookRequest {
    protected final NotebookCopyNotebookBody body;

    /**
     * The request for this NotebookCopyNotebook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseNotebookCopyNotebookRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnenoteOperation.class);
        body = new NotebookCopyNotebookBody();
    }

    public void post(final ICallback<OnenoteOperation> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public OnenoteOperation post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public INotebookCopyNotebookRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (NotebookCopyNotebookRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public INotebookCopyNotebookRequest top(final int value) {
        getQueryOptions().add(new QueryOption("$top", value+""));
        return (NotebookCopyNotebookRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public INotebookCopyNotebookRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (NotebookCopyNotebookRequest)this;
    }

}
