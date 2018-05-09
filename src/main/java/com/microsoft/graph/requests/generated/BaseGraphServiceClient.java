// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.core.BaseClient;
import com.microsoft.graph.models.extensions.IGraphServiceClient;
import com.microsoft.graph.models.generated.IBaseGraphServiceClient;
import com.microsoft.graph.requests.extensions.ContractCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContractRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAppManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationRootRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IContractCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContractRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupSettingTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupSettingTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IInvitationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IInvitationRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchemaExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchemaExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscribedSkuCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscribedSkuRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRequestBuilder;
import com.microsoft.graph.requests.extensions.InvitationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InvitationRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootRequestBuilder;
import com.microsoft.graph.requests.extensions.SchemaExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SchemaExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscribedSkuCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscribedSkuRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Graph Service Client.
 */
public class BaseGraphServiceClient extends BaseClient implements IBaseGraphServiceClient {

    /**
     * The default endpoint for the Microsoft Graph Service
     */
    public static final String DEFAULT_GRAPH_ENDPOINT = "https://graph.microsoft.com/v1.0";

    /**
     * The current endpoint
     */
    private String endpoint;

    @Override
    public String getServiceRoot() {
        if (endpoint == null) {
            endpoint = DEFAULT_GRAPH_ENDPOINT;
        }
        return endpoint;
    }

    @Override
    public void setServiceRoot(String value) {
        endpoint = value;
    }

