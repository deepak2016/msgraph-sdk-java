// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.ContactDeltaCollectionRequest;
import com.microsoft.graph.requests.extensions.IContactDeltaCollectionRequest;

/**
 * The class for the Base Contact Delta Collection Request Builder.
 */
public class BaseContactDeltaCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseContactDeltaCollectionRequestBuilder {

    /**
     * The request builder for this collection of Contact
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseContactDeltaCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IContactDeltaCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IContactDeltaCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ContactDeltaCollectionRequest request = new ContactDeltaCollectionRequest(
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
