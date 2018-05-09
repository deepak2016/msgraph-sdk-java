// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.DeviceEnrollmentPlatformRestrictionsConfiguration;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Enrollment Platform Restrictions Configuration Request.
 */
public interface IBaseDeviceEnrollmentPlatformRestrictionsConfigurationRequest extends IHttpRequest {

    /**
     * Gets the DeviceEnrollmentPlatformRestrictionsConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceEnrollmentPlatformRestrictionsConfiguration> callback);

    /**
     * Gets the DeviceEnrollmentPlatformRestrictionsConfiguration from the service
     *
     * @return the DeviceEnrollmentPlatformRestrictionsConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceEnrollmentPlatformRestrictionsConfiguration get() throws ClientException;

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
     * Patches this DeviceEnrollmentPlatformRestrictionsConfiguration with a source
     *
     * @param sourceDeviceEnrollmentPlatformRestrictionsConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceEnrollmentPlatformRestrictionsConfiguration sourceDeviceEnrollmentPlatformRestrictionsConfiguration, final ICallback<DeviceEnrollmentPlatformRestrictionsConfiguration> callback);

    /**
     * Patches this DeviceEnrollmentPlatformRestrictionsConfiguration with a source
     *
     * @param sourceDeviceEnrollmentPlatformRestrictionsConfiguration the source object with updates
     * @return the updated DeviceEnrollmentPlatformRestrictionsConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceEnrollmentPlatformRestrictionsConfiguration patch(final DeviceEnrollmentPlatformRestrictionsConfiguration sourceDeviceEnrollmentPlatformRestrictionsConfiguration) throws ClientException;

    /**
     * Posts a DeviceEnrollmentPlatformRestrictionsConfiguration with a new object
     *
     * @param newDeviceEnrollmentPlatformRestrictionsConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceEnrollmentPlatformRestrictionsConfiguration newDeviceEnrollmentPlatformRestrictionsConfiguration, final ICallback<DeviceEnrollmentPlatformRestrictionsConfiguration> callback);

    /**
     * Posts a DeviceEnrollmentPlatformRestrictionsConfiguration with a new object
     *
     * @param newDeviceEnrollmentPlatformRestrictionsConfiguration the new object to create
     * @return the created DeviceEnrollmentPlatformRestrictionsConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceEnrollmentPlatformRestrictionsConfiguration post(final DeviceEnrollmentPlatformRestrictionsConfiguration newDeviceEnrollmentPlatformRestrictionsConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseDeviceEnrollmentPlatformRestrictionsConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseDeviceEnrollmentPlatformRestrictionsConfigurationRequest expand(final String value);

}

