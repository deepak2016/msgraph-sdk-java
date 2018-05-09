// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.EventSnoozeReminderRequest;
import com.microsoft.graph.requests.extensions.IEventSnoozeReminderRequest;

/**
 * The class for the Base Event Snooze Reminder Request Builder.
 */
public class BaseEventSnoozeReminderRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this EventSnoozeReminder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param newReminderTime the newReminderTime
     */
    public BaseEventSnoozeReminderRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final DateTimeTimeZone newReminderTime) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("newReminderTime", newReminderTime);
    }

    /**
     * Creates the IEventSnoozeReminderRequest
     *
     * @return the IEventSnoozeReminderRequest instance
     */
    public IEventSnoozeReminderRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IEventSnoozeReminderRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IEventSnoozeReminderRequest instance
     */
    public IEventSnoozeReminderRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        EventSnoozeReminderRequest request = new EventSnoozeReminderRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("newReminderTime")) {
            request.body.newReminderTime = getParameter("newReminderTime");
        }

        return request;
    }
}
