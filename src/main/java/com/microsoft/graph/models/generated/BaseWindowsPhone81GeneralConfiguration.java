// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.models.extensions.AppListItem;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Windows Phone81General Configuration.
 */
public class BaseWindowsPhone81GeneralConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Apply Only To Windows Phone81.
     * Value indicating whether this policy only applies to Windows Phone 8.1. This property is read-only.
     */
    @SerializedName("applyOnlyToWindowsPhone81")
    @Expose
    public Boolean applyOnlyToWindowsPhone81;

    /**
     * The Apps Block Copy Paste.
     * Indicates whether or not to block copy paste.
     */
    @SerializedName("appsBlockCopyPaste")
    @Expose
    public Boolean appsBlockCopyPaste;

    /**
     * The Bluetooth Blocked.
     * Indicates whether or not to block bluetooth.
     */
    @SerializedName("bluetoothBlocked")
    @Expose
    public Boolean bluetoothBlocked;

    /**
     * The Camera Blocked.
     * Indicates whether or not to block camera.
     */
    @SerializedName("cameraBlocked")
    @Expose
    public Boolean cameraBlocked;

    /**
     * The Cellular Block Wifi Tethering.
     * Indicates whether or not to block Wi-Fi tethering. Has no impact if Wi-Fi is blocked.
     */
    @SerializedName("cellularBlockWifiTethering")
    @Expose
    public Boolean cellularBlockWifiTethering;

    /**
     * The Compliant Apps List.
     * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     */
    @SerializedName("compliantAppsList")
    @Expose
    public java.util.List<AppListItem> compliantAppsList;

    /**
     * The Compliant App List Type.
     * List that is in the AppComplianceList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
     */
    @SerializedName("compliantAppListType")
    @Expose
    public AppListType compliantAppListType;

    /**
     * The Diagnostic Data Block Submission.
     * Indicates whether or not to block diagnostic data submission.
     */
    @SerializedName("diagnosticDataBlockSubmission")
    @Expose
    public Boolean diagnosticDataBlockSubmission;

    /**
     * The Email Block Adding Accounts.
     * Indicates whether or not to block custom email accounts.
     */
    @SerializedName("emailBlockAddingAccounts")
    @Expose
    public Boolean emailBlockAddingAccounts;

    /**
     * The Location Services Blocked.
     * Indicates whether or not to block location services.
     */
    @SerializedName("locationServicesBlocked")
    @Expose
    public Boolean locationServicesBlocked;

    /**
     * The Microsoft Account Blocked.
     * Indicates whether or not to block using a Microsoft Account.
     */
    @SerializedName("microsoftAccountBlocked")
    @Expose
    public Boolean microsoftAccountBlocked;

    /**
     * The Nfc Blocked.
     * Indicates whether or not to block Near-Field Communication.
     */
    @SerializedName("nfcBlocked")
    @Expose
    public Boolean nfcBlocked;

    /**
     * The Password Block Simple.
     * Indicates whether or not to block syncing the calendar.
     */
    @SerializedName("passwordBlockSimple")
    @Expose
    public Boolean passwordBlockSimple;

    /**
     * The Password Expiration Days.
     * Number of days before the password expires.
     */
    @SerializedName("passwordExpirationDays")
    @Expose
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Length.
     * Minimum length of passwords.
     */
    @SerializedName("passwordMinimumLength")
    @Expose
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Screen Timeout.
     * Minutes of inactivity before screen timeout.
     */
    @SerializedName("passwordMinutesOfInactivityBeforeScreenTimeout")
    @Expose
    public Integer passwordMinutesOfInactivityBeforeScreenTimeout;

    /**
     * The Password Minimum Character Set Count.
     * Number of character sets a password must contain.
     */
    @SerializedName("passwordMinimumCharacterSetCount")
    @Expose
    public Integer passwordMinimumCharacterSetCount;

    /**
     * The Password Previous Password Block Count.
     * Number of previous passwords to block. Valid values 0 to 24
     */
    @SerializedName("passwordPreviousPasswordBlockCount")
    @Expose
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Sign In Failure Count Before Factory Reset.
     * Number of sign in failures allowed before factory reset.
     */
    @SerializedName("passwordSignInFailureCountBeforeFactoryReset")
    @Expose
    public Integer passwordSignInFailureCountBeforeFactoryReset;

    /**
     * The Password Required Type.
     * Password type that is required. Possible values are: deviceDefault, alphanumeric, numeric.
     */
    @SerializedName("passwordRequiredType")
    @Expose
    public RequiredPasswordType passwordRequiredType;

    /**
     * The Password Required.
     * Indicates whether or not to require a password.
     */
    @SerializedName("passwordRequired")
    @Expose
    public Boolean passwordRequired;

    /**
     * The Screen Capture Blocked.
     * Indicates whether or not to block screenshots.
     */
    @SerializedName("screenCaptureBlocked")
    @Expose
    public Boolean screenCaptureBlocked;

    /**
     * The Storage Block Removable Storage.
     * Indicates whether or not to block removable storage.
     */
    @SerializedName("storageBlockRemovableStorage")
    @Expose
    public Boolean storageBlockRemovableStorage;

    /**
     * The Storage Require Encryption.
     * Indicates whether or not to require encryption.
     */
    @SerializedName("storageRequireEncryption")
    @Expose
    public Boolean storageRequireEncryption;

    /**
     * The Web Browser Blocked.
     * Indicates whether or not to block the web browser.
     */
    @SerializedName("webBrowserBlocked")
    @Expose
    public Boolean webBrowserBlocked;

    /**
     * The Wifi Blocked.
     * Indicates whether or not to block Wi-Fi.
     */
    @SerializedName("wifiBlocked")
    @Expose
    public Boolean wifiBlocked;

    /**
     * The Wifi Block Automatic Connect Hotspots.
     * Indicates whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     */
    @SerializedName("wifiBlockAutomaticConnectHotspots")
    @Expose
    public Boolean wifiBlockAutomaticConnectHotspots;

    /**
     * The Wifi Block Hotspot Reporting.
     * Indicates whether or not to block Wi-Fi hotspot reporting. Has no impact if Wi-Fi is blocked.
     */
    @SerializedName("wifiBlockHotspotReporting")
    @Expose
    public Boolean wifiBlockHotspotReporting;

    /**
     * The Windows Store Blocked.
     * Indicates whether or not to block the Windows Store.
     */
    @SerializedName("windowsStoreBlocked")
    @Expose
    public Boolean windowsStoreBlocked;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
