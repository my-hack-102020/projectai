
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
    "config",
    "intents",
    "entities",
    "slots",
    "templates",
    "actions"
})
public class Domain {

    @JsonProperty("config")
    private Config config;
    @JsonProperty("intents")
    private List<Intent_> intents = null;
    @JsonProperty("entities")
    private List<String> entities = null;
    @JsonProperty("slots")
    private Slots slots;
    @JsonProperty("templates")
    private Templates templates;
    @JsonProperty("actions")
    private List<String> actions = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("config")
    public Config getConfig() {
        return config;
    }

    @JsonProperty("config")
    public void setConfig(Config config) {
        this.config = config;
    }

    @JsonProperty("intents")
    public List<Intent_> getIntents() {
        return intents;
    }

    @JsonProperty("intents")
    public void setIntents(List<Intent_> intents) {
        this.intents = intents;
    }

    @JsonProperty("entities")
    public List<String> getEntities() {
        return entities;
    }

    @JsonProperty("entities")
    public void setEntities(List<String> entities) {
        this.entities = entities;
    }

    @JsonProperty("slots")
    public Slots getSlots() {
        return slots;
    }

    @JsonProperty("slots")
    public void setSlots(Slots slots) {
        this.slots = slots;
    }

    @JsonProperty("templates")
    public Templates getTemplates() {
        return templates;
    }

    @JsonProperty("templates")
    public void setTemplates(Templates templates) {
        this.templates = templates;
    }

    @JsonProperty("actions")
    public List<String> getActions() {
        return actions;
    }

    @JsonProperty("actions")
    public void setActions(List<String> actions) {
        this.actions = actions;
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
        return new ToStringBuilder(this).append("config", config).append("intents", intents).append("entities", entities).append("slots", slots).append("templates", templates).append("actions", actions).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(intents).append(slots).append(entities).append(templates).append(additionalProperties).append(config).append(actions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Domain) == false) {
            return false;
        }
        Domain rhs = ((Domain) other);
        return new EqualsBuilder().append(intents, rhs.intents).append(slots, rhs.slots).append(entities, rhs.entities).append(templates, rhs.templates).append(additionalProperties, rhs.additionalProperties).append(config, rhs.config).append(actions, rhs.actions).isEquals();
    }

}
