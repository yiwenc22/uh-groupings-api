package edu.hawaii.its.api.type;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class MembershipAssignment {
    private List<Grouping> groupingsIn;
    private List<Grouping> groupingsToOptInTo;
    private String jsonMap;
    private Map<String, Boolean> inBasis = new HashMap<>();

    public List<Grouping> getGroupingsIn() {
        return groupingsIn;
    }

    public void setGroupingsIn(List<Grouping> groupingsIn) {
        this.groupingsIn = groupingsIn;
    }

    public List<Grouping> getGroupingsToOptInTo() {
        return groupingsToOptInTo;
    }

    public void setGroupingsToOptInTo(List<Grouping> groupingsToOptInTo) {
        this.groupingsToOptInTo = groupingsToOptInTo;
    }

    public void addInBasis(String key, Boolean value) {
        inBasis.put(key, value);
    }

    public boolean isInBasis (String key) {
        return inBasis.get(key);
    }

    public void setJsonMap() throws JsonProcessingException {
        this.jsonMap = new ObjectMapper().writeValueAsString(inBasis);
    }

    public String getJsonMap() {
        return jsonMap;
    }
}
