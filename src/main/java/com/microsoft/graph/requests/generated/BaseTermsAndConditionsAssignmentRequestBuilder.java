// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAssignmentRequest;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAssignmentRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Terms And Conditions Assignment Request Builder.
 */
public class BaseTermsAndConditionsAssignmentRequestBuilder extends BaseRequestBuilder implements IBaseTermsAndConditionsAssignmentRequestBuilder {

    /**
     * The request builder for the TermsAndConditionsAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseTermsAndConditionsAssignmentRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ITermsAndConditionsAssignmentRequest instance
     */
    public ITermsAndConditionsAssignmentRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITermsAndConditionsAssignmentRequest instance
     */
    public ITermsAndConditionsAssignmentRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new TermsAndConditionsAssignmentRequest(getRequestUrl(), getClient(), requestOptions);
    }

}
