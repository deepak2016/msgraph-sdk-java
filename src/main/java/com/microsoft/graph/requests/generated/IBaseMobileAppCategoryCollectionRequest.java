// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.MobileAppCategory;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Mobile App Category Collection Request.
 */
public interface IBaseMobileAppCategoryCollectionRequest {

    void get(final ICallback<IMobileAppCategoryCollectionPage> callback);

    IMobileAppCategoryCollectionPage get() throws ClientException;

    void post(final MobileAppCategory newMobileAppCategory, final ICallback<MobileAppCategory> callback);

    MobileAppCategory post(final MobileAppCategory newMobileAppCategory) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMobileAppCategoryCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMobileAppCategoryCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IMobileAppCategoryCollectionRequest top(final int value);

}
