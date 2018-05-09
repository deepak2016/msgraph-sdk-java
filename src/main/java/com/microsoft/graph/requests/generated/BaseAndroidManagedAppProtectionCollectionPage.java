// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.AndroidManagedAppProtection;
import com.microsoft.graph.requests.extensions.IAndroidManagedAppProtectionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Android Managed App Protection Collection Page.
 */
public class BaseAndroidManagedAppProtectionCollectionPage extends BaseCollectionPage<AndroidManagedAppProtection, IAndroidManagedAppProtectionCollectionRequestBuilder> implements IBaseAndroidManagedAppProtectionCollectionPage {

    /**
     * A collection page for AndroidManagedAppProtection
     *
     * @param response the serialized BaseAndroidManagedAppProtectionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseAndroidManagedAppProtectionCollectionPage(final BaseAndroidManagedAppProtectionCollectionResponse response, final IAndroidManagedAppProtectionCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
