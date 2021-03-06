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
 * The interface for the Base Windows10Secure Assessment Configuration Request.
 */
public interface IBaseWindows10SecureAssessmentConfigurationRequest extends IHttpRequest {

    /**
     * Gets the Windows10SecureAssessmentConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Windows10SecureAssessmentConfiguration> callback);

    /**
     * Gets the Windows10SecureAssessmentConfiguration from the service
     *
     * @return the Windows10SecureAssessmentConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10SecureAssessmentConfiguration get() throws ClientException;

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
     * Patches this Windows10SecureAssessmentConfiguration with a source
     *
     * @param sourceWindows10SecureAssessmentConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Windows10SecureAssessmentConfiguration sourceWindows10SecureAssessmentConfiguration, final ICallback<Windows10SecureAssessmentConfiguration> callback);

    /**
     * Patches this Windows10SecureAssessmentConfiguration with a source
     *
     * @param sourceWindows10SecureAssessmentConfiguration the source object with updates
     * @return the updated Windows10SecureAssessmentConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10SecureAssessmentConfiguration patch(final Windows10SecureAssessmentConfiguration sourceWindows10SecureAssessmentConfiguration) throws ClientException;

    /**
     * Posts a Windows10SecureAssessmentConfiguration with a new object
     *
     * @param newWindows10SecureAssessmentConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Windows10SecureAssessmentConfiguration newWindows10SecureAssessmentConfiguration, final ICallback<Windows10SecureAssessmentConfiguration> callback);

    /**
     * Posts a Windows10SecureAssessmentConfiguration with a new object
     *
     * @param newWindows10SecureAssessmentConfiguration the new object to create
     * @return the created Windows10SecureAssessmentConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10SecureAssessmentConfiguration post(final Windows10SecureAssessmentConfiguration newWindows10SecureAssessmentConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWindows10SecureAssessmentConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWindows10SecureAssessmentConfigurationRequest expand(final String value);

}

