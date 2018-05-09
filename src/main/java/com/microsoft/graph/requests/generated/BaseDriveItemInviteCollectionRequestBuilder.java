// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.DriveRecipient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DriveItemInviteCollectionRequest;
import com.microsoft.graph.requests.extensions.IDriveItemInviteCollectionRequest;

/**
 * The class for the Base Drive Item Invite Collection Request Builder.
 */
public class BaseDriveItemInviteCollectionRequestBuilder extends BaseActionRequestBuilder implements IBaseDriveItemInviteCollectionRequestBuilder {

    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param requireSignIn the requireSignIn
     * @param roles the roles
     * @param sendInvitation the sendInvitation
     * @param message the message
     * @param recipients the recipients
     */
    public BaseDriveItemInviteCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Boolean requireSignIn, final java.util.List<String> roles, final Boolean sendInvitation, final String message, final java.util.List<DriveRecipient> recipients) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("requireSignIn", requireSignIn);
          bodyParams.put("roles", roles);
          bodyParams.put("sendInvitation", sendInvitation);
          bodyParams.put("message", message);
          bodyParams.put("recipients", recipients);
      }

    public IDriveItemInviteCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDriveItemInviteCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DriveItemInviteCollectionRequest request = new DriveItemInviteCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("requireSignIn")) {
            request.body.requireSignIn = getParameter("requireSignIn");
        }
        if (hasParameter("roles")) {
            request.body.roles = getParameter("roles");
        }
        if (hasParameter("sendInvitation")) {
            request.body.sendInvitation = getParameter("sendInvitation");
        }
        if (hasParameter("message")) {
            request.body.message = getParameter("message");
        }
        if (hasParameter("recipients")) {
            request.body.recipients = getParameter("recipients");
        }
  
        return request;
    }
}
