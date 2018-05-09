// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import java.util.Arrays;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.models.extensions.EducationTerm;
import com.microsoft.graph.models.extensions.EducationUser;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.models.extensions.Group;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionPage;
import com.microsoft.graph.requests.extensions.EducationUserCollectionPage;
import com.microsoft.graph.requests.generated.BaseEducationSchoolCollectionResponse;
import com.microsoft.graph.requests.generated.BaseEducationUserCollectionResponse;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Education Class.
 */
public class BaseEducationClass extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * Name of the class.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Mail Nickname.
     * Mail name for sending email to all members, if this is enabled.
     */
    @SerializedName("mailNickname")
    @Expose
    public String mailNickname;

    /**
     * The Description.
     * Description of the class.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Created By.
     * Entity who created the class
     */
    @SerializedName("createdBy")
    @Expose
    public IdentitySet createdBy;

    /**
     * The Class Code.
     * Class code used by the school to identify the class.
     */
    @SerializedName("classCode")
    @Expose
    public String classCode;

    /**
     * The External Name.
     * Name of the class in the syncing system.
     */
    @SerializedName("externalName")
    @Expose
    public String externalName;

    /**
     * The External Id.
     * ID of the class from the syncing system.
     */
    @SerializedName("externalId")
    @Expose
    public String externalId;

    /**
     * The External Source.
     * How this class was created. Possible values are: sis, manual, unknownFutureValue.
     */
    @SerializedName("externalSource")
    @Expose
    public EducationExternalSource externalSource;

    /**
     * The Term.
     * Term for this class.
     */
    @SerializedName("term")
    @Expose
    public EducationTerm term;

    /**
     * The Schools.
     * All schools that this class is associated with. Nullable.
     */
    public EducationSchoolCollectionPage schools;

    /**
     * The Members.
     * All users in the class. Nullable.
     */
    public EducationUserCollectionPage members;

    /**
     * The Teachers.
     * All teachers in the class. Nullable.
     */
    public EducationUserCollectionPage teachers;

    /**
     * The Group.
     * 
     */
    @SerializedName("group")
    @Expose
    public Group group;


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


        if (json.has("schools")) {
            final BaseEducationSchoolCollectionResponse response = new BaseEducationSchoolCollectionResponse();
            if (json.has("schools@odata.nextLink")) {
                response.nextLink = json.get("schools@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("schools").toString(), JsonObject[].class);
            final EducationSchool[] array = new EducationSchool[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EducationSchool.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            schools = new EducationSchoolCollectionPage(response, null);
        }

        if (json.has("members")) {
            final BaseEducationUserCollectionResponse response = new BaseEducationUserCollectionResponse();
            if (json.has("members@odata.nextLink")) {
                response.nextLink = json.get("members@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("members").toString(), JsonObject[].class);
            final EducationUser[] array = new EducationUser[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EducationUser.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            members = new EducationUserCollectionPage(response, null);
        }

        if (json.has("teachers")) {
            final BaseEducationUserCollectionResponse response = new BaseEducationUserCollectionResponse();
            if (json.has("teachers@odata.nextLink")) {
                response.nextLink = json.get("teachers@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("teachers").toString(), JsonObject[].class);
            final EducationUser[] array = new EducationUser[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EducationUser.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            teachers = new EducationUserCollectionPage(response, null);
        }
    }
}
