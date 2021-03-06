// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed Android Lob App Request.
 */
public class BaseManagedAndroidLobAppRequest extends BaseRequest implements IBaseManagedAndroidLobAppRequest {

    /**
     * The request for the ManagedAndroidLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseManagedAndroidLobAppRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<ManagedAndroidLobApp> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ManagedAndroidLobApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ManagedAndroidLobApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedAndroidLobApp from the service
     *
     * @return the ManagedAndroidLobApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAndroidLobApp get() throws ClientException {
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
     * Patches this ManagedAndroidLobApp with a source
     *
     * @param sourceManagedAndroidLobApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedAndroidLobApp sourceManagedAndroidLobApp, final ICallback<ManagedAndroidLobApp> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedAndroidLobApp);
    }

    /**
     * Patches this ManagedAndroidLobApp with a source
     *
     * @param sourceManagedAndroidLobApp the source object with updates
     * @return the updated ManagedAndroidLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAndroidLobApp patch(final ManagedAndroidLobApp sourceManagedAndroidLobApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedAndroidLobApp);
    }

    /**
     * Creates a ManagedAndroidLobApp with a new object
     *
     * @param newManagedAndroidLobApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedAndroidLobApp newManagedAndroidLobApp, final ICallback<ManagedAndroidLobApp> callback) {
        send(HttpMethod.POST, callback, newManagedAndroidLobApp);
    }

    /**
     * Creates a ManagedAndroidLobApp with a new object
     *
     * @param newManagedAndroidLobApp the new object to create
     * @return the created ManagedAndroidLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAndroidLobApp post(final ManagedAndroidLobApp newManagedAndroidLobApp) throws ClientException {
        return send(HttpMethod.POST, newManagedAndroidLobApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedAndroidLobAppRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ManagedAndroidLobAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedAndroidLobAppRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ManagedAndroidLobAppRequest)this;
     }

}

