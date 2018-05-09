// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.ApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest;
import com.microsoft.graph.requests.extensions.IApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest;

/**
 * The class for the Base Apple Push Notification Certificate Download Apple Push Notification Certificate Signing Request Request Builder.
 */
public class BaseApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest
     *
     * @return the IApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest instance
     */
    public IApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest instance
     */
    public IApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest request = new ApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
