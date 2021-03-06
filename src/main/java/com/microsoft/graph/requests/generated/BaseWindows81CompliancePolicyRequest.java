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
 * The class for the Base Windows81Compliance Policy Request.
 */
public class BaseWindows81CompliancePolicyRequest extends BaseRequest implements IBaseWindows81CompliancePolicyRequest {

    /**
     * The request for the Windows81CompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseWindows81CompliancePolicyRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<Windows81CompliancePolicy> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the Windows81CompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Windows81CompliancePolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows81CompliancePolicy from the service
     *
     * @return the Windows81CompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows81CompliancePolicy get() throws ClientException {
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
     * Patches this Windows81CompliancePolicy with a source
     *
     * @param sourceWindows81CompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows81CompliancePolicy sourceWindows81CompliancePolicy, final ICallback<Windows81CompliancePolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows81CompliancePolicy);
    }

    /**
     * Patches this Windows81CompliancePolicy with a source
     *
     * @param sourceWindows81CompliancePolicy the source object with updates
     * @return the updated Windows81CompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows81CompliancePolicy patch(final Windows81CompliancePolicy sourceWindows81CompliancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows81CompliancePolicy);
    }

    /**
     * Creates a Windows81CompliancePolicy with a new object
     *
     * @param newWindows81CompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows81CompliancePolicy newWindows81CompliancePolicy, final ICallback<Windows81CompliancePolicy> callback) {
        send(HttpMethod.POST, callback, newWindows81CompliancePolicy);
    }

    /**
     * Creates a Windows81CompliancePolicy with a new object
     *
     * @param newWindows81CompliancePolicy the new object to create
     * @return the created Windows81CompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows81CompliancePolicy post(final Windows81CompliancePolicy newWindows81CompliancePolicy) throws ClientException {
        return send(HttpMethod.POST, newWindows81CompliancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindows81CompliancePolicyRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (Windows81CompliancePolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindows81CompliancePolicyRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (Windows81CompliancePolicyRequest)this;
     }

}

