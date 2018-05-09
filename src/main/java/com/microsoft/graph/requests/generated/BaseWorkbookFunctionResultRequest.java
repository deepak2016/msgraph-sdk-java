// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionResultRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionResultRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Function Result Request.
 */
public class BaseWorkbookFunctionResultRequest extends BaseRequest implements IBaseWorkbookFunctionResultRequest {

    /**
     * The request for the WorkbookFunctionResult
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseWorkbookFunctionResultRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<WorkbookFunctionResult> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookFunctionResult from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookFunctionResult> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookFunctionResult from the service
     *
     * @return the WorkbookFunctionResult from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookFunctionResult get() throws ClientException {
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
     * Patches this WorkbookFunctionResult with a source
     *
     * @param sourceWorkbookFunctionResult the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookFunctionResult sourceWorkbookFunctionResult, final ICallback<WorkbookFunctionResult> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookFunctionResult);
    }

    /**
     * Patches this WorkbookFunctionResult with a source
     *
     * @param sourceWorkbookFunctionResult the source object with updates
     * @return the updated WorkbookFunctionResult
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookFunctionResult patch(final WorkbookFunctionResult sourceWorkbookFunctionResult) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookFunctionResult);
    }

    /**
     * Creates a WorkbookFunctionResult with a new object
     *
     * @param newWorkbookFunctionResult the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookFunctionResult newWorkbookFunctionResult, final ICallback<WorkbookFunctionResult> callback) {
        send(HttpMethod.POST, callback, newWorkbookFunctionResult);
    }

    /**
     * Creates a WorkbookFunctionResult with a new object
     *
     * @param newWorkbookFunctionResult the new object to create
     * @return the created WorkbookFunctionResult
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookFunctionResult post(final WorkbookFunctionResult newWorkbookFunctionResult) throws ClientException {
        return send(HttpMethod.POST, newWorkbookFunctionResult);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookFunctionResultRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookFunctionResultRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookFunctionResultRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookFunctionResultRequest)this;
     }

}

