// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.ReferenceAttachment;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IReferenceAttachmentRequest;
import com.microsoft.graph.requests.extensions.ReferenceAttachmentRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Reference Attachment Request.
 */
public class BaseReferenceAttachmentRequest extends BaseRequest implements IBaseReferenceAttachmentRequest {

    /**
     * The request for the ReferenceAttachment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseReferenceAttachmentRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<ReferenceAttachment> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ReferenceAttachment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ReferenceAttachment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ReferenceAttachment from the service
     *
     * @return the ReferenceAttachment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReferenceAttachment get() throws ClientException {
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
     * Patches this ReferenceAttachment with a source
     *
     * @param sourceReferenceAttachment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ReferenceAttachment sourceReferenceAttachment, final ICallback<ReferenceAttachment> callback) {
        send(HttpMethod.PATCH, callback, sourceReferenceAttachment);
    }

    /**
     * Patches this ReferenceAttachment with a source
     *
     * @param sourceReferenceAttachment the source object with updates
     * @return the updated ReferenceAttachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReferenceAttachment patch(final ReferenceAttachment sourceReferenceAttachment) throws ClientException {
        return send(HttpMethod.PATCH, sourceReferenceAttachment);
    }

    /**
     * Creates a ReferenceAttachment with a new object
     *
     * @param newReferenceAttachment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ReferenceAttachment newReferenceAttachment, final ICallback<ReferenceAttachment> callback) {
        send(HttpMethod.POST, callback, newReferenceAttachment);
    }

    /**
     * Creates a ReferenceAttachment with a new object
     *
     * @param newReferenceAttachment the new object to create
     * @return the created ReferenceAttachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReferenceAttachment post(final ReferenceAttachment newReferenceAttachment) throws ClientException {
        return send(HttpMethod.POST, newReferenceAttachment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IReferenceAttachmentRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ReferenceAttachmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IReferenceAttachmentRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ReferenceAttachmentRequest)this;
     }

}

