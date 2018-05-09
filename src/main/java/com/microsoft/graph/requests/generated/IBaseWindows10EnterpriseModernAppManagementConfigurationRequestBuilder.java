// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWindows10EnterpriseModernAppManagementConfigurationRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Windows10Enterprise Modern App Management Configuration Request Builder.
 */
public interface IBaseWindows10EnterpriseModernAppManagementConfigurationRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWindows10EnterpriseModernAppManagementConfigurationRequest instance
     */
    IWindows10EnterpriseModernAppManagementConfigurationRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWindows10EnterpriseModernAppManagementConfigurationRequest instance
     */
    IWindows10EnterpriseModernAppManagementConfigurationRequest buildRequest(final java.util.List<? extends Option> requestOptions);

}
