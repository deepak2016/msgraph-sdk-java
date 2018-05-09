// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.ManagedEBookAssignment;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IManagedEBookAssignRequest;
import com.microsoft.graph.requests.extensions.ManagedEBookAssignRequest;

/**
 * The class for the Base Managed EBook Assign Request Builder.
 */
public class BaseManagedEBookAssignRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedEBookAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param managedEBookAssignments the managedEBookAssignments
     */
    public BaseManagedEBookAssignRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<ManagedEBookAssignment> managedEBookAssignments) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("managedEBookAssignments", managedEBookAssignments);
    }

    /**
     * Creates the IManagedEBookAssignRequest
     *
     * @return the IManagedEBookAssignRequest instance
     */
    public IManagedEBookAssignRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IManagedEBookAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedEBookAssignRequest instance
     */
    public IManagedEBookAssignRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagedEBookAssignRequest request = new ManagedEBookAssignRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("managedEBookAssignments")) {
            request.body.managedEBookAssignments = getParameter("managedEBookAssignments");
        }

        return request;
    }
}
