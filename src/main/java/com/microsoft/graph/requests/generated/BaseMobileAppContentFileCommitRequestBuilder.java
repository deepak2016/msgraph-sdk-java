// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Mobile App Content File Commit Request Builder.
 */
public class BaseMobileAppContentFileCommitRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this MobileAppContentFileCommit
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param fileEncryptionInfo the fileEncryptionInfo
     */
    public BaseMobileAppContentFileCommitRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final FileEncryptionInfo fileEncryptionInfo) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("fileEncryptionInfo", fileEncryptionInfo);
    }

    /**
     * Creates the IMobileAppContentFileCommitRequest
     *
     * @return the IMobileAppContentFileCommitRequest instance
     */
    public IMobileAppContentFileCommitRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IMobileAppContentFileCommitRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IMobileAppContentFileCommitRequest instance
     */
    public IMobileAppContentFileCommitRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        MobileAppContentFileCommitRequest request = new MobileAppContentFileCommitRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("fileEncryptionInfo")) {
            request.body.fileEncryptionInfo = getParameter("fileEncryptionInfo");
        }

        return request;
    }
}
