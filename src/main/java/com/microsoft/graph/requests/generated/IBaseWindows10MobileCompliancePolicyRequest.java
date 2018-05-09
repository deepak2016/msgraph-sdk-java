// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.Windows10MobileCompliancePolicy;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Windows10Mobile Compliance Policy Request.
 */
public interface IBaseWindows10MobileCompliancePolicyRequest extends IHttpRequest {

    /**
     * Gets the Windows10MobileCompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Windows10MobileCompliancePolicy> callback);

    /**
     * Gets the Windows10MobileCompliancePolicy from the service
     *
     * @return the Windows10MobileCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10MobileCompliancePolicy get() throws ClientException;

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
     * Patches this Windows10MobileCompliancePolicy with a source
     *
     * @param sourceWindows10MobileCompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Windows10MobileCompliancePolicy sourceWindows10MobileCompliancePolicy, final ICallback<Windows10MobileCompliancePolicy> callback);

    /**
     * Patches this Windows10MobileCompliancePolicy with a source
     *
     * @param sourceWindows10MobileCompliancePolicy the source object with updates
     * @return the updated Windows10MobileCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10MobileCompliancePolicy patch(final Windows10MobileCompliancePolicy sourceWindows10MobileCompliancePolicy) throws ClientException;

    /**
     * Posts a Windows10MobileCompliancePolicy with a new object
     *
     * @param newWindows10MobileCompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Windows10MobileCompliancePolicy newWindows10MobileCompliancePolicy, final ICallback<Windows10MobileCompliancePolicy> callback);

    /**
     * Posts a Windows10MobileCompliancePolicy with a new object
     *
     * @param newWindows10MobileCompliancePolicy the new object to create
     * @return the created Windows10MobileCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10MobileCompliancePolicy post(final Windows10MobileCompliancePolicy newWindows10MobileCompliancePolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWindows10MobileCompliancePolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWindows10MobileCompliancePolicyRequest expand(final String value);

}

