// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IUserAssignLicenseRequest;
import com.microsoft.graph.requests.extensions.UserAssignLicenseRequest;

/**
 * The class for the Base User Assign License Request Builder.
 */
public class BaseUserAssignLicenseRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this UserAssignLicense
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param addLicenses the addLicenses
     * @param removeLicenses the removeLicenses
     */
    public BaseUserAssignLicenseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<AssignedLicense> addLicenses, final java.util.List<java.util.UUID> removeLicenses) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("addLicenses", addLicenses);
        bodyParams.put("removeLicenses", removeLicenses);
    }

    /**
     * Creates the IUserAssignLicenseRequest
     *
     * @return the IUserAssignLicenseRequest instance
     */
    public IUserAssignLicenseRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IUserAssignLicenseRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IUserAssignLicenseRequest instance
     */
    public IUserAssignLicenseRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        UserAssignLicenseRequest request = new UserAssignLicenseRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("addLicenses")) {
            request.body.addLicenses = getParameter("addLicenses");
        }

        if (hasParameter("removeLicenses")) {
            request.body.removeLicenses = getParameter("removeLicenses");
        }

        return request;
    }
}
