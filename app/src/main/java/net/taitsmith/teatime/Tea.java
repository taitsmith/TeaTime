package net.taitsmith.teatime;

import java.util.UUID;

/**
 * Created by taits on 03-May-16.
 */
public class Tea {
    private UUID mId;
    private String mName, mType, mRegion;

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
}
