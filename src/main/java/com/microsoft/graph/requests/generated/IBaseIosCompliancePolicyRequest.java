// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.IosCompliancePolicy;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Ios Compliance Policy Request.
 */
public interface IBaseIosCompliancePolicyRequest extends IHttpRequest {

    /**
     * Gets the IosCompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<IosCompliancePolicy> callback);

    /**
     * Gets the IosCompliancePolicy from the service
     *
     * @return the IosCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosCompliancePolicy get() throws ClientException;

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
     * Patches this IosCompliancePolicy with a source
     *
     * @param sourceIosCompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IosCompliancePolicy sourceIosCompliancePolicy, final ICallback<IosCompliancePolicy> callback);

    /**
     * Patches this IosCompliancePolicy with a source
     *
     * @param sourceIosCompliancePolicy the source object with updates
     * @return the updated IosCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosCompliancePolicy patch(final IosCompliancePolicy sourceIosCompliancePolicy) throws ClientException;

    /**
     * Posts a IosCompliancePolicy with a new object
     *
     * @param newIosCompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IosCompliancePolicy newIosCompliancePolicy, final ICallback<IosCompliancePolicy> callback);

    /**
     * Posts a IosCompliancePolicy with a new object
     *
     * @param newIosCompliancePolicy the new object to create
     * @return the created IosCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosCompliancePolicy post(final IosCompliancePolicy newIosCompliancePolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseIosCompliancePolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseIosCompliancePolicyRequest expand(final String value);

}

