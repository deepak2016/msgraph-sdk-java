// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppConfigurationTargetAppsRequest;
import com.microsoft.graph.requests.extensions.TargetedManagedAppConfigurationTargetAppsRequest;

/**
 * The class for the Base Targeted Managed App Configuration Target Apps Request Builder.
 */
public class BaseTargetedManagedAppConfigurationTargetAppsRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this TargetedManagedAppConfigurationTargetApps
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param apps the apps
     */
    public BaseTargetedManagedAppConfigurationTargetAppsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<ManagedMobileApp> apps) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("apps", apps);
    }

    /**
     * Creates the ITargetedManagedAppConfigurationTargetAppsRequest
     *
     * @return the ITargetedManagedAppConfigurationTargetAppsRequest instance
     */
    public ITargetedManagedAppConfigurationTargetAppsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the ITargetedManagedAppConfigurationTargetAppsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ITargetedManagedAppConfigurationTargetAppsRequest instance
     */
    public ITargetedManagedAppConfigurationTargetAppsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        TargetedManagedAppConfigurationTargetAppsRequest request = new TargetedManagedAppConfigurationTargetAppsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("apps")) {
            request.body.apps = getParameter("apps");
        }

        return request;
    }
}
