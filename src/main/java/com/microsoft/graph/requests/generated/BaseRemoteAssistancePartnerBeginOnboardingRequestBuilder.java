// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerBeginOnboardingRequest;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerBeginOnboardingRequest;

/**
 * The class for the Base Remote Assistance Partner Begin Onboarding Request Builder.
 */
public class BaseRemoteAssistancePartnerBeginOnboardingRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this RemoteAssistancePartnerBeginOnboarding
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseRemoteAssistancePartnerBeginOnboardingRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IRemoteAssistancePartnerBeginOnboardingRequest
     *
     * @return the IRemoteAssistancePartnerBeginOnboardingRequest instance
     */
    public IRemoteAssistancePartnerBeginOnboardingRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IRemoteAssistancePartnerBeginOnboardingRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IRemoteAssistancePartnerBeginOnboardingRequest instance
     */
    public IRemoteAssistancePartnerBeginOnboardingRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        RemoteAssistancePartnerBeginOnboardingRequest request = new RemoteAssistancePartnerBeginOnboardingRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
