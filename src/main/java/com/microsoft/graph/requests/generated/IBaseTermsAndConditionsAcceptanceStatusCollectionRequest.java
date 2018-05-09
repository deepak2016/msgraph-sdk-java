// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.TermsAndConditionsAcceptanceStatus;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAcceptanceStatusCollectionPage;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAcceptanceStatusCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Terms And Conditions Acceptance Status Collection Request.
 */
public interface IBaseTermsAndConditionsAcceptanceStatusCollectionRequest {

    void get(final ICallback<ITermsAndConditionsAcceptanceStatusCollectionPage> callback);

    ITermsAndConditionsAcceptanceStatusCollectionPage get() throws ClientException;

    void post(final TermsAndConditionsAcceptanceStatus newTermsAndConditionsAcceptanceStatus, final ICallback<TermsAndConditionsAcceptanceStatus> callback);

    TermsAndConditionsAcceptanceStatus post(final TermsAndConditionsAcceptanceStatus newTermsAndConditionsAcceptanceStatus) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITermsAndConditionsAcceptanceStatusCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITermsAndConditionsAcceptanceStatusCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    ITermsAndConditionsAcceptanceStatusCollectionRequest top(final int value);

}
