
package com.svb.hackathon.dto.rasa;

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
    "auto_fill",
    "initial_value",
    "type",
    "values"
})
public class Property1_ {

    @JsonProperty("auto_fill")
    private Boolean autoFill;
    @JsonProperty("initial_value")
    private String initialValue;
    @JsonProperty("type")
    private String type;
    @JsonProperty("values")
    private List<String> values = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("auto_fill")
    public Boolean getAutoFill() {
        return autoFill;
    }

    @JsonProperty("auto_fill")
    public void setAutoFill(Boolean autoFill) {
        this.autoFill = autoFill;
    }

    @JsonProperty("initial_value")
    public String getInitialValue() {
        return initialValue;
    }

    @JsonProperty("initial_value")
    public void setInitialValue(String initialValue) {
        this.initialValue = initialValue;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("values")
    public List<String> getValues() {
        return values;
    }

    @JsonProperty("values")
    public void setValues(List<String> values) {
        this.values = values;
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
        return new ToStringBuilder(this).append("autoFill", autoFill).append("initialValue", initialValue).append("type", type).append("values", values).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(autoFill).append(additionalProperties).append(type).append(initialValue).append(values).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Property1_) == false) {
            return false;
        }
        Property1_ rhs = ((Property1_) other);
        return new EqualsBuilder().append(autoFill, rhs.autoFill).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(initialValue, rhs.initialValue).append(values, rhs.values).isEquals();
    }

}
