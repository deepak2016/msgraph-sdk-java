// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import java.io.InputStream;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseStreamRequest;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Drive Item Stream Request.
 */
public class BaseDriveItemStreamRequest extends BaseStreamRequest<DriveItem> implements IBaseDriveItemStreamRequest {

    /**
     * The request for this DriveItemStream
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseDriveItemStreamRequest(
                         final String requestUrl,
                         final IBaseClient client,
                         final java.util.List<? extends Option> requestOptions,
                         final Class<DriveItem> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the contents of this stream
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<InputStream> callback) {
        send(callback);
    }

    /**
     * Gets the contents of this stream
     *
     * @return the stream that the caller needs to close
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public InputStream get() throws ClientException {
       return send();
    }

    /**
     * Uploads to the stream
     *
     * @param fileContents the contents of the stream to upload
     * @param callback the callback to be called after success or failure
     */
    public void put(final byte[] fileContents, final ICallback<DriveItem> callback) {
        send(fileContents, callback);
    }

    /**
     * Uploads to the stream
     *
     * @param fileContents the contents of the stream to upload
     * @return the result of the upload
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public DriveItem put(final byte[] fileContents) throws ClientException {
        return send(fileContents);
    }
}
