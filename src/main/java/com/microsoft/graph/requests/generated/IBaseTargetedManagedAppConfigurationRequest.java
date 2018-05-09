// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.TargetedManagedAppConfiguration;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Targeted Managed App Configuration Request.
 */
public interface IBaseTargetedManagedAppConfigurationRequest extends IHttpRequest {

    /**
     * Gets the TargetedManagedAppConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<TargetedManagedAppConfiguration> callback);

    /**
     * Gets the TargetedManagedAppConfiguration from the service
     *
     * @return the TargetedManagedAppConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TargetedManagedAppConfiguration get() throws ClientException;

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
     * Patches this TargetedManagedAppConfiguration with a source
     *
     * @param sourceTargetedManagedAppConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TargetedManagedAppConfiguration sourceTargetedManagedAppConfiguration, final ICallback<TargetedManagedAppConfiguration> callback);

    /**
     * Patches this TargetedManagedAppConfiguration with a source
     *
     * @param sourceTargetedManagedAppConfiguration the source object with updates
     * @return the updated TargetedManagedAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TargetedManagedAppConfiguration patch(final TargetedManagedAppConfiguration sourceTargetedManagedAppConfiguration) throws ClientException;

    /**
     * Posts a TargetedManagedAppConfiguration with a new object
     *
     * @param newTargetedManagedAppConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TargetedManagedAppConfiguration newTargetedManagedAppConfiguration, final ICallback<TargetedManagedAppConfiguration> callback);

    /**
     * Posts a TargetedManagedAppConfiguration with a new object
     *
     * @param newTargetedManagedAppConfiguration the new object to create
     * @return the created TargetedManagedAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TargetedManagedAppConfiguration post(final TargetedManagedAppConfiguration newTargetedManagedAppConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseTargetedManagedAppConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseTargetedManagedAppConfigurationRequest expand(final String value);

}

