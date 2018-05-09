// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.ICalendarCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarGroupRequest;
import com.microsoft.graph.requests.extensions.ICalendarRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Calendar Group Request Builder.
 */
public interface IBaseCalendarGroupRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ICalendarGroupRequest instance
     */
    ICalendarGroupRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ICalendarGroupRequest instance
     */
    ICalendarGroupRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    ICalendarCollectionRequestBuilder calendars();

    ICalendarRequestBuilder calendars(final String id);

}
