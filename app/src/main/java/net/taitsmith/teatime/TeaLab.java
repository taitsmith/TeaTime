package net.taitsmith.teatime;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 * Created by taits on 03-May-16.
 * Does all the work of creating the tea objects and list
 * of teas which are then fed through TeaListFragmentTest
 * and called by TeaListActivity when buttons are pressed
 */
public class TeaLab {
    private final String LOG_TAG = "LOG";
    private static TeaLab sTeaList;
    public List<Tea> mwhiteOolongTeas, moolongTeas, mchinaTeas, mafricaTeas,
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
        mwhiteOolongTeas = new ArrayList<>();
        mchinaTeas = new ArrayList<>();
        mTeas = new ArrayList<>();
        mjapanTeas = new ArrayList<>();
        mafricaTeas = new ArrayList<>(); //now  includes india and other regions
        moolongTeas = new ArrayList<>();


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

        Tea dhp = new Tea();
        dhp.setmName("Da Hong Pao");
        dhp.setmType("Oolong");
        dhp.setmRegion("China");
        dhp.setmDirections("95c for 2 to 3 minutes");
        dhp.setmDesc(R.string.dhp_desc);
        mwhiteOolongTeas.add(dhp);
        mchinaTeas.add(dhp);
        mTeas.add(dhp);

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

        Tea jax = new Tea();
        jax.setmName("Jaksul");
        jax.setmType("Green");
        jax.setmRegion("Korea");
        jax.setmDirections("75c for 2 minutes");
        jax.setmDesc(R.string.jax_desc);
        mTeas.add(jax);
        mgreenTeas.add(jax);
        mafricaTeas.add(jax);

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

        Tea mpg = new Tea();
        mpg.setmName("Monkey Picked Golden");
        mpg.setmType("Black");
        mpg.setmRegion("China");
        mpg.setmDirections("100c for 2 to 3 minutes");
        mpg.setmDesc(R.string.mpg_desc);
        mblackTeas.add(mpg);
        mchinaTeas.add(mpg);
        mTeas.add(mpg);

        Tea plc = new Tea();
        plc.setmName("Pi Luo Chun");
        plc.setmType("Green");
        plc.setmRegion("China");
        plc.setmDirections("80c for 1 to 2 minutes");
        plc.setmDesc(R.string.plc_desc);
        mchinaTeas.add(plc);
        mgreenTeas.add(plc);
        mTeas.add(plc);

        Tea pou = new Tea();
        pou.setmName("Pouchong");
        pou.setmType("Oolong");
        pou.setmRegion("Taiwan");
        pou.setmDirections("95c for 3 minutes");
        pou.setmDesc(R.string.pou_desc);
        mwhiteOolongTeas.add(pou);
        mafricaTeas.add(pou);
        mTeas.add(pou);

        Tea sencha = new Tea();
        sencha.setmName("Sencha");
        sencha.setmType("Green");
        sencha.setmDirections("80c for 1 minute");
        sencha.setmDesc(R.string.sencha_desc);
        sencha.setmRegion("Japan");
        mgreenTeas.add(sencha);
        mjapanTeas.add(sencha);
        mTeas.add(sencha);

        Tea sm = new Tea();
        sm.setmName("Shoumei");
        sm.setmRegion("China");
        sm.setmType("White");
        sm.setmDirections("70c for 2 to 3 minutes");
        sm.setmDesc(R.string.sm_desc);
        mwhiteOolongTeas.add(sm);
        mchinaTeas.add(sm);
        mTeas.add(sm);

        Tea sh = new Tea();
        sh.setmName("Shui Hsien");
        sh.setmType("Oolong");
        sh.setmRegion("China");
        sh.setmDirections("95c for 2 to 3 minutes");
        sh.setmDesc(R.string.sh_desc);
        mwhiteOolongTeas.add(sh);
        mchinaTeas.add(sh);
        mTeas.add(sh);

        Tea sjg = new Tea();
        sjg.setmName("Shui Jin Gui");
        sjg.setmType("Oolong");
        sjg.setmRegion("China");
        sjg.setmDirections("95c for 3 minutes");
        sjg.setmDesc(R.string.sjg_desc);
        mwhiteOolongTeas.add(sjg);
        mchinaTeas.add(sjg);
        mTeas.add(sjg);

        Tea sn = new Tea();
        sn.setmName("Silver Needle");
        sn.setmType("White");
        sn.setmRegion("China");
        sn.setmDirections("75c up to 5 minutes");
        sn.setmDesc(R.string.sn_desc);
        mchinaTeas.add(sn);
        mwhiteOolongTeas.add(sn);
        mTeas.add(sn);

        Tea tgy = new Tea();
        tgy.setmName("Tieguanyin");
        tgy.setmType("Oolong");
        tgy.setmRegion("China");
        tgy.setmDirections("90-95c for 2 to 3 minutes");
        tgy.setmDesc(R.string.tgy_desc);
        mchinaTeas.add(tgy);
        mwhiteOolongTeas.add(tgy);
        mTeas.add(tgy);


        Tea tie = new Tea();
        tie.setmName("Tieluohan");
        tie.setmType("Oolong");
        tie.setmRegion("China");
        tie.setmDirections("95c for 2 to 3 minutes");
        tie.setmDesc(R.string.tie_desc);
        mwhiteOolongTeas.add(tie);
        mchinaTeas.add(tie);
        mTeas.add(tie);

        Tea yun = new Tea();
        yun.setmName("Yunnan");
        yun.setmType("Black");
        yun.setmDirections("Varies");
        yun.setmRegion("China");
        yun.setmDesc(R.string.yun_desc);
        mchinaTeas.add(yun);
        mblackTeas.add(yun);
        mTeas.add(yun);

        Tea wp = new Tea();
        wp.setmName("White Peony");
        wp.setmType("White");
        wp.setmDirections("75c for 3 minutes");
        wp.setmRegion("China");
        wp.setmDesc(R.string.wp_desc);
        mwhiteOolongTeas.add(wp);
        mchinaTeas.add(wp);
        mTeas.add(wp);



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
    public List<Tea> getmchinaTeas() { return mchinaTeas; }
    public List<Tea> getmWhiteTeas() { return mwhiteOolongTeas; }

    public Tea getTeas(UUID id) {
        for (Tea tea : mTeas) {
            if (tea.getmId().equals(id)) {
                return tea;
            }
        }
        return null;
    }

}
