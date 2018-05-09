// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionWithReferencesRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Education School Collection With References Request.
 */
public interface IBaseEducationSchoolCollectionWithReferencesRequest {

    void get(final ICallback<IEducationSchoolCollectionWithReferencesPage> callback);

    IEducationSchoolCollectionWithReferencesPage get() throws ClientException;

    IEducationSchoolCollectionWithReferencesRequest expand(final String value);
    
    IEducationSchoolCollectionWithReferencesRequest select(final String value);

    IEducationSchoolCollectionWithReferencesRequest top(final int value);

}
