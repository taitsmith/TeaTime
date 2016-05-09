package net.taitsmith.teatime;

import java.util.UUID;

/**
 * Created by taits on 03-May-16.
 * Creates and sets all relevant tea data
 */
public class Tea {
    private UUID mId;
    private String mName, mType, mRegion, mDirections;
    private int mDesc;

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

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public String getmRegion() {
        return mRegion;
    }

    public void setmRegion(String mRegion) {
        this.mRegion = mRegion;
    }

    public String getmDirections() {
        return mDirections;
    }

    public void setmDirections(String mDirections) {
        this.mDirections = mDirections;
    }


}

