
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
    "entites",
    "intent",
    "intent_ranking",
    "text"
})
public class LatestMessage {

    @JsonProperty("entites")
    private List<Entite> entites = null;
    @JsonProperty("intent")
    private Intent intent;
    @JsonProperty("intent_ranking")
    private List<IntentRanking> intentRanking = null;
    @JsonProperty("text")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("entites")
    public List<Entite> getEntites() {
        return entites;
    }

    @JsonProperty("entites")
    public void setEntites(List<Entite> entites) {
        this.entites = entites;
    }

    @JsonProperty("intent")
    public Intent getIntent() {
        return intent;
    }

    @JsonProperty("intent")
    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    @JsonProperty("intent_ranking")
    public List<IntentRanking> getIntentRanking() {
        return intentRanking;
    }

    @JsonProperty("intent_ranking")
    public void setIntentRanking(List<IntentRanking> intentRanking) {
        this.intentRanking = intentRanking;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
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
        return new ToStringBuilder(this).append("entites", entites).append("intent", intent).append("intentRanking", intentRanking).append("text", text).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(intentRanking).append(entites).append(text).append(additionalProperties).append(intent).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LatestMessage) == false) {
            return false;
        }
        LatestMessage rhs = ((LatestMessage) other);
        return new EqualsBuilder().append(intentRanking, rhs.intentRanking).append(entites, rhs.entites).append(text, rhs.text).append(additionalProperties, rhs.additionalProperties).append(intent, rhs.intent).isEquals();
    }

}
