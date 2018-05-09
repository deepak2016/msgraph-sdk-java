// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.CalendarCollectionPage;
import com.microsoft.graph.requests.extensions.CalendarCollectionRequest;
import com.microsoft.graph.requests.extensions.CalendarCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarCollectionPage;
import com.microsoft.graph.requests.extensions.ICalendarCollectionRequest;
import com.microsoft.graph.requests.extensions.ICalendarCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Calendar Collection Request.
 */
public class BaseCalendarCollectionRequest extends BaseCollectionRequest<BaseCalendarCollectionResponse, ICalendarCollectionPage> implements IBaseCalendarCollectionRequest {

    /**
     * The request builder for this collection of Calendar
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseCalendarCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseCalendarCollectionResponse.class, ICalendarCollectionPage.class);
    }

    public void get(final ICallback<ICalendarCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ICalendarCollectionPage get() throws ClientException {
        final BaseCalendarCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Calendar newCalendar, final ICallback<Calendar> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new CalendarRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newCalendar, callback);
    }

    public Calendar post(final Calendar newCalendar) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CalendarRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newCalendar);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICalendarCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (CalendarCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICalendarCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (CalendarCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ICalendarCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (CalendarCollectionRequest)this;
    }

    public ICalendarCollectionPage buildFromResponse(final BaseCalendarCollectionResponse response) {
        final ICalendarCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new CalendarCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final CalendarCollectionPage page = new CalendarCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
