// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.EventRequest;
import com.microsoft.graph.requests.extensions.IEventRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Event Request.
 */
public class BaseEventRequest extends BaseRequest implements IBaseEventRequest {

    /**
     * The request for the Event
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseEventRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<Event> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the Event from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Event> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Event from the service
     *
     * @return the Event from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Event get() throws ClientException {
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
     * Patches this Event with a source
     *
     * @param sourceEvent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Event sourceEvent, final ICallback<Event> callback) {
        send(HttpMethod.PATCH, callback, sourceEvent);
    }

    /**
     * Patches this Event with a source
     *
     * @param sourceEvent the source object with updates
     * @return the updated Event
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Event patch(final Event sourceEvent) throws ClientException {
        return send(HttpMethod.PATCH, sourceEvent);
    }

    /**
     * Creates a Event with a new object
     *
     * @param newEvent the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Event newEvent, final ICallback<Event> callback) {
        send(HttpMethod.POST, callback, newEvent);
    }

    /**
     * Creates a Event with a new object
     *
     * @param newEvent the new object to create
     * @return the created Event
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Event post(final Event newEvent) throws ClientException {
        return send(HttpMethod.POST, newEvent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEventRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (EventRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEventRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (EventRequest)this;
     }

}

