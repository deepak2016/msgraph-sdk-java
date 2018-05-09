// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.FieldValueSetRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IFieldValueSetRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemRequest;
import com.microsoft.graph.requests.extensions.ListItemRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base List Item Request Builder.
 */
public class BaseListItemRequestBuilder extends BaseRequestBuilder implements IBaseListItemRequestBuilder {

    /**
     * The request builder for the ListItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseListItemRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IListItemRequest instance
     */
    public IListItemRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IListItemRequest instance
     */
    public IListItemRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ListItemRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for DriveItem
     *
     * @return the IDriveItemRequestBuilder instance
     */
    public IDriveItemRequestBuilder driveItem() {
        return new DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("driveItem"), getClient(), null);
    }

    /**
     * Gets the request builder for FieldValueSet
     *
     * @return the IFieldValueSetRequestBuilder instance
     */
    public IFieldValueSetRequestBuilder fields() {
        return new FieldValueSetRequestBuilder(getRequestUrlWithAdditionalSegment("fields"), getClient(), null);
    }
}
