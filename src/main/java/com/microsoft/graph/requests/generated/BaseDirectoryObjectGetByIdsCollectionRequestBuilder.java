// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetByIdsCollectionRequest;
import com.microsoft.graph.requests.extensions.IDirectoryObjectGetByIdsCollectionRequest;

/**
 * The class for the Base Directory Object Get By Ids Collection Request Builder.
 */
public class BaseDirectoryObjectGetByIdsCollectionRequestBuilder extends BaseActionRequestBuilder implements IBaseDirectoryObjectGetByIdsCollectionRequestBuilder {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param ids the ids
     * @param types the types
     */
    public BaseDirectoryObjectGetByIdsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<String> ids, final java.util.List<String> types) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("ids", ids);
          bodyParams.put("types", types);
      }

    public IDirectoryObjectGetByIdsCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDirectoryObjectGetByIdsCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DirectoryObjectGetByIdsCollectionRequest request = new DirectoryObjectGetByIdsCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("ids")) {
            request.body.ids = getParameter("ids");
        }
        if (hasParameter("types")) {
            request.body.types = getParameter("types");
        }
  
        return request;
    }
}
