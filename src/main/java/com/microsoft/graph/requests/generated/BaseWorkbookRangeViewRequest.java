// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.WorkbookRangeView;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IWorkbookRangeViewRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeViewRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Range View Request.
 */
public class BaseWorkbookRangeViewRequest extends BaseRequest implements IBaseWorkbookRangeViewRequest {

    /**
     * The request for the WorkbookRangeView
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseWorkbookRangeViewRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<WorkbookRangeView> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookRangeView from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookRangeView> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRangeView from the service
     *
     * @return the WorkbookRangeView from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRangeView get() throws ClientException {
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
     * Patches this WorkbookRangeView with a source
     *
     * @param sourceWorkbookRangeView the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookRangeView sourceWorkbookRangeView, final ICallback<WorkbookRangeView> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookRangeView);
    }

    /**
     * Patches this WorkbookRangeView with a source
     *
     * @param sourceWorkbookRangeView the source object with updates
     * @return the updated WorkbookRangeView
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRangeView patch(final WorkbookRangeView sourceWorkbookRangeView) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookRangeView);
    }

    /**
     * Creates a WorkbookRangeView with a new object
     *
     * @param newWorkbookRangeView the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookRangeView newWorkbookRangeView, final ICallback<WorkbookRangeView> callback) {
        send(HttpMethod.POST, callback, newWorkbookRangeView);
    }

    /**
     * Creates a WorkbookRangeView with a new object
     *
     * @param newWorkbookRangeView the new object to create
     * @return the created WorkbookRangeView
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRangeView post(final WorkbookRangeView newWorkbookRangeView) throws ClientException {
        return send(HttpMethod.POST, newWorkbookRangeView);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookRangeViewRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookRangeViewRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookRangeViewRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookRangeViewRequest)this;
     }

}

