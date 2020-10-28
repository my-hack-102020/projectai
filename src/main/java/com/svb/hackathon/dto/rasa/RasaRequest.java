
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
    "next_action",
    "sender_id",
    "tracker",
    "domain"
})
public class RasaRequest {

    @JsonProperty("next_action")
    private String nextAction;
    @JsonProperty("sender_id")
    private String senderId;
    @JsonProperty("tracker")
    private Tracker tracker;
    @JsonProperty("domain")
    private Domain domain;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("next_action")
    public String getNextAction() {
        return nextAction;
    }

    @JsonProperty("next_action")
    public void setNextAction(String nextAction) {
        this.nextAction = nextAction;
    }

    @JsonProperty("sender_id")
    public String getSenderId() {
        return senderId;
    }

    @JsonProperty("sender_id")
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    @JsonProperty("tracker")
    public Tracker getTracker() {
        return tracker;
    }

    @JsonProperty("tracker")
    public void setTracker(Tracker tracker) {
        this.tracker = tracker;
    }

    @JsonProperty("domain")
    public Domain getDomain() {
        return domain;
    }

    @JsonProperty("domain")
    public void setDomain(Domain domain) {
        this.domain = domain;
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
        return new ToStringBuilder(this).append("nextAction", nextAction).append("senderId", senderId).append("tracker", tracker).append("domain", domain).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tracker).append(senderId).append(nextAction).append(additionalProperties).append(domain).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RasaRequest) == false) {
            return false;
        }
        RasaRequest rhs = ((RasaRequest) other);
        return new EqualsBuilder().append(tracker, rhs.tracker).append(senderId, rhs.senderId).append(nextAction, rhs.nextAction).append(additionalProperties, rhs.additionalProperties).append(domain, rhs.domain).isEquals();
    }

}
