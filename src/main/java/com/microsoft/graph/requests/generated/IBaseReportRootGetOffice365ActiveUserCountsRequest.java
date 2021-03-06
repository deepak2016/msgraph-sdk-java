// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Report Root Get Office365Active User Counts Request.
 */
public interface IBaseReportRootGetOffice365ActiveUserCountsRequest {

    /**
     * Patches the ReportRootGetOffice365ActiveUserCounts
     *
     * @param srcReport the Report with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    void patch(Report srcReport, final ICallback<Report> callback);

    /**
     * Patches the ReportRootGetOffice365ActiveUserCounts
     *
     * @param srcReport the Report with which to PATCH
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Report patch(Report srcReport) throws ClientException;

    /**
     * Puts the ReportRootGetOffice365ActiveUserCounts
     *
     * @param srcReport the Report to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(Report srcReport, final ICallback<Report> callback);

    /**
     * Puts the ReportRootGetOffice365ActiveUserCounts
     *
     * @param srcReport the Report to PUT
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     Report put(Report srcReport) throws ClientException;
    /**
     * Gets the Report
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Report> callback);

    /**
     * Gets the Report
     *
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Report get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IReportRootGetOffice365ActiveUserCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IReportRootGetOffice365ActiveUserCountsRequest expand(final String value);

}
