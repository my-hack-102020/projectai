
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
    "store_entities_as_slots"
})
public class Config {

    @JsonProperty("store_entities_as_slots")
    private Boolean storeEntitiesAsSlots;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("store_entities_as_slots")
    public Boolean getStoreEntitiesAsSlots() {
        return storeEntitiesAsSlots;
    }

    @JsonProperty("store_entities_as_slots")
    public void setStoreEntitiesAsSlots(Boolean storeEntitiesAsSlots) {
        this.storeEntitiesAsSlots = storeEntitiesAsSlots;
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
        return new ToStringBuilder(this).append("storeEntitiesAsSlots", storeEntitiesAsSlots).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(storeEntitiesAsSlots).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Config) == false) {
            return false;
        }
        Config rhs = ((Config) other);
        return new EqualsBuilder().append(storeEntitiesAsSlots, rhs.storeEntitiesAsSlots).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
