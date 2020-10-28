
package com.svb.hackathon.dto.rasa;

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
    "property1",
    "property2"
})
public class Slots {

    @JsonProperty("property1")
    private Property1_ property1;
    @JsonProperty("property2")
    private Property2_ property2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("property1")
    public Property1_ getProperty1() {
        return property1;
    }

    @JsonProperty("property1")
    public void setProperty1(Property1_ property1) {
        this.property1 = property1;
    }

    @JsonProperty("property2")
    public Property2_ getProperty2() {
        return property2;
    }

    @JsonProperty("property2")
    public void setProperty2(Property2_ property2) {
        this.property2 = property2;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("property1", property1).append("property2", property2).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(property2).append(property1).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Slots) == false) {
            return false;
        }
        Slots rhs = ((Slots) other);
        return new EqualsBuilder().append(property2, rhs.property2).append(property1, rhs.property1).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
