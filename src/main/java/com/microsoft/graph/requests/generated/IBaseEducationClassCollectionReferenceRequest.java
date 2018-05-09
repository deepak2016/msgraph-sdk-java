// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.EducationClass;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionReferenceRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Education Class Collection Reference Request.
 */
public interface IBaseEducationClassCollectionReferenceRequest {

    void post(final EducationClass newEducationClass, final ICallback<EducationClass> callback);

    EducationClass post(final EducationClass newEducationClass) throws ClientException;

    IEducationClassCollectionReferenceRequest select(final String value);

    IEducationClassCollectionReferenceRequest top(final int value);

}
