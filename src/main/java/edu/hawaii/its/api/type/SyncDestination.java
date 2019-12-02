package edu.hawaii.its.api.type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// SyncDest needs to cover for nulls

@Entity
@Table(name = "syncDestinations")
public class SyncDestination {
    // 3 variables for object
    private String name;
    private String description;
    private String tooltip;

    // Default Constructor
    public SyncDestination() {
        //empty
    }

    public SyncDestination(String name, String description, String tooltip) {
        this.name = name != null?name:"";
        this.description = description;
        this.tooltip = tooltip;
    }

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "tooltip")
    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }
}
