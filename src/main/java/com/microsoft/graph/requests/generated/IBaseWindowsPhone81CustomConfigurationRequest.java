// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.WindowsPhone81CustomConfiguration;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Windows Phone81Custom Configuration Request.
 */
public interface IBaseWindowsPhone81CustomConfigurationRequest extends IHttpRequest {

    /**
     * Gets the WindowsPhone81CustomConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WindowsPhone81CustomConfiguration> callback);

    /**
     * Gets the WindowsPhone81CustomConfiguration from the service
     *
     * @return the WindowsPhone81CustomConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81CustomConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsPhone81CustomConfiguration with a source
     *
     * @param sourceWindowsPhone81CustomConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsPhone81CustomConfiguration sourceWindowsPhone81CustomConfiguration, final ICallback<WindowsPhone81CustomConfiguration> callback);

    /**
     * Patches this WindowsPhone81CustomConfiguration with a source
     *
     * @param sourceWindowsPhone81CustomConfiguration the source object with updates
     * @return the updated WindowsPhone81CustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81CustomConfiguration patch(final WindowsPhone81CustomConfiguration sourceWindowsPhone81CustomConfiguration) throws ClientException;

    /**
     * Posts a WindowsPhone81CustomConfiguration with a new object
     *
     * @param newWindowsPhone81CustomConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsPhone81CustomConfiguration newWindowsPhone81CustomConfiguration, final ICallback<WindowsPhone81CustomConfiguration> callback);

    /**
     * Posts a WindowsPhone81CustomConfiguration with a new object
     *
     * @param newWindowsPhone81CustomConfiguration the new object to create
     * @return the created WindowsPhone81CustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhone81CustomConfiguration post(final WindowsPhone81CustomConfiguration newWindowsPhone81CustomConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWindowsPhone81CustomConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWindowsPhone81CustomConfigurationRequest expand(final String value);

}

