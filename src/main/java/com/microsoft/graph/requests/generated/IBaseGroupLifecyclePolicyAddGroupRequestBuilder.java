// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyAddGroupRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Group Lifecycle Policy Add Group Request Builder.
 */
public interface IBaseGroupLifecyclePolicyAddGroupRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IGroupLifecyclePolicyAddGroupRequest
     *
     * @return the IGroupLifecyclePolicyAddGroupRequest instance
     */
    IGroupLifecyclePolicyAddGroupRequest buildRequest();

    /**
     * Creates the IGroupLifecyclePolicyAddGroupRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IGroupLifecyclePolicyAddGroupRequest instance
     */
    IGroupLifecyclePolicyAddGroupRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
