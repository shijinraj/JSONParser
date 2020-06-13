
package de.deg.th.json.parser.model;

import java.util.HashMap;
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
    "Tester",
    "Developers",
    "Erweiterte Rechte",
    "Projektbearbeiter",
    "Entwickler",
    "Administrators",
    "ISB",
    "Projektleiter"
})
public class Roles {

    @JsonProperty("Tester")
    private String tester;
    @JsonProperty("Developers")
    private String developers;
    @JsonProperty("Erweiterte Rechte")
    private String erweiterteRechte;
    @JsonProperty("Projektbearbeiter")
    private String projektbearbeiter;
    @JsonProperty("Entwickler")
    private String entwickler;
    @JsonProperty("Administrators")
    private String administrators;
    @JsonProperty("ISB")
    private String iSB;
    @JsonProperty("Projektleiter")
    private String projektleiter;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Tester")
    public String getTester() {
        return tester;
    }

    @JsonProperty("Tester")
    public void setTester(String tester) {
        this.tester = tester;
    }

    public Roles withTester(String tester) {
        this.tester = tester;
        return this;
    }

    @JsonProperty("Developers")
    public String getDevelopers() {
        return developers;
    }

    @JsonProperty("Developers")
    public void setDevelopers(String developers) {
        this.developers = developers;
    }

    public Roles withDevelopers(String developers) {
        this.developers = developers;
        return this;
    }

    @JsonProperty("Erweiterte Rechte")
    public String getErweiterteRechte() {
        return erweiterteRechte;
    }

    @JsonProperty("Erweiterte Rechte")
    public void setErweiterteRechte(String erweiterteRechte) {
        this.erweiterteRechte = erweiterteRechte;
    }

    public Roles withErweiterteRechte(String erweiterteRechte) {
        this.erweiterteRechte = erweiterteRechte;
        return this;
    }

    @JsonProperty("Projektbearbeiter")
    public String getProjektbearbeiter() {
        return projektbearbeiter;
    }

    @JsonProperty("Projektbearbeiter")
    public void setProjektbearbeiter(String projektbearbeiter) {
        this.projektbearbeiter = projektbearbeiter;
    }

    public Roles withProjektbearbeiter(String projektbearbeiter) {
        this.projektbearbeiter = projektbearbeiter;
        return this;
    }

    @JsonProperty("Entwickler")
    public String getEntwickler() {
        return entwickler;
    }

    @JsonProperty("Entwickler")
    public void setEntwickler(String entwickler) {
        this.entwickler = entwickler;
    }

    public Roles withEntwickler(String entwickler) {
        this.entwickler = entwickler;
        return this;
    }

    @JsonProperty("Administrators")
    public String getAdministrators() {
        return administrators;
    }

    @JsonProperty("Administrators")
    public void setAdministrators(String administrators) {
        this.administrators = administrators;
    }

    public Roles withAdministrators(String administrators) {
        this.administrators = administrators;
        return this;
    }

    @JsonProperty("ISB")
    public String getISB() {
        return iSB;
    }

    @JsonProperty("ISB")
    public void setISB(String iSB) {
        this.iSB = iSB;
    }

    public Roles withISB(String iSB) {
        this.iSB = iSB;
        return this;
    }

    @JsonProperty("Projektleiter")
    public String getProjektleiter() {
        return projektleiter;
    }

    @JsonProperty("Projektleiter")
    public void setProjektleiter(String projektleiter) {
        this.projektleiter = projektleiter;
    }

    public Roles withProjektleiter(String projektleiter) {
        this.projektleiter = projektleiter;
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

    public Roles withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tester).append(developers).append(erweiterteRechte).append(projektbearbeiter).append(entwickler).append(administrators).append(iSB).append(projektleiter).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Roles) == false) {
            return false;
        }
        Roles rhs = ((Roles) other);
        return new EqualsBuilder().append(tester, rhs.tester).append(developers, rhs.developers).append(erweiterteRechte, rhs.erweiterteRechte).append(projektbearbeiter, rhs.projektbearbeiter).append(entwickler, rhs.entwickler).append(administrators, rhs.administrators).append(iSB, rhs.iSB).append(projektleiter, rhs.projektleiter).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
