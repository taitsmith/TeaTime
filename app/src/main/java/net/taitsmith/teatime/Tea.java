package net.taitsmith.teatime;

import java.util.UUID;

/**
 * Created by taits on 03-May-16.
 * Creates and sets all relevant tea data
 */
public class Tea { //tea object used to populate <Tea> list
    private UUID mId;
    private String mName, mType, mRegion, mDirections;
    private int mDesc;

    //string resource that holds description of teas
    public int getmDesc() {
        return mDesc;
    }
    public void setmDesc(int mDesc) {
        this.mDesc = mDesc;
    }

    public Tea() {
        mId = UUID.randomUUID();
    }

    public UUID getmId() {
        return mId;
    }

    //holds name of tea for display in various places
    public String getmName() {
        return mName;
    }
    public void setmName(String mName) {
        this.mName = mName;
    }

    //holds tea type (black, white, etc) for display
    public String getmType() {
        return mType;
    }
    public void setmType(String mType) {
        this.mType = mType;
    }

    //holds region for display
    public String getmRegion() {
        return mRegion;
    }
    public void setmRegion(String mRegion) {
        this.mRegion = mRegion;
    }

    //holds directions (temperature and time) for display
    public String getmDirections() {
        return mDirections;
    }
    public void setmDirections(String mDirections) {
        this.mDirections = mDirections;
    }

    //TODO update all data to @string resources
}

