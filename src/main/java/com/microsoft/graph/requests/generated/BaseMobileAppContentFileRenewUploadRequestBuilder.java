// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IMobileAppContentFileRenewUploadRequest;
import com.microsoft.graph.requests.extensions.MobileAppContentFileRenewUploadRequest;

/**
 * The class for the Base Mobile App Content File Renew Upload Request Builder.
 */
public class BaseMobileAppContentFileRenewUploadRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this MobileAppContentFileRenewUpload
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseMobileAppContentFileRenewUploadRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IMobileAppContentFileRenewUploadRequest
     *
     * @return the IMobileAppContentFileRenewUploadRequest instance
     */
    public IMobileAppContentFileRenewUploadRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IMobileAppContentFileRenewUploadRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IMobileAppContentFileRenewUploadRequest instance
     */
    public IMobileAppContentFileRenewUploadRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        MobileAppContentFileRenewUploadRequest request = new MobileAppContentFileRenewUploadRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
