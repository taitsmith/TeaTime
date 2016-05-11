package net.taitsmith.teatime;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 * Created by taits on 03-May-16.
 * Does all the work of creating the list
 * of teas which are then fed through TeaListFragmentTest
 * and called by TeaListActivity when buttons are pressed
 */
public class TeaLab {
    private static TeaLab sTeaList;
    public List<Tea> mwhiteTeas, moolongTeas, motherRegionTeas, mchinaTeas, mafricaTeas,
                        mjapanTeas, motherTypeTeas, mblackTeas, mgreenTeas, mTeas;


    public static TeaLab get(Context context) {
        if (sTeaList == null) {
            sTeaList = new TeaLab(context);
        }
        return sTeaList;
    }

    //TODO finish adding teas
    private TeaLab(Context context){ //turns List<Tea> into ArrayList for ArrayAdapter
        mgreenTeas = new ArrayList<>();
        mblackTeas = new ArrayList<>();
        mwhiteTeas = new ArrayList<>();
        mchinaTeas = new ArrayList<>();
        mTeas = new ArrayList<>();
        mjapanTeas = new ArrayList<>();
        mafricaTeas = new ArrayList<>();


        Tea assam = new Tea();
        assam.setmName("Assam");
        assam.setmRegion("India");
        assam.setmType("Black");
        assam.setmDirections("90-95c for two minutes");
        assam.setmDesc(R.string.assam_desc);
        mblackTeas.add(assam);
        mafricaTeas.add(assam);
        mTeas.add(assam);

        Tea bdp = new Tea();
        bdp.setmName("Black Dragon Pearls");
        bdp.setmType("Black");
        bdp.setmRegion("China");
        bdp.setmDirections("90c for 3-4 minutes");
        bdp.setmDesc(R.string.bdp_desc);
        mchinaTeas.add(bdp);
        mblackTeas.add(bdp);
        mTeas.add(bdp);

        Tea ceylon = new Tea();
        ceylon.setmName("Ceylon - Sri Lanka");
        ceylon.setmRegion("Africa");
        ceylon.setmType("Black");
        ceylon.setmDesc(R.string.ceylon_desc);
        ceylon.setmDirections("Varies");
        mblackTeas.add(ceylon);
        mafricaTeas.add(ceylon);
        mTeas.add(ceylon);

        Tea darjeeling = new Tea();
        darjeeling.setmName("Darjeeling");
        darjeeling.setmType("Black");
        darjeeling.setmRegion("India");
        darjeeling.setmDesc(R.string.dar_desc);
        darjeeling.setmDirections("Varies");
        mTeas.add(darjeeling);
        mblackTeas.add(darjeeling);
        mafricaTeas.add(darjeeling);

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
        earlgrey.setmDesc(R.string.eg_desc);
        earlgrey.setmDirections("95c for 3 minutes");
        mblackTeas.add(earlgrey);
        mchinaTeas.add(earlgrey);
        mTeas.add(earlgrey);

        Tea eb = new Tea();
        eb.setmName("English Breakfast");
        eb.setmType("Black");
        eb.setmRegion("China");
        eb.setmDesc(R.string.eb_desc);
        eb.setmDirections("95c for 3 minutes");
        mblackTeas.add(eb);
        mchinaTeas.add(eb);
        mTeas.add(eb);

        Tea genmaicha = new Tea();
        genmaicha.setmName("Genmaicha");
        genmaicha.setmType("Green");
        genmaicha.setmRegion("Japan");
        genmaicha.setmDirections("100c for 30 seconds");
        genmaicha.setmDesc(R.string.gen_desc);
        mgreenTeas.add(genmaicha);
        mjapanTeas.add(genmaicha);
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
        gyo.setmDirections("50-60c for 90 seconds");
        gyo.setmDesc(R.string.gyo_desc);
        mgreenTeas.add(gyo);
        mjapanTeas.add(gyo);
        mTeas.add(gyo);

        Tea hoj = new Tea();
        hoj.setmName("Hojicha");
        hoj.setmType("Green");
        hoj.setmRegion("Japan");
        hoj.setmDirections("82c for 30 to 90 seconds");
        hoj.setmDesc(R.string.hoj_desc);
        mgreenTeas.add(hoj);
        mjapanTeas.add(hoj);
        mTeas.add(hoj);

        Tea irish = new Tea();
        irish.setmName("Irish Breakfast");
        irish.setmRegion("India");
        irish.setmType("Black");
        irish.setmDirections("95c for 30 seconds");
        irish.setmDesc(R.string.ib_desc);
        mblackTeas.add(irish);
        mafricaTeas.add(irish);
        mTeas.add(irish);

        Tea keemun = new Tea();
        keemun.setmName("Keemun");
        keemun.setmType("Black");
        keemun.setmRegion("China");
        keemun.setmDirections("95c for 3 minutes");
        keemun.setmDesc(R.string.keemun_desc);
        mblackTeas.add(keemun);
        mchinaTeas.add(keemun);
        mTeas.add(keemun);

        Tea ctc = new Tea();
        ctc.setmName("Kenyan CTC");
        ctc.setmType("Black");
        ctc.setmRegion("Africa");
        ctc.setmDirections("95c for 30 seconds");
        ctc.setmDesc(R.string.ctc_desc);
        mblackTeas.add(ctc);
        mafricaTeas.add(ctc);
        mTeas.add(ctc);

        Tea kenyan = new Tea();
        kenyan.setmName("Kenyan");
        kenyan.setmType("Black");
        kenyan.setmDirections("95c for 3 minutes");
        kenyan.setmRegion("Africa");
        kenyan.setmDesc(R.string.kenyan_desc);
        mblackTeas.add(kenyan);
        mafricaTeas.add(kenyan);
        mTeas.add(kenyan);

        Tea kukicha = new Tea();
        kukicha.setmName("Kukicha");
        kukicha.setmType("Green");
        kukicha.setmRegion("Japan");
        kukicha.setmDirections("80c for 40 seconds");
        kukicha.setmDesc(R.string.kuk_desc);
        mgreenTeas.add(kukicha);
        mjapanTeas.add(kukicha);
        mTeas.add(kukicha);

        Tea lapsang = new Tea();
        lapsang.setmName("Lapsang Souchong");
        lapsang.setmType("Black");
        lapsang.setmRegion("China");
        lapsang.setmDirections("100c for 2 to 3 minutes");
        lapsang.setmDesc(R.string.ls_desc);
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

        Tea sencha = new Tea();
        sencha.setmName("Sencha");
        sencha.setmType("Green");
        sencha.setmRegion("Japan");
        mgreenTeas.add(sencha);
        mjapanTeas.add(sencha);
        mTeas.add(sencha);

        Tea yun = new Tea();
        yun.setmName("Yunnan");
        yun.setmType("Black");
        yun.setmDirections("Varies");
        yun.setmRegion("China");
        yun.setmDesc(R.string.yun_desc);
        mchinaTeas.add(yun);
        mblackTeas.add(yun);
        mTeas.add(yun);

    }


    public List<Tea> getmTeas() { return mTeas; }
    public List<Tea> getmJapanTeas() {
        return mjapanTeas;
    }
    public List<Tea> getmAfricaTeas(){ return mafricaTeas; }
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
