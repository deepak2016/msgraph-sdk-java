// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.GroupResetUnseenCountRequest;
import com.microsoft.graph.requests.extensions.IGroupResetUnseenCountRequest;

/**
 * The class for the Base Group Reset Unseen Count Request Builder.
 */
public class BaseGroupResetUnseenCountRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this GroupResetUnseenCount
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseGroupResetUnseenCountRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IGroupResetUnseenCountRequest
     *
     * @return the IGroupResetUnseenCountRequest instance
     */
    public IGroupResetUnseenCountRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IGroupResetUnseenCountRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IGroupResetUnseenCountRequest instance
     */
    public IGroupResetUnseenCountRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        GroupResetUnseenCountRequest request = new GroupResetUnseenCountRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
