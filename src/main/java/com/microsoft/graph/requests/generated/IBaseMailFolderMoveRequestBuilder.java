// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.extensions.IMailFolderMoveRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Mail Folder Move Request Builder.
 */
public interface IBaseMailFolderMoveRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IMailFolderMoveRequest
     *
     * @return the IMailFolderMoveRequest instance
     */
    IMailFolderMoveRequest buildRequest();

    /**
     * Creates the IMailFolderMoveRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IMailFolderMoveRequest instance
     */
    IMailFolderMoveRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
