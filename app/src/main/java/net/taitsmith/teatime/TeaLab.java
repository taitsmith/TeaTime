package net.taitsmith.teatime;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by taits on 03-May-16.
 */
public class TeaLab {
    private static TeaLab sTeaList;
    private List<Tea> mTeas;

    public static TeaLab get(Context context) {
        if (sTeaList == null) {
            sTeaList = new TeaLab(context);
        }
        return sTeaList;
    }

    private TeaLab(Context context){
        mTeas = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            Tea tea = new Tea();
            tea.setmName("Fake Tea #" + i);

            if(i % 2 == 0) { tea.setmType("Green"); }
                else if(i % 3 == 0) {
                tea.setmType("White");
            } else tea.setmType("Black");

            if(i % 2 == 0) tea.setmRegion("China");
            else if (i % 3 == 0) tea.setmRegion("India");
            else tea.setmRegion("The Moon");

            mTeas.add(tea);

            //TODO fill in the tea list here
        }
    }

    public List<Tea> getTeas() {
        return mTeas;
    }

    public Tea getTeas(UUID id) {
        for (Tea tea : mTeas) {
            if (tea.getmId().equals(id)) {
                return tea;
            }
        }
        return null;
    }

}
