// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.extensions.MobileAppAssignment;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IMobileAppAssignRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRequest;
import com.microsoft.graph.requests.extensions.MobileAppAssignRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Mobile App Request Builder.
 */
public class BaseMobileAppRequestBuilder extends BaseRequestBuilder implements IBaseMobileAppRequestBuilder {

    /**
     * The request builder for the MobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseMobileAppRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IMobileAppRequest instance
     */
    public IMobileAppRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IMobileAppRequest instance
     */
    public IMobileAppRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new MobileAppRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMobileAppCategoryCollectionRequestBuilder categories() {
        return new MobileAppCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("categories"), getClient(), null);
    }

    public IMobileAppCategoryRequestBuilder categories(final String id) {
        return new MobileAppCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("categories") + "/" + id, getClient(), null);
    }
    public IMobileAppAssignmentCollectionRequestBuilder assignments() {
        return new MobileAppAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IMobileAppAssignmentRequestBuilder assignments(final String id) {
        return new MobileAppAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    public IMobileAppAssignRequestBuilder assign(final java.util.List<MobileAppAssignment> mobileAppAssignments) {
        return new MobileAppAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, mobileAppAssignments);
    }
}
