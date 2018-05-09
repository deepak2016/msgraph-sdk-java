// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IIosVppEBookRequest;
import com.microsoft.graph.requests.extensions.IosVppEBookRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Ios Vpp EBook Request Builder.
 */
public class BaseIosVppEBookRequestBuilder extends BaseRequestBuilder implements IBaseIosVppEBookRequestBuilder {

    /**
     * The request builder for the IosVppEBook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseIosVppEBookRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IIosVppEBookRequest instance
     */
    public IIosVppEBookRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IIosVppEBookRequest instance
     */
    public IIosVppEBookRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new IosVppEBookRequest(getRequestUrl(), getClient(), requestOptions);
    }

}