    /**
     * Gets the collection of DirectoryObjects objects
     *
     * @return the request builder for the collection of DirectoryObjects objects
     */
    public IDirectoryObjectCollectionRequestBuilder directoryObjects() {
        return new DirectoryObjectCollectionRequestBuilder(getServiceRoot() + "/directoryObjects", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single DirectoryObjects
     *
     * @param id the id of the DirectoryObjects to retrieve
     * @return the request builder for the DirectoryObjects object
     */
    public IDirectoryObjectRequestBuilder directoryObjects(final String id) {
        return new DirectoryObjectRequestBuilder(getServiceRoot() + "/directoryObjects/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Devices objects
     *
     * @return the request builder for the collection of Devices objects
     */
    public IDeviceCollectionRequestBuilder devices() {
        return new DeviceCollectionRequestBuilder(getServiceRoot() + "/devices", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Devices
     *
     * @param id the id of the Devices to retrieve
     * @return the request builder for the Devices object
     */
    public IDeviceRequestBuilder devices(final String id) {
        return new DeviceRequestBuilder(getServiceRoot() + "/devices/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Domains objects
     *
     * @return the request builder for the collection of Domains objects
     */
    public IDomainCollectionRequestBuilder domains() {
        return new DomainCollectionRequestBuilder(getServiceRoot() + "/domains", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Domains
     *
     * @param id the id of the Domains to retrieve
     * @return the request builder for the Domains object
     */
    public IDomainRequestBuilder domains(final String id) {
        return new DomainRequestBuilder(getServiceRoot() + "/domains/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of DomainDnsRecords objects
     *
     * @return the request builder for the collection of DomainDnsRecords objects
     */
    public IDomainDnsRecordCollectionRequestBuilder domainDnsRecords() {
        return new DomainDnsRecordCollectionRequestBuilder(getServiceRoot() + "/domainDnsRecords", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single DomainDnsRecords
     *
     * @param id the id of the DomainDnsRecords to retrieve
     * @return the request builder for the DomainDnsRecords object
     */
    public IDomainDnsRecordRequestBuilder domainDnsRecords(final String id) {
        return new DomainDnsRecordRequestBuilder(getServiceRoot() + "/domainDnsRecords/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Groups objects
     *
     * @return the request builder for the collection of Groups objects
     */
    public IGroupCollectionRequestBuilder groups() {
        return new GroupCollectionRequestBuilder(getServiceRoot() + "/groups", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Groups
     *
     * @param id the id of the Groups to retrieve
     * @return the request builder for the Groups object
     */
    public IGroupRequestBuilder groups(final String id) {
        return new GroupRequestBuilder(getServiceRoot() + "/groups/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of DirectoryRoles objects
     *
     * @return the request builder for the collection of DirectoryRoles objects
     */
    public IDirectoryRoleCollectionRequestBuilder directoryRoles() {
        return new DirectoryRoleCollectionRequestBuilder(getServiceRoot() + "/directoryRoles", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single DirectoryRoles
     *
     * @param id the id of the DirectoryRoles to retrieve
     * @return the request builder for the DirectoryRoles object
     */
    public IDirectoryRoleRequestBuilder directoryRoles(final String id) {
        return new DirectoryRoleRequestBuilder(getServiceRoot() + "/directoryRoles/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of DirectoryRoleTemplates objects
     *
     * @return the request builder for the collection of DirectoryRoleTemplates objects
     */
    public IDirectoryRoleTemplateCollectionRequestBuilder directoryRoleTemplates() {
        return new DirectoryRoleTemplateCollectionRequestBuilder(getServiceRoot() + "/directoryRoleTemplates", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single DirectoryRoleTemplates
     *
     * @param id the id of the DirectoryRoleTemplates to retrieve
     * @return the request builder for the DirectoryRoleTemplates object
     */
    public IDirectoryRoleTemplateRequestBuilder directoryRoleTemplates(final String id) {
        return new DirectoryRoleTemplateRequestBuilder(getServiceRoot() + "/directoryRoleTemplates/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Organization objects
     *
     * @return the request builder for the collection of Organization objects
     */
    public IOrganizationCollectionRequestBuilder organization() {
        return new OrganizationCollectionRequestBuilder(getServiceRoot() + "/organization", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Organization
     *
     * @param id the id of the Organization to retrieve
     * @return the request builder for the Organization object
     */
    public IOrganizationRequestBuilder organization(final String id) {
        return new OrganizationRequestBuilder(getServiceRoot() + "/organization/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of GroupSettings objects
     *
     * @return the request builder for the collection of GroupSettings objects
     */
    public IGroupSettingCollectionRequestBuilder groupSettings() {
        return new GroupSettingCollectionRequestBuilder(getServiceRoot() + "/groupSettings", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single GroupSettings
     *
     * @param id the id of the GroupSettings to retrieve
     * @return the request builder for the GroupSettings object
     */
    public IGroupSettingRequestBuilder groupSettings(final String id) {
        return new GroupSettingRequestBuilder(getServiceRoot() + "/groupSettings/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of GroupSettingTemplates objects
     *
     * @return the request builder for the collection of GroupSettingTemplates objects
     */
    public IGroupSettingTemplateCollectionRequestBuilder groupSettingTemplates() {
        return new GroupSettingTemplateCollectionRequestBuilder(getServiceRoot() + "/groupSettingTemplates", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single GroupSettingTemplates
     *
     * @param id the id of the GroupSettingTemplates to retrieve
     * @return the request builder for the GroupSettingTemplates object
     */
    public IGroupSettingTemplateRequestBuilder groupSettingTemplates(final String id) {
        return new GroupSettingTemplateRequestBuilder(getServiceRoot() + "/groupSettingTemplates/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of SubscribedSkus objects
     *
     * @return the request builder for the collection of SubscribedSkus objects
     */
    public ISubscribedSkuCollectionRequestBuilder subscribedSkus() {
        return new SubscribedSkuCollectionRequestBuilder(getServiceRoot() + "/subscribedSkus", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single SubscribedSkus
     *
     * @param id the id of the SubscribedSkus to retrieve
     * @return the request builder for the SubscribedSkus object
     */
    public ISubscribedSkuRequestBuilder subscribedSkus(final String id) {
        return new SubscribedSkuRequestBuilder(getServiceRoot() + "/subscribedSkus/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Users objects
     *
     * @return the request builder for the collection of Users objects
     */
    public IUserCollectionRequestBuilder users() {
        return new UserCollectionRequestBuilder(getServiceRoot() + "/users", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Users
     *
     * @param id the id of the Users to retrieve
     * @return the request builder for the Users object
     */
    public IUserRequestBuilder users(final String id) {
        return new UserRequestBuilder(getServiceRoot() + "/users/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Contracts objects
     *
     * @return the request builder for the collection of Contracts objects
     */
    public IContractCollectionRequestBuilder contracts() {
        return new ContractCollectionRequestBuilder(getServiceRoot() + "/contracts", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Contracts
     *
     * @param id the id of the Contracts to retrieve
     * @return the request builder for the Contracts object
     */
    public IContractRequestBuilder contracts(final String id) {
        return new ContractRequestBuilder(getServiceRoot() + "/contracts/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of SchemaExtensions objects
     *
     * @return the request builder for the collection of SchemaExtensions objects
     */
    public ISchemaExtensionCollectionRequestBuilder schemaExtensions() {
        return new SchemaExtensionCollectionRequestBuilder(getServiceRoot() + "/schemaExtensions", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single SchemaExtensions
     *
     * @param id the id of the SchemaExtensions to retrieve
     * @return the request builder for the SchemaExtensions object
     */
    public ISchemaExtensionRequestBuilder schemaExtensions(final String id) {
        return new SchemaExtensionRequestBuilder(getServiceRoot() + "/schemaExtensions/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Drives objects
     *
     * @return the request builder for the collection of Drives objects
     */
    public IDriveCollectionRequestBuilder drives() {
        return new DriveCollectionRequestBuilder(getServiceRoot() + "/drives", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Drives
     *
     * @param id the id of the Drives to retrieve
     * @return the request builder for the Drives object
     */
    public IDriveRequestBuilder drives(final String id) {
        return new DriveRequestBuilder(getServiceRoot() + "/drives/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Shares objects
     *
     * @return the request builder for the collection of Shares objects
     */
    public ISharedDriveItemCollectionRequestBuilder shares() {
        return new SharedDriveItemCollectionRequestBuilder(getServiceRoot() + "/shares", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Shares
     *
     * @param id the id of the Shares to retrieve
     * @return the request builder for the Shares object
     */
    public ISharedDriveItemRequestBuilder shares(final String id) {
        return new SharedDriveItemRequestBuilder(getServiceRoot() + "/shares/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Sites objects
     *
     * @return the request builder for the collection of Sites objects
     */
    public ISiteCollectionRequestBuilder sites() {
        return new SiteCollectionRequestBuilder(getServiceRoot() + "/sites", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Sites
     *
     * @param id the id of the Sites to retrieve
     * @return the request builder for the Sites object
     */
    public ISiteRequestBuilder sites(final String id) {
        return new SiteRequestBuilder(getServiceRoot() + "/sites/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Workbooks objects
     *
     * @return the request builder for the collection of Workbooks objects
     */
    public IDriveItemCollectionRequestBuilder workbooks() {
        return new DriveItemCollectionRequestBuilder(getServiceRoot() + "/workbooks", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Workbooks
     *
     * @param id the id of the Workbooks to retrieve
     * @return the request builder for the Workbooks object
     */
    public IDriveItemRequestBuilder workbooks(final String id) {
        return new DriveItemRequestBuilder(getServiceRoot() + "/workbooks/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Subscriptions objects
     *
     * @return the request builder for the collection of Subscriptions objects
     */
    public ISubscriptionCollectionRequestBuilder subscriptions() {
        return new SubscriptionCollectionRequestBuilder(getServiceRoot() + "/subscriptions", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Subscriptions
     *
     * @param id the id of the Subscriptions to retrieve
     * @return the request builder for the Subscriptions object
     */
    public ISubscriptionRequestBuilder subscriptions(final String id) {
        return new SubscriptionRequestBuilder(getServiceRoot() + "/subscriptions/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Invitations objects
     *
     * @return the request builder for the collection of Invitations objects
     */
    public IInvitationCollectionRequestBuilder invitations() {
        return new InvitationCollectionRequestBuilder(getServiceRoot() + "/invitations", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Invitations
     *
     * @param id the id of the Invitations to retrieve
     * @return the request builder for the Invitations object
     */
    public IInvitationRequestBuilder invitations(final String id) {
        return new InvitationRequestBuilder(getServiceRoot() + "/invitations/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of GroupLifecyclePolicies objects
     *
     * @return the request builder for the collection of GroupLifecyclePolicies objects
     */
    public IGroupLifecyclePolicyCollectionRequestBuilder groupLifecyclePolicies() {
        return new GroupLifecyclePolicyCollectionRequestBuilder(getServiceRoot() + "/groupLifecyclePolicies", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single GroupLifecyclePolicies
     *
     * @param id the id of the GroupLifecyclePolicies to retrieve
     * @return the request builder for the GroupLifecyclePolicies object
     */
    public IGroupLifecyclePolicyRequestBuilder groupLifecyclePolicies(final String id) {
        return new GroupLifecyclePolicyRequestBuilder(getServiceRoot() + "/groupLifecyclePolicies/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the User
     */
    public IUserRequestBuilder me() {
        return new UserRequestBuilder(getServiceRoot() + "/me", (IGraphServiceClient)this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Drive
     */
    public IDriveRequestBuilder drive() {
        return new DriveRequestBuilder(getServiceRoot() + "/drive", (IGraphServiceClient)this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Planner
     */
    public IPlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(getServiceRoot() + "/planner", (IGraphServiceClient)this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the ReportRoot
     */
    public IReportRootRequestBuilder reports() {
        return new ReportRootRequestBuilder(getServiceRoot() + "/reports", (IGraphServiceClient)this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the EducationRoot
     */
    public IEducationRootRequestBuilder education() {
        return new EducationRootRequestBuilder(getServiceRoot() + "/education", (IGraphServiceClient)this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceAppManagement
     */
    public IDeviceAppManagementRequestBuilder deviceAppManagement() {
        return new DeviceAppManagementRequestBuilder(getServiceRoot() + "/deviceAppManagement", (IGraphServiceClient)this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceManagement
     */
    public IDeviceManagementRequestBuilder deviceManagement() {
        return new DeviceManagementRequestBuilder(getServiceRoot() + "/deviceManagement", (IGraphServiceClient)this, null);
    }
}
