// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IWorkbookChartFillRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartFontRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartLegendFormatRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartFillRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartFontRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartLegendFormatRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Chart Legend Format Request Builder.
 */
public class BaseWorkbookChartLegendFormatRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookChartLegendFormatRequestBuilder {

    /**
     * The request builder for the WorkbookChartLegendFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookChartLegendFormatRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookChartLegendFormatRequest instance
     */
    public IWorkbookChartLegendFormatRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartLegendFormatRequest instance
     */
    public IWorkbookChartLegendFormatRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookChartLegendFormatRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for WorkbookChartFill
     *
     * @return the IWorkbookChartFillRequestBuilder instance
     */
    public IWorkbookChartFillRequestBuilder fill() {
        return new WorkbookChartFillRequestBuilder(getRequestUrlWithAdditionalSegment("fill"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartFont
     *
     * @return the IWorkbookChartFontRequestBuilder instance
     */
    public IWorkbookChartFontRequestBuilder font() {
        return new WorkbookChartFontRequestBuilder(getRequestUrlWithAdditionalSegment("font"), getClient(), null);
    }
}
