// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IPlannerBucketRequest;
import com.microsoft.graph.requests.extensions.IPlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Planner Bucket Request Builder.
 */
public interface IBasePlannerBucketRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IPlannerBucketRequest instance
     */
    IPlannerBucketRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IPlannerBucketRequest instance
     */
    IPlannerBucketRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IPlannerTaskCollectionRequestBuilder tasks();

    IPlannerTaskRequestBuilder tasks(final String id);

}
