
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
    "sender_id",
    "slots",
    "latest_message",
    "latest_event_time",
    "followup_action",
    "paused",
    "events",
    "latest_input_channel",
    "latest_action_name",
    "active_form"
})
public class Tracker {

    @JsonProperty("sender_id")
    private String senderId;
    @JsonProperty("latest_message")
    private LatestMessage latestMessage;
    @JsonProperty("latest_event_time")
    private Integer latestEventTime;
    @JsonProperty("followup_action")
    private String followupAction;
    @JsonProperty("paused")
    private Boolean paused;
    @JsonProperty("events")
    private List<Event> events = null;
    @JsonProperty("latest_input_channel")
    private String latestInputChannel;
    @JsonProperty("latest_action_name")
    private String latestActionName;
    @JsonProperty("active_form")
    private ActiveForm activeForm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sender_id")
    public String getSenderId() {
        return senderId;
    }

    @JsonProperty("sender_id")
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    @JsonProperty("latest_message")
    public LatestMessage getLatestMessage() {
        return latestMessage;
    }

    @JsonProperty("latest_message")
    public void setLatestMessage(LatestMessage latestMessage) {
        this.latestMessage = latestMessage;
    }

    @JsonProperty("latest_event_time")
    public Integer getLatestEventTime() {
        return latestEventTime;
    }

    @JsonProperty("latest_event_time")
    public void setLatestEventTime(Integer latestEventTime) {
        this.latestEventTime = latestEventTime;
    }

    @JsonProperty("followup_action")
    public String getFollowupAction() {
        return followupAction;
    }

    @JsonProperty("followup_action")
    public void setFollowupAction(String followupAction) {
        this.followupAction = followupAction;
    }

    @JsonProperty("paused")
    public Boolean getPaused() {
        return paused;
    }

    @JsonProperty("paused")
    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    @JsonProperty("events")
    public List<Event> getEvents() {
        return events;
    }

    @JsonProperty("events")
    public void setEvents(List<Event> events) {
        this.events = events;
    }

    @JsonProperty("latest_input_channel")
    public String getLatestInputChannel() {
        return latestInputChannel;
    }

    @JsonProperty("latest_input_channel")
    public void setLatestInputChannel(String latestInputChannel) {
        this.latestInputChannel = latestInputChannel;
    }

    @JsonProperty("latest_action_name")
    public String getLatestActionName() {
        return latestActionName;
    }

    @JsonProperty("latest_action_name")
    public void setLatestActionName(String latestActionName) {
        this.latestActionName = latestActionName;
    }

    @JsonProperty("active_form")
    public ActiveForm getActiveForm() {
        return activeForm;
    }

    @JsonProperty("active_form")
    public void setActiveForm(ActiveForm activeForm) {
        this.activeForm = activeForm;
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
        return new ToStringBuilder(this).append("senderId", senderId).append("latestMessage", latestMessage).append("latestEventTime", latestEventTime).append("followupAction", followupAction).append("paused", paused).append("events", events).append("latestInputChannel", latestInputChannel).append("latestActionName", latestActionName).append("activeForm", activeForm).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(senderId).append(paused).append(latestEventTime).append(latestInputChannel).append(latestActionName).append(activeForm).append(followupAction).append(latestMessage).append(additionalProperties).append(events).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tracker) == false) {
            return false;
        }
        Tracker rhs = ((Tracker) other);
        return new EqualsBuilder().append(senderId, rhs.senderId).append(paused, rhs.paused).append(latestEventTime, rhs.latestEventTime).append(latestInputChannel, rhs.latestInputChannel).append(latestActionName, rhs.latestActionName).append(activeForm, rhs.activeForm).append(followupAction, rhs.followupAction).append(latestMessage, rhs.latestMessage).append(additionalProperties, rhs.additionalProperties).append(events, rhs.events).isEquals();
    }

}
