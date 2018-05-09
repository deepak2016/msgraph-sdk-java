// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.IosCustomConfiguration;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Ios Custom Configuration Request.
 */
public interface IBaseIosCustomConfigurationRequest extends IHttpRequest {

    /**
     * Gets the IosCustomConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<IosCustomConfiguration> callback);

    /**
     * Gets the IosCustomConfiguration from the service
     *
     * @return the IosCustomConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosCustomConfiguration get() throws ClientException;

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
     * Patches this IosCustomConfiguration with a source
     *
     * @param sourceIosCustomConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IosCustomConfiguration sourceIosCustomConfiguration, final ICallback<IosCustomConfiguration> callback);

    /**
     * Patches this IosCustomConfiguration with a source
     *
     * @param sourceIosCustomConfiguration the source object with updates
     * @return the updated IosCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosCustomConfiguration patch(final IosCustomConfiguration sourceIosCustomConfiguration) throws ClientException;

    /**
     * Posts a IosCustomConfiguration with a new object
     *
     * @param newIosCustomConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IosCustomConfiguration newIosCustomConfiguration, final ICallback<IosCustomConfiguration> callback);

    /**
     * Posts a IosCustomConfiguration with a new object
     *
     * @param newIosCustomConfiguration the new object to create
     * @return the created IosCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosCustomConfiguration post(final IosCustomConfiguration newIosCustomConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseIosCustomConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseIosCustomConfigurationRequest expand(final String value);

}

