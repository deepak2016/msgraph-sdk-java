// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.ColumnDefinition;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.ColumnDefinitionRequest;
import com.microsoft.graph.requests.extensions.IColumnDefinitionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Column Definition Request.
 */
public class BaseColumnDefinitionRequest extends BaseRequest implements IBaseColumnDefinitionRequest {

    /**
     * The request for the ColumnDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseColumnDefinitionRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<ColumnDefinition> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ColumnDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ColumnDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ColumnDefinition from the service
     *
     * @return the ColumnDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ColumnDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this ColumnDefinition with a source
     *
     * @param sourceColumnDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ColumnDefinition sourceColumnDefinition, final ICallback<ColumnDefinition> callback) {
        send(HttpMethod.PATCH, callback, sourceColumnDefinition);
    }

    /**
     * Patches this ColumnDefinition with a source
     *
     * @param sourceColumnDefinition the source object with updates
     * @return the updated ColumnDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ColumnDefinition patch(final ColumnDefinition sourceColumnDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceColumnDefinition);
    }

    /**
     * Creates a ColumnDefinition with a new object
     *
     * @param newColumnDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ColumnDefinition newColumnDefinition, final ICallback<ColumnDefinition> callback) {
        send(HttpMethod.POST, callback, newColumnDefinition);
    }

    /**
     * Creates a ColumnDefinition with a new object
     *
     * @param newColumnDefinition the new object to create
     * @return the created ColumnDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ColumnDefinition post(final ColumnDefinition newColumnDefinition) throws ClientException {
        return send(HttpMethod.POST, newColumnDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IColumnDefinitionRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ColumnDefinitionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IColumnDefinitionRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ColumnDefinitionRequest)this;
     }

}

