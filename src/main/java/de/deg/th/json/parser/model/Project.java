
package de.deg.th.json.parser.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "expand",
    "self",
    "id",
    "key",
    "description",
    "lead",
    "components",
    "issueTypes",
    "assigneeType",
    "versions",
    "name",
    "roles",
    "avatarUrls",
    "projectCategory",
    "projectTypeKey",
    "archived"
})
public class Project {

    @JsonProperty("expand")
    private String expand;
    @JsonProperty("self")
    private String self;
    @JsonProperty("id")
    private String id;
    @JsonProperty("key")
    private String key;
    @JsonProperty("description")
    private String description;
    @JsonProperty("lead")
    private Lead lead;
    @JsonProperty("components")
    private List<Object> components = new ArrayList<Object>();
    @JsonProperty("issueTypes")
    private List<IssueType> issueTypes = new ArrayList<IssueType>();
    @JsonProperty("assigneeType")
    private String assigneeType;
    @JsonProperty("versions")
    private List<Object> versions = new ArrayList<Object>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("roles")
    private Roles roles;
    @JsonProperty("avatarUrls")
    private AvatarUrls_ avatarUrls;
    @JsonProperty("projectCategory")
    private ProjectCategory projectCategory;
    @JsonProperty("projectTypeKey")
    private String projectTypeKey;
    @JsonProperty("archived")
    private Boolean archived;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("expand")
    public String getExpand() {
        return expand;
    }

    @JsonProperty("expand")
    public void setExpand(String expand) {
        this.expand = expand;
    }

    public Project withExpand(String expand) {
        this.expand = expand;
        return this;
    }

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    public Project withSelf(String self) {
        this.self = self;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Project withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    public Project withKey(String key) {
        this.key = key;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Project withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("lead")
    public Lead getLead() {
        return lead;
    }

    @JsonProperty("lead")
    public void setLead(Lead lead) {
        this.lead = lead;
    }

    public Project withLead(Lead lead) {
        this.lead = lead;
        return this;
    }

    @JsonProperty("components")
    public List<Object> getComponents() {
        return components;
    }

    @JsonProperty("components")
    public void setComponents(List<Object> components) {
        this.components = components;
    }

    public Project withComponents(List<Object> components) {
        this.components = components;
        return this;
    }

    @JsonProperty("issueTypes")
    public List<IssueType> getIssueTypes() {
        return issueTypes;
    }

    @JsonProperty("issueTypes")
    public void setIssueTypes(List<IssueType> issueTypes) {
        this.issueTypes = issueTypes;
    }

    public Project withIssueTypes(List<IssueType> issueTypes) {
        this.issueTypes = issueTypes;
        return this;
    }

    @JsonProperty("assigneeType")
    public String getAssigneeType() {
        return assigneeType;
    }

    @JsonProperty("assigneeType")
    public void setAssigneeType(String assigneeType) {
        this.assigneeType = assigneeType;
    }

    public Project withAssigneeType(String assigneeType) {
        this.assigneeType = assigneeType;
        return this;
    }

    @JsonProperty("versions")
    public List<Object> getVersions() {
        return versions;
    }

    @JsonProperty("versions")
    public void setVersions(List<Object> versions) {
        this.versions = versions;
    }

    public Project withVersions(List<Object> versions) {
        this.versions = versions;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Project withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("roles")
    public Roles getRoles() {
        return roles;
    }

    @JsonProperty("roles")
    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Project withRoles(Roles roles) {
        this.roles = roles;
        return this;
    }

    @JsonProperty("avatarUrls")
    public AvatarUrls_ getAvatarUrls() {
        return avatarUrls;
    }

    @JsonProperty("avatarUrls")
    public void setAvatarUrls(AvatarUrls_ avatarUrls) {
        this.avatarUrls = avatarUrls;
    }

    public Project withAvatarUrls(AvatarUrls_ avatarUrls) {
        this.avatarUrls = avatarUrls;
        return this;
    }

    @JsonProperty("projectCategory")
    public ProjectCategory getProjectCategory() {
        return projectCategory;
    }

    @JsonProperty("projectCategory")
    public void setProjectCategory(ProjectCategory projectCategory) {
        this.projectCategory = projectCategory;
    }

    public Project withProjectCategory(ProjectCategory projectCategory) {
        this.projectCategory = projectCategory;
        return this;
    }

    @JsonProperty("projectTypeKey")
    public String getProjectTypeKey() {
        return projectTypeKey;
    }

    @JsonProperty("projectTypeKey")
    public void setProjectTypeKey(String projectTypeKey) {
        this.projectTypeKey = projectTypeKey;
    }

    public Project withProjectTypeKey(String projectTypeKey) {
        this.projectTypeKey = projectTypeKey;
        return this;
    }

    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    @JsonProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Project withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Project withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(expand).append(self).append(id).append(key).append(description).append(lead).append(components).append(issueTypes).append(assigneeType).append(versions).append(name).append(roles).append(avatarUrls).append(projectCategory).append(projectTypeKey).append(archived).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Project) == false) {
            return false;
        }
        Project rhs = ((Project) other);
        return new EqualsBuilder().append(expand, rhs.expand).append(self, rhs.self).append(id, rhs.id).append(key, rhs.key).append(description, rhs.description).append(lead, rhs.lead).append(components, rhs.components).append(issueTypes, rhs.issueTypes).append(assigneeType, rhs.assigneeType).append(versions, rhs.versions).append(name, rhs.name).append(roles, rhs.roles).append(avatarUrls, rhs.avatarUrls).append(projectCategory, rhs.projectCategory).append(projectTypeKey, rhs.projectTypeKey).append(archived, rhs.archived).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
