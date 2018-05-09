// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IOnenoteSectionCopyToSectionGroupRequest;
import com.microsoft.graph.requests.extensions.OnenoteSectionCopyToSectionGroupRequest;

/**
 * The class for the Base Onenote Section Copy To Section Group Request Builder.
 */
public class BaseOnenoteSectionCopyToSectionGroupRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this OnenoteSectionCopyToSectionGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param id the id
     * @param groupId the groupId
     * @param renameAs the renameAs
     */
    public BaseOnenoteSectionCopyToSectionGroupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String id, final String groupId, final String renameAs) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("id", id);
        bodyParams.put("groupId", groupId);
        bodyParams.put("renameAs", renameAs);
    }

    /**
     * Creates the IOnenoteSectionCopyToSectionGroupRequest
     *
     * @return the IOnenoteSectionCopyToSectionGroupRequest instance
     */
    public IOnenoteSectionCopyToSectionGroupRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IOnenoteSectionCopyToSectionGroupRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IOnenoteSectionCopyToSectionGroupRequest instance
     */
    public IOnenoteSectionCopyToSectionGroupRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        OnenoteSectionCopyToSectionGroupRequest request = new OnenoteSectionCopyToSectionGroupRequest(
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

        if (hasParameter("renameAs")) {
            request.body.renameAs = getParameter("renameAs");
        }

        return request;
    }
}
