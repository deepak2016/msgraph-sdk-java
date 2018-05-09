// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.WorkbookChartTitleFormat;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IWorkbookChartTitleFormatRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartTitleFormatRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Chart Title Format Request.
 */
public class BaseWorkbookChartTitleFormatRequest extends BaseRequest implements IBaseWorkbookChartTitleFormatRequest {

    /**
     * The request for the WorkbookChartTitleFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseWorkbookChartTitleFormatRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<WorkbookChartTitleFormat> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookChartTitleFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookChartTitleFormat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartTitleFormat from the service
     *
     * @return the WorkbookChartTitleFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartTitleFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this WorkbookChartTitleFormat with a source
     *
     * @param sourceWorkbookChartTitleFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChartTitleFormat sourceWorkbookChartTitleFormat, final ICallback<WorkbookChartTitleFormat> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartTitleFormat);
    }

    /**
     * Patches this WorkbookChartTitleFormat with a source
     *
     * @param sourceWorkbookChartTitleFormat the source object with updates
     * @return the updated WorkbookChartTitleFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartTitleFormat patch(final WorkbookChartTitleFormat sourceWorkbookChartTitleFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartTitleFormat);
    }

    /**
     * Creates a WorkbookChartTitleFormat with a new object
     *
     * @param newWorkbookChartTitleFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChartTitleFormat newWorkbookChartTitleFormat, final ICallback<WorkbookChartTitleFormat> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartTitleFormat);
    }

    /**
     * Creates a WorkbookChartTitleFormat with a new object
     *
     * @param newWorkbookChartTitleFormat the new object to create
     * @return the created WorkbookChartTitleFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartTitleFormat post(final WorkbookChartTitleFormat newWorkbookChartTitleFormat) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartTitleFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookChartTitleFormatRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookChartTitleFormatRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookChartTitleFormatRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookChartTitleFormatRequest)this;
     }

}

