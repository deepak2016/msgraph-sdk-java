// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DomainVerifyRequest;
import com.microsoft.graph.requests.extensions.IDomainVerifyRequest;

/**
 * The class for the Base Domain Verify Request Builder.
 */
public class BaseDomainVerifyRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this DomainVerify
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDomainVerifyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IDomainVerifyRequest
     *
     * @return the IDomainVerifyRequest instance
     */
    public IDomainVerifyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IDomainVerifyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDomainVerifyRequest instance
     */
    public IDomainVerifyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DomainVerifyRequest request = new DomainVerifyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
