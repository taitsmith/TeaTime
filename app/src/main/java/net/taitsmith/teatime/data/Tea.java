package net.taitsmith.teatime.data;

import io.realm.RealmObject;

/**
 *
 * Tea object. Nothing exciting.
 */
public class Tea extends RealmObject{ //tea object used to populate <Tea> list
    private String name, type, region, directions, description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //holds name of tea for display in various places
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //holds tea type (black, white, etc) for display
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    //holds region for display
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    //holds directions (temperature and time) for display
    public String getDirections() {
        return directions;
    }
    public void setDirections(String directions) {
        this.directions = directions;
    }
}

