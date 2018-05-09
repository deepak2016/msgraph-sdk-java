// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IUserChangePasswordRequest;
import com.microsoft.graph.requests.extensions.UserChangePasswordRequest;

/**
 * The class for the Base User Change Password Request Builder.
 */
public class BaseUserChangePasswordRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this UserChangePassword
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param currentPassword the currentPassword
     * @param newPassword the newPassword
     */
    public BaseUserChangePasswordRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String currentPassword, final String newPassword) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("currentPassword", currentPassword);
        bodyParams.put("newPassword", newPassword);
    }

    /**
     * Creates the IUserChangePasswordRequest
     *
     * @return the IUserChangePasswordRequest instance
     */
    public IUserChangePasswordRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IUserChangePasswordRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IUserChangePasswordRequest instance
     */
    public IUserChangePasswordRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        UserChangePasswordRequest request = new UserChangePasswordRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("currentPassword")) {
            request.body.currentPassword = getParameter("currentPassword");
        }

        if (hasParameter("newPassword")) {
            request.body.newPassword = getParameter("newPassword");
        }

        return request;
    }
}
