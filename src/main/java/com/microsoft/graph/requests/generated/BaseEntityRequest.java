// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.EntityRequest;
import com.microsoft.graph.requests.extensions.IEntityRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Entity Request.
 */
public class BaseEntityRequest extends BaseRequest implements IBaseEntityRequest {

    /**
     * The request for the Entity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseEntityRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<Entity> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEntityRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (EntityRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEntityRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (EntityRequest)this;
     }

}

