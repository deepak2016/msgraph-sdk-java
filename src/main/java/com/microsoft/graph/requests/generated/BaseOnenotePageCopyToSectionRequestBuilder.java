// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IOnenotePageCopyToSectionRequest;
import com.microsoft.graph.requests.extensions.OnenotePageCopyToSectionRequest;

/**
 * The class for the Base Onenote Page Copy To Section Request Builder.
 */
public class BaseOnenotePageCopyToSectionRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this OnenotePageCopyToSection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param id the id
     * @param groupId the groupId
     */
    public BaseOnenotePageCopyToSectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String id, final String groupId) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("id", id);
        bodyParams.put("groupId", groupId);
    }

    /**
     * Creates the IOnenotePageCopyToSectionRequest
     *
     * @return the IOnenotePageCopyToSectionRequest instance
     */
    public IOnenotePageCopyToSectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IOnenotePageCopyToSectionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IOnenotePageCopyToSectionRequest instance
     */
    public IOnenotePageCopyToSectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        OnenotePageCopyToSectionRequest request = new OnenotePageCopyToSectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("id")) {
            request.body.id = getParameter("id");
        }

        if (hasParameter("groupId")) {
            request.body.groupId = getParameter("groupId");
        }

        return request;
    }
}
