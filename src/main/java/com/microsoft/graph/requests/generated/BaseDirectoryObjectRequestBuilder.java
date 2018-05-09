// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DirectoryObjectCheckMemberGroupsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetMemberGroupsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetMemberObjectsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequest;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCheckMemberGroupsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectGetMemberGroupsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectGetMemberObjectsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Directory Object Request Builder.
 */
public class BaseDirectoryObjectRequestBuilder extends BaseRequestBuilder implements IBaseDirectoryObjectRequestBuilder {

    /**
     * The request builder for the DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDirectoryObjectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDirectoryObjectRequest instance
     */
    public IDirectoryObjectRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDirectoryObjectRequest instance
     */
    public IDirectoryObjectRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DirectoryObjectRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDirectoryObjectCheckMemberGroupsCollectionRequestBuilder checkMemberGroups(final java.util.List<String> groupIds) {
        return new DirectoryObjectCheckMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkMemberGroups"), getClient(), null, groupIds);
    }

    public IDirectoryObjectGetMemberGroupsCollectionRequestBuilder getMemberGroups(final Boolean securityEnabledOnly) {
        return new DirectoryObjectGetMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberGroups"), getClient(), null, securityEnabledOnly);
    }

    public IDirectoryObjectGetMemberObjectsCollectionRequestBuilder getMemberObjects(final Boolean securityEnabledOnly) {
        return new DirectoryObjectGetMemberObjectsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberObjects"), getClient(), null, securityEnabledOnly);
    }
}
