package edu.hawaii.its.api.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "groupings")
public class GrouperConfiguration {

    private final Map<String, String> api = new HashMap<>();

    public Map<String, String> getApi() {
        return api;
    }

    public String getAttributes() {
        return api.get("attributes");
    }

    public String getForGroups() {
        return api.get("for_groups");
    }

    public String getForMemberships() {
        return api.get("for_memberships");
    }

    public String getCurrentUser() {
        return api.get("current_user");
    }

    public String getSettings() {
        return api.get("settings");
    }

    public String getGroupingAdmins() {
        return api.get("grouping_admins");
    }

    public String getGroupingApps() {
        return api.get("grouping_apps");
    }

    public String getGroupingOwners() {
        return api.get("grouping_owners");
    }

    public String getGroupingSuperuser() {
        return api.get("grouping_superusers");
    }

    public String getStaleSubjectId() {
        return api.get("stale_subject_id");
    }

    public String getSuccessAllowed() {
        return api.get("success_allowed");
    }

    public Integer getTimeout() {
        return Integer.parseInt(api.get("timeout"));
    }

    public String getLastModified() {
        return api.get("last_modified");
    }

    public String getYyyymmddthhmm() {
        return api.get("yyyymmddThhmm");
    }

    public String getUhgrouping() {
        return api.get("uhgrouping");
    }

    public String getDestinations() {
        return api.get("destinations");
    }

    public String getListserv() {
        return api.get("listserv");
    }

    public String getReleasedGrouping() {
        return api.get("releasedgrouping");
    }

    public String getTrio() {
        return api.get("trio");
    }

    public String getPurgeGrouping() {
        return api.get("purge_grouping");
    }

    public String getSelfOpted() {
        return api.get("self_opted");
    }

    public String getAnyoneCan() {
        return api.get("anyone_can");
    }

    public String getOptIn() {
        return api.get("opt_in");
    }

    public String getOptOut() {
        return api.get("opt_out");
    }

    public String getBasis() {
        return api.get("basis");
    }

    public String getBasisPlusInclude() {
        return api.get("basis_plus_include");
    }

    public String getExclude() {
        return api.get("exclude");
    }

    public String getInclude() {
        return api.get("include");
    }

    public String getOwners() {
        return api.get("owners");
    }

    public String getAssignTypeGroup() {
        return api.get("assign_type_group");
    }

    public String getAssignTypeImmediateMembership() {
        return api.get("assign_type_immediate_membership");
    }

    public String getSubjectAttributeNameUid() {
        return api.get("subject_attribute_name_uhuuid");
    }

    public String getOperationAssignAttribute() {
        return api.get("operation_assign_attribute");
    }

    public String getOperationRemoveAttribute() {
        return api.get("operation_remove_attribute");
    }

    public String getOperationReplaceValues() {
        return api.get("operation_replace_values");
    }

    public String getPrivilegeOptOut() {
        return api.get("privilege_opt_out");
    }

    public String getPrivilegeOptIn() {
        return api.get("privilege_opt_in");
    }

    public String getEveryEntity() {
        return api.get("every_entity");
    }

    public String getIsMember() {
        return api.get("is_member");
    }

    public String getSuccess() {
        return api.get("success");
    }

    public String getFailure() {
        return api.get("failure");
    }

    public String getStem() {
        return api.get("stem");
    }

    public String getPersonAttributesUsername() {
        return api.get("person_attributes.username");
    }

    public String getPersonAttributesUhuuid() {
        return api.get("person_attributes.uhuuid");
    }

    public String getPersonAttributesFirstName() {
        return api.get("person_attributes.first_name");
    }

    public String getPersonAttributesLastName() {
        return api.get("person_attributes.last_name");
    }

    public String getPersonAttributesCompositeName() {
        return api.get("person_attributes.composite_name");
    }

    public String getInsufficientPrivileges() {
        return api.get("insufficient_privileges");
    }

    public String getTestUsername() {
        return api.get("test.username");
    }

    public String getTestName() {
        return api.get("test.name");
    }

    public String getTestUhuuid() {
        return api.get("test.uhuuid");
    }

    public String getTestAdminUser() {
        return api.get("test.admin_user");
    }

    public String getTestSn() {
        return api.get("test.surname");
    }

    public String getTestGivenName() {
        return api.get("test.given_name");
    }

    public String getGoogleGroup() {
        return api.get("googlegroup");
    }

    public Integer getAttributesAssignIdSize() {
        return Integer.parseInt(api.get("attribute_assign_id_size"));
    }

    public String getCompositeTypeComplement() {
        return api.get("composite_type.complement");
    }

    public String getCompositeTypeIntersection() {
        return api.get("composite_type.intersection");
    }

    public String getCompositeTypeUnion() {
        return api.get("composite_type.union");
    }
}
