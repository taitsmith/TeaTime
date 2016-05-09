package net.taitsmith.teatime;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 * Created by taits on 03-May-16.
 * Does all the work of creating the list
 * of teas which are then fed through *TeaListFragmentTest
 * and called by *TeaListActivity when buttons are pressed
 */
public class TeaLab {
    private static TeaLab sTeaList;
    public List<Tea> mwhiteTeas, moolongTeas, motherRegionTeas, mchinaTeas, mafricaTeas,
                        mjapanTeas, mindiaTeas, motherTypeTeas, mblackTeas, mgreenTeas, mTeas;


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
        mTeas = new ArrayList<>();
        mjapanTeas = new ArrayList<>();
        mindiaTeas = new ArrayList<>();
        mafricaTeas = new ArrayList<>();

        //TODO update all .add methods once classes have been created
        Tea assam = new Tea();
        assam.setmName("Assam");
        assam.setmRegion("India");
        assam.setmType("Black");
        assam.setmDirections("212 for three minutes");
        mblackTeas.add(assam);
        mindiaTeas.add(assam);
        mTeas.add(assam);

        Tea bdp = new Tea();
        bdp.setmName("Black Dragon Pearls");
        bdp.setmType("Black");
        bdp.setmRegion("China");
        mchinaTeas.add(bdp);
        mblackTeas.add(bdp);
        mTeas.add(bdp);

        Tea ceylon = new Tea();
        ceylon.setmName("Ceylon - Sri Lanka");
        ceylon.setmRegion("Africa");
        ceylon.setmType("Black");
        mblackTeas.add(ceylon);
        mafricaTeas.add(ceylon);
        mTeas.add(ceylon);                      //TODO change description to <string> desc

        Tea dw = new Tea();
        dw.setmName("Dragonwell");
        dw.setmRegion("China");
        dw.setmType("Green");
        dw.setmDirections("75-80c for 60 seconds");
        dw.setmDesc(R.string.dw_desc);
        mTeas.add(dw);
        mchinaTeas.add(dw);
        mgreenTeas.add(dw);


        Tea earlgrey = new Tea();
        earlgrey.setmName("Earl Grey");
        earlgrey.setmRegion("China");
        earlgrey.setmType("Black");
        mblackTeas.add(earlgrey);
        mchinaTeas.add(earlgrey);
        mTeas.add(earlgrey);

        Tea english = new Tea();
        english.setmName("English Breakfast");
        english.setmType("Black");
        english.setmRegion("China");
        mblackTeas.add(english);
        mchinaTeas.add(english);
        mTeas.add(english);

        Tea ffd = new Tea();
        ffd.setmName("First Flush Darjeeling");
        ffd.setmRegion("India");
        ffd.setmType("Black");
        mblackTeas.add(ffd);
        mindiaTeas.add(ffd);
        mTeas.add(ffd);

        Tea genmaicha = new Tea();
        genmaicha.setmName("Genmaicha");
        genmaicha.setmType("Green");
        genmaicha.setmRegion("Japan");
        mgreenTeas.add(genmaicha);
        mTeas.add(genmaicha);

        Tea gpg = new Tea();
        gpg.setmName("Gundpowder Green");
        gpg.setmType("Green");
        gpg.setmRegion("China");
        gpg.setmDirections("70c for 60 seconds");
        gpg.setmDesc(R.string.gpg_desc);
        mchinaTeas.add(gpg);
        mgreenTeas.add(gpg);
        mTeas.add(gpg);

        Tea gyo = new Tea();
        gyo.setmName("Gyokuro");
        gyo.setmType("Green");
        gyo.setmRegion("Japan");
        mgreenTeas.add(gyo);
        mTeas.add(gyo);

        Tea hoj = new Tea();
        hoj.setmName("Hojicha");
        hoj.setmType("Green");
        hoj.setmRegion("Japan");
        mgreenTeas.add(hoj);
        mTeas.add(hoj);

        Tea irish = new Tea();
        irish.setmName("Irish Breakfast");
        irish.setmRegion("China");
        irish.setmType("Black");
        mblackTeas.add(irish);
        mchinaTeas.add(irish);
        mTeas.add(irish);

        Tea keemun = new Tea();
        keemun.setmName("Keemun");
        keemun.setmType("Black");
        keemun.setmRegion("China");
        mblackTeas.add(keemun);
        mchinaTeas.add(keemun);
        mTeas.add(keemun);

        Tea ctc = new Tea();
        ctc.setmName("Kenyan CTC");
        ctc.setmType("Black");
        ctc.setmRegion("Africa");
        mblackTeas.add(ctc);
        mafricaTeas.add(ctc);
        mTeas.add(ctc);

        Tea kenyan = new Tea();
        kenyan.setmName("Kenyan");
        kenyan.setmType("Black");
        kenyan.setmRegion("Africa");
        mblackTeas.add(kenyan);
        mafricaTeas.add(kenyan);
        mTeas.add(kenyan);

        Tea kukicha = new Tea();
        kukicha.setmName("Kukicha");
        kukicha.setmType("Green");
        kukicha.setmRegion("Japan");
        mgreenTeas.add(kukicha);
        mTeas.add(kukicha);

        Tea lapsang = new Tea();
        lapsang.setmName("Lapsang Souchong");
        lapsang.setmType("Black");
        lapsang.setmRegion("China");
        mblackTeas.add(lapsang);
        mchinaTeas.add(lapsang);
        mTeas.add(lapsang);

        Tea lc = new Tea();
        lc.setmName("Lung Ching");
        lc.setmType("Green");
        lc.setmRegion("China");
        mchinaTeas.add(lc);
        mgreenTeas.add(lc);
        mTeas.add(lc);

        Tea mpg = new Tea();
        mpg.setmName("Monkey Picked Golden");
        mpg.setmType("Black");
        mpg.setmRegion("China");
        mblackTeas.add(mpg);
        mchinaTeas.add(mpg);
        mTeas.add(mpg);

        Tea plc = new Tea();
        plc.setmName("Pi Lo Chun");
        plc.setmType("Green");
        plc.setmRegion("China");
        mchinaTeas.add(plc);
        mgreenTeas.add(plc);
        mTeas.add(plc);

        Tea sfd = new Tea();
        sfd.setmName("Second Flush Darjeeling");
        sfd.setmType("Black");
        sfd.setmRegion("India");
        mblackTeas.add(sfd);
        mindiaTeas.add(sfd);
        mTeas.add(sfd);

        Tea sencha = new Tea();
        sencha.setmName("Sencha");
        sencha.setmType("Green");
        sencha.setmRegion("Japan");
        mgreenTeas.add(sencha);
        mjapanTeas.add(sencha);
        mTeas.add(sencha);




    }



    public List<Tea> getmJapanTeas() {
        return mjapanTeas;
    }

    public List<Tea> getmAfricaTeas() {
        return mafricaTeas;
    }

    public List<Tea> getmIndiaTeas() {
        return mindiaTeas;
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
        for (Tea tea : mTeas) {
            if (tea.getmId().equals(id)) {
                return tea;
            }
        }
        return null;
    }

}
