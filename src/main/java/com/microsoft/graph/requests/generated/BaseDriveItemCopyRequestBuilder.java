// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.ItemReference;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DriveItemCopyRequest;
import com.microsoft.graph.requests.extensions.IDriveItemCopyRequest;

/**
 * The class for the Base Drive Item Copy Request Builder.
 */
public class BaseDriveItemCopyRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this DriveItemCopy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param name the name
     * @param parentReference the parentReference
     */
    public BaseDriveItemCopyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String name, final ItemReference parentReference) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("name", name);
        bodyParams.put("parentReference", parentReference);
    }

    /**
     * Creates the IDriveItemCopyRequest
     *
     * @return the IDriveItemCopyRequest instance
     */
    public IDriveItemCopyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IDriveItemCopyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDriveItemCopyRequest instance
     */
    public IDriveItemCopyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DriveItemCopyRequest request = new DriveItemCopyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("name")) {
            request.body.name = getParameter("name");
        }

        if (hasParameter("parentReference")) {
            request.body.parentReference = getParameter("parentReference");
        }

        return request;
    }
}
