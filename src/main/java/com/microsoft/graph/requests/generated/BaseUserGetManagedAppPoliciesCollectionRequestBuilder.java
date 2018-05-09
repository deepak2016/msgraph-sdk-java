// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IUserGetManagedAppPoliciesCollectionRequest;
import com.microsoft.graph.requests.extensions.UserGetManagedAppPoliciesCollectionRequest;

/**
 * The class for the Base User Get Managed App Policies Collection Request Builder.
 */
public class BaseUserGetManagedAppPoliciesCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseUserGetManagedAppPoliciesCollectionRequestBuilder {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseUserGetManagedAppPoliciesCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IUserGetManagedAppPoliciesCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IUserGetManagedAppPoliciesCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        UserGetManagedAppPoliciesCollectionRequest request = new UserGetManagedAppPoliciesCollectionRequest(
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
