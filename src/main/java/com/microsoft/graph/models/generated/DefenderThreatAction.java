// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

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

/**
 * The Enum Defender Threat Action.
*/
public enum DefenderThreatAction
{
    /**
    * device Default
    */
    DEVICE_DEFAULT,
    /**
    * clean
    */
    CLEAN,
    /**
    * quarantine
    */
    QUARANTINE,
    /**
    * remove
    */
    REMOVE,
    /**
    * allow
    */
    ALLOW,
    /**
    * user Defined
    */
    USER_DEFINED,
    /**
    * block
    */
    BLOCK,
    /**
    * For DefenderThreatAction values that were not expected from the service
    */
    UNEXPECTED_VALUE
}