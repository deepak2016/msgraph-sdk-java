// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.GroupUnsubscribeByMailRequest;
import com.microsoft.graph.requests.extensions.IGroupUnsubscribeByMailRequest;

/**
 * The class for the Base Group Unsubscribe By Mail Request Builder.
 */
public class BaseGroupUnsubscribeByMailRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this GroupUnsubscribeByMail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseGroupUnsubscribeByMailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IGroupUnsubscribeByMailRequest
     *
     * @return the IGroupUnsubscribeByMailRequest instance
     */
    public IGroupUnsubscribeByMailRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IGroupUnsubscribeByMailRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IGroupUnsubscribeByMailRequest instance
     */
    public IGroupUnsubscribeByMailRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        GroupUnsubscribeByMailRequest request = new GroupUnsubscribeByMailRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
