package net.taitsmith.teatime;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by taits on 03-May-16.
 * Does all the work of creating the list
 * of teas which are then fed through BlackTeaListFragment
 * and called by BlackTeaListActivity when buttons are pressed
 */
public class TeaLab {
    private static TeaLab sTeaList;
    private List<Tea> mgreenTeas;
    private List<Tea> mblackTeas;
    private List<Tea> mwhiteTeas, moolongTeas, motherRegionTeas, mchinaTeas, mafricaTeas,
                        mjapanTeas, mindiaTeas, motherTypeTeas;


    public static TeaLab get(Context context) {
        if (sTeaList == null) {
            sTeaList = new TeaLab(context);
        }
        return sTeaList;
    }

    private TeaLab(Context context){
        mgreenTeas = new ArrayList<>();
        mblackTeas = new ArrayList<>();
        mwhiteTeas = new ArrayList<>();
        mchinaTeas = new ArrayList<>();


        Tea assam = new Tea();
        assam.setmName("Assam");
        assam.setmRegion("China");
        assam.setmType("Black");
        mblackTeas.add(assam);
        mchinaTeas.add(assam);



        Tea english = new Tea();
        english.setmName("English Breakfast");
        english.setmType("Black");
        english.setmRegion("China");
        mblackTeas.add(english);
        mchinaTeas.add(english);


        Tea kenyan = new Tea();
        kenyan.setmName("Kenyan");
        kenyan.setmType("Black");
        kenyan.setmRegion("Kenya");
        mblackTeas.add(kenyan);


        Tea irish = new Tea();
        irish.setmName("Irish Breakfast");
        irish.setmRegion("China");
        irish.setmType("Black");
        mblackTeas.add(irish);
        mchinaTeas.add(irish);

        Tea sencha = new Tea();
        sencha.setmName("Sencha");
        sencha.setmType("Green");
        sencha.setmRegion("Japan");
        mgreenTeas.add(sencha);
        



    }


    public List<Tea> getmBlackTeas() {
        return mblackTeas;
    }
    public List<Tea> getmGreenTeas() {
        return mgreenTeas;
    }

    public List<Tea> getmchinaTeas() {
        return mchinaTeas;
    }

    public Tea getTeas(UUID id) {
        for (Tea tea : mgreenTeas) {
            if (tea.getmId().equals(id)) {
                return tea;
            }
        }
        return null;
    }

}
