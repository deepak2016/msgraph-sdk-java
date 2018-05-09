// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.RoleDefinition;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IRoleDefinitionWithReferenceRequest;
import com.microsoft.graph.requests.extensions.RoleDefinitionWithReferenceRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Role Definition With Reference Request.
 */
public class BaseRoleDefinitionWithReferenceRequest extends BaseRequest implements IBaseRoleDefinitionWithReferenceRequest {

    /**
     * The request for the RoleDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseRoleDefinitionWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, RoleDefinition.class);
    }

    public void post(final RoleDefinition newRoleDefinition, final IJsonBackedObject payload, final ICallback<RoleDefinition> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public RoleDefinition post(final RoleDefinition newRoleDefinition, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newRoleDefinition;
        }
        return null;
    }

    public void get(final ICallback<RoleDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public RoleDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IRoleDefinitionWithReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (IRoleDefinitionWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IRoleDefinitionWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (RoleDefinitionWithReferenceRequest)this;
    }
}
