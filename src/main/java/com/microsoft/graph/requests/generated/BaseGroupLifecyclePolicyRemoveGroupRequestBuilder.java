// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyRemoveGroupRequest;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyRemoveGroupRequest;

/**
 * The class for the Base Group Lifecycle Policy Remove Group Request Builder.
 */
public class BaseGroupLifecyclePolicyRemoveGroupRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this GroupLifecyclePolicyRemoveGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param groupId the groupId
     */
    public BaseGroupLifecyclePolicyRemoveGroupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String groupId) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("groupId", groupId);
    }

    /**
     * Creates the IGroupLifecyclePolicyRemoveGroupRequest
     *
     * @return the IGroupLifecyclePolicyRemoveGroupRequest instance
     */
    public IGroupLifecyclePolicyRemoveGroupRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IGroupLifecyclePolicyRemoveGroupRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IGroupLifecyclePolicyRemoveGroupRequest instance
     */
    public IGroupLifecyclePolicyRemoveGroupRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        GroupLifecyclePolicyRemoveGroupRequest request = new GroupLifecyclePolicyRemoveGroupRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("groupId")) {
            request.body.groupId = getParameter("groupId");
        }

        return request;
    }
}
