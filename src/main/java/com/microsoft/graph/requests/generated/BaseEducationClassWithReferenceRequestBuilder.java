// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.EducationClassReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassWithReferenceRequest;
import com.microsoft.graph.requests.extensions.IEducationClassReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassWithReferenceRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Education Class With Reference Request Builder.
 */
public class BaseEducationClassWithReferenceRequestBuilder extends BaseRequestBuilder implements IBaseEducationClassWithReferenceRequestBuilder {

    /**
     * The request builder for the EducationClass
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseEducationClassWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IEducationClassWithReferenceRequest instance
     */
    public IEducationClassWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IEducationClassWithReferenceRequest instance
     */
    public IEducationClassWithReferenceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new EducationClassWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IEducationClassReferenceRequestBuilder reference(){
        return new EducationClassReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
