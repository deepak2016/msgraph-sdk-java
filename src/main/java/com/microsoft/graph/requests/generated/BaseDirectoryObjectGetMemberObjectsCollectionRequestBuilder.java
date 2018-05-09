// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetMemberObjectsCollectionRequest;
import com.microsoft.graph.requests.extensions.IDirectoryObjectGetMemberObjectsCollectionRequest;

/**
 * The class for the Base Directory Object Get Member Objects Collection Request Builder.
 */
public class BaseDirectoryObjectGetMemberObjectsCollectionRequestBuilder extends BaseActionRequestBuilder implements IBaseDirectoryObjectGetMemberObjectsCollectionRequestBuilder {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param securityEnabledOnly the securityEnabledOnly
     */
    public BaseDirectoryObjectGetMemberObjectsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Boolean securityEnabledOnly) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("securityEnabledOnly", securityEnabledOnly);
      }

    public IDirectoryObjectGetMemberObjectsCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDirectoryObjectGetMemberObjectsCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DirectoryObjectGetMemberObjectsCollectionRequest request = new DirectoryObjectGetMemberObjectsCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("securityEnabledOnly")) {
            request.body.securityEnabledOnly = getParameter("securityEnabledOnly");
        }
  
        return request;
    }
}
