// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.SettingStateDeviceSummary;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Setting State Device Summary Request.
 */
public interface IBaseSettingStateDeviceSummaryRequest extends IHttpRequest {

    /**
     * Gets the SettingStateDeviceSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<SettingStateDeviceSummary> callback);

    /**
     * Gets the SettingStateDeviceSummary from the service
     *
     * @return the SettingStateDeviceSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SettingStateDeviceSummary get() throws ClientException;

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
     * Patches this SettingStateDeviceSummary with a source
     *
     * @param sourceSettingStateDeviceSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SettingStateDeviceSummary sourceSettingStateDeviceSummary, final ICallback<SettingStateDeviceSummary> callback);

    /**
     * Patches this SettingStateDeviceSummary with a source
     *
     * @param sourceSettingStateDeviceSummary the source object with updates
     * @return the updated SettingStateDeviceSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SettingStateDeviceSummary patch(final SettingStateDeviceSummary sourceSettingStateDeviceSummary) throws ClientException;

    /**
     * Posts a SettingStateDeviceSummary with a new object
     *
     * @param newSettingStateDeviceSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SettingStateDeviceSummary newSettingStateDeviceSummary, final ICallback<SettingStateDeviceSummary> callback);

    /**
     * Posts a SettingStateDeviceSummary with a new object
     *
     * @param newSettingStateDeviceSummary the new object to create
     * @return the created SettingStateDeviceSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SettingStateDeviceSummary post(final SettingStateDeviceSummary newSettingStateDeviceSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseSettingStateDeviceSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseSettingStateDeviceSummaryRequest expand(final String value);

}

