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
 * The class for the Base Device Compliance Setting State Request.
 */
public class BaseDeviceComplianceSettingStateRequest extends BaseRequest implements IBaseDeviceComplianceSettingStateRequest {

    /**
     * The request for the DeviceComplianceSettingState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseDeviceComplianceSettingStateRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<DeviceComplianceSettingState> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DeviceComplianceSettingState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceComplianceSettingState> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceComplianceSettingState from the service
     *
     * @return the DeviceComplianceSettingState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComplianceSettingState get() throws ClientException {
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
     * Patches this DeviceComplianceSettingState with a source
     *
     * @param sourceDeviceComplianceSettingState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceComplianceSettingState sourceDeviceComplianceSettingState, final ICallback<DeviceComplianceSettingState> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceComplianceSettingState);
    }

    /**
     * Patches this DeviceComplianceSettingState with a source
     *
     * @param sourceDeviceComplianceSettingState the source object with updates
     * @return the updated DeviceComplianceSettingState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComplianceSettingState patch(final DeviceComplianceSettingState sourceDeviceComplianceSettingState) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceComplianceSettingState);
    }

    /**
     * Creates a DeviceComplianceSettingState with a new object
     *
     * @param newDeviceComplianceSettingState the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceComplianceSettingState newDeviceComplianceSettingState, final ICallback<DeviceComplianceSettingState> callback) {
        send(HttpMethod.POST, callback, newDeviceComplianceSettingState);
    }

    /**
     * Creates a DeviceComplianceSettingState with a new object
     *
     * @param newDeviceComplianceSettingState the new object to create
     * @return the created DeviceComplianceSettingState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComplianceSettingState post(final DeviceComplianceSettingState newDeviceComplianceSettingState) throws ClientException {
        return send(HttpMethod.POST, newDeviceComplianceSettingState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceComplianceSettingStateRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceComplianceSettingStateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceComplianceSettingStateRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceComplianceSettingStateRequest)this;
     }

}

