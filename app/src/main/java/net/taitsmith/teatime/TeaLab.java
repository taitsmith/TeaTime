package net.taitsmith.teatime;

import android.content.Context;

import net.taitsmith.teatime.data.Tea;

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
    private static TeaLab sTeaList;
    public List<Tea> mwhiteOolongTeas, moolongTeas, mchinaTeas, mafricaOtherTeas,
                        mjapanTeas, mblackTeas, mgreenTeas, mTeas;


    public static TeaLab get(Context context) {
        if (sTeaList == null) {
            sTeaList = new TeaLab(context);
        }
        return sTeaList;
    }

    //TODO finish adding teas
    private TeaLab(Context context){ //turns List<Tea> into ArrayList for ArrayAdapter



        Tea assam = new Tea();
        assam.setName(context.getString(R.string.assam));
        assam.setRegion(context.getString(R.string.india));
        assam.setType(context.getString(R.string.tea_black));
        assam.setDirections("90-95c for two minutes");
        assam.setDescription(context.getString(R.string.assam_desc));
        mblackTeas.add(assam);
        mafricaOtherTeas.add(assam);
        mTeas.add(assam);

        Tea bdp = new Tea();
        bdp.setName(context.getString(R.string.black_dragon_pearls));
        bdp.setType(context.getString(R.string.tea_black));
        bdp.setRegion(context.getString(R.string.china));
        bdp.setDirections("90c for 3-4 minutes");
        bdp.setDescription(context.getString(R.string.bdp_desc));
        mchinaTeas.add(bdp);
        mblackTeas.add(bdp);
        mTeas.add(bdp);

        Tea ceylon = new Tea();
        ceylon.setName(context.getString(R.string.ceylon_sri_lanka));
        ceylon.setRegion(context.getString(R.string.africa));
        ceylon.setType(context.getString(R.string.tea_black));
        ceylon.setDescription(context.getString(R.string.ceylon_desc));
        ceylon.setDirections("Varies");
        mblackTeas.add(ceylon);
        mafricaOtherTeas.add(ceylon);
        mTeas.add(ceylon);

        Tea dhp = new Tea();
        dhp.setName(context.getString(R.string.da_hong_pao));
        dhp.setType(context.getString(R.string.tea_oolong));
        dhp.setRegion(context.getString(R.string.china));
        dhp.setDirections("95c for 2 to 3 minutes");
        dhp.setDescription(context.getString(R.string.dhp_desc));
        mwhiteOolongTeas.add(dhp);
        mchinaTeas.add(dhp);
        mTeas.add(dhp);

        Tea darjeeling = new Tea();
        darjeeling.setName(context.getString(R.string.darjeeling));
        darjeeling.setType(context.getString(R.string.tea_black));
        darjeeling.setRegion(context.getString(R.string.india));
        darjeeling.setDescription(context.getString(R.string.dar_desc));
        darjeeling.setDirections("Varies");
        mTeas.add(darjeeling);
        mblackTeas.add(darjeeling);
        mafricaOtherTeas.add(darjeeling);

        Tea dw = new Tea();
        dw.setName(context.getString(R.string.dragonwell));
        dw.setRegion(context.getString(R.string.china));
        dw.setType(context.getString(R.string.tea_green));
        dw.setDirections("75-80c for 60 seconds");
        dw.setDescription(context.getString(R.string.dw_desc));
        mTeas.add(dw);
        mchinaTeas.add(dw);
        mgreenTeas.add(dw);

        Tea earlgrey = new Tea();
        earlgrey.setName(context.getString(R.string.earl_grey));
        earlgrey.setRegion(context.getString(R.string.china));
        earlgrey.setType(context.getString(R.string.tea_black));
        earlgrey.setDescription(context.getString(R.string.eg_desc));
        earlgrey.setDirections("95c for 3 minutes");
        mblackTeas.add(earlgrey);
        mchinaTeas.add(earlgrey);
        mTeas.add(earlgrey);

        Tea eb = new Tea();
        eb.setName(context.getString(R.string.english_breakfast));
        eb.setType(context.getString(R.string.tea_black));
        eb.setRegion(context.getString(R.string.china));
        eb.setDescription(context.getString(R.string.eb_desc));
        eb.setDirections("95c for 3 minutes");
        mblackTeas.add(eb);
        mchinaTeas.add(eb);
        mTeas.add(eb);

        Tea genmaicha = new Tea();
        genmaicha.setName(context.getString(R.string.genmaicha));
        genmaicha.setType(context.getString(R.string.tea_green));
        genmaicha.setRegion(context.getString(R.string.japan));
        genmaicha.setDirections("100c for 30 seconds");
        genmaicha.setDescription(context.getString(R.string.gen_desc));
        mgreenTeas.add(genmaicha);
        mjapanTeas.add(genmaicha);
        mTeas.add(genmaicha);

        Tea gpg = new Tea();
        gpg.setName(context.getString(R.string.gunpowder_green));
        gpg.setType(context.getString(R.string.tea_green));
        gpg.setRegion(context.getString(R.string.china));
        gpg.setDirections("70c for 60 seconds");
        gpg.setDescription(context.getString(R.string.gpg_desc));
        mchinaTeas.add(gpg);
        mgreenTeas.add(gpg);
        mTeas.add(gpg);

        Tea gyo = new Tea();
        gyo.setName(context.getString(R.string.gyokuro));
        gyo.setType(context.getString(R.string.tea_green));
        gyo.setRegion(context.getString(R.string.japan));
        gyo.setDirections("50-60c for 90 seconds");
        gyo.setDescription(context.getString(R.string.gyo_desc));
        mgreenTeas.add(gyo);
        mjapanTeas.add(gyo);
        mTeas.add(gyo);

        Tea hoj = new Tea();
        hoj.setName(context.getString(R.string.hojicha));
        hoj.setType(context.getString(R.string.tea_green));
        hoj.setRegion(context.getString(R.string.japan));
        hoj.setDirections("82c for 30 to 90 seconds");
        hoj.setDescription(context.getString(R.string.hoj_desc));
        mgreenTeas.add(hoj);
        mjapanTeas.add(hoj);
        mTeas.add(hoj);

        Tea irish = new Tea();
        irish.setName(context.getString(R.string.irish_breakfast));
        irish.setRegion(context.getString(R.string.india));
        irish.setType(context.getString(R.string.tea_black));
        irish.setDirections("95c for 30 seconds");
        irish.setDescription(context.getString(R.string.ib_desc));
        mblackTeas.add(irish);
        mafricaOtherTeas.add(irish);
        mTeas.add(irish);

        Tea jax = new Tea();
        jax.setName(context.getString(R.string.jaksul));
        jax.setType(context.getString(R.string.tea_green));
        jax.setRegion("Korea");
        jax.setDirections("75c for 2 minutes");
        jax.setDescription(context.getString(R.string.jax_desc));
        mTeas.add(jax);
        mgreenTeas.add(jax);
        mafricaOtherTeas.add(jax);

        Tea keemun = new Tea();
        keemun.setName(context.getString(R.string.keemun));
        keemun.setType(context.getString(R.string.tea_black));
        keemun.setRegion(context.getString(R.string.china));
        keemun.setDirections("95c for 3 minutes");
        keemun.setDescription(context.getString(R.string.keemun_desc));
        mblackTeas.add(keemun);
        mchinaTeas.add(keemun);
        mTeas.add(keemun);

        Tea ctc = new Tea();
        ctc.setName(context.getString(R.string.kenyan_ctc));
        ctc.setType(context.getString(R.string.tea_black));
        ctc.setRegion("Africa");
        ctc.setDirections("95c for 30 seconds");
        ctc.setDescription(context.getString(R.string.ctc_desc));
        mblackTeas.add(ctc);
        mafricaOtherTeas.add(ctc);
        mTeas.add(ctc);

        Tea kenyan = new Tea();
        kenyan.setName(context.getString(R.string.kenyan));
        kenyan.setType(context.getString(R.string.tea_black));
        kenyan.setDirections("95c for 3 minutes");
        kenyan.setRegion("Africa");
        kenyan.setDescription(context.getString(R.string.kenyan_desc));
        mblackTeas.add(kenyan);
        mafricaOtherTeas.add(kenyan);
        mTeas.add(kenyan);

        Tea kukicha = new Tea();
        kukicha.setName(context.getString(R.string.kukicha));
        kukicha.setType(context.getString(R.string.tea_green));
        kukicha.setRegion(context.getString(R.string.japan));
        kukicha.setDirections("80c for 40 seconds");
        kukicha.setDescription(context.getString(R.string.kuk_desc));
        mgreenTeas.add(kukicha);
        mjapanTeas.add(kukicha);
        mTeas.add(kukicha);
        Tea lapsang = new Tea();
        lapsang.setName(context.getString(R.string.lapsang_souchong));
        lapsang.setType(context.getString(R.string.tea_black));
        lapsang.setRegion(context.getString(R.string.china));
        lapsang.setDirections("100c for 2 to 3 minutes");
        lapsang.setDescription(context.getString(R.string.ls_desc));
        mblackTeas.add(lapsang);
        mchinaTeas.add(lapsang);
        mTeas.add(lapsang);

        Tea mpg = new Tea();
        mpg.setName(context.getString(R.string.monkey_picked_golden));
        mpg.setType(context.getString(R.string.tea_black));
        mpg.setRegion(context.getString(R.string.china));
        mpg.setDirections("100c for 2 to 3 minutes");
        mpg.setDescription(context.getString(R.string.mpg_desc));
        mblackTeas.add(mpg);
        mchinaTeas.add(mpg);
        mTeas.add(mpg);

        Tea plc = new Tea();
        plc.setName(context.getString(R.string.pi_luo_chun));
        plc.setType(context.getString(R.string.tea_green));
        plc.setRegion(context.getString(R.string.china));
        plc.setDirections("80c for 1 to 2 minutes");
        plc.setDescription(context.getString(R.string.plc_desc));
        mchinaTeas.add(plc);
        mgreenTeas.add(plc);
        mTeas.add(plc);

        Tea pou = new Tea();
        pou.setName(context.getString(R.string.pouchong));
        pou.setType("Oolong");
        pou.setRegion("Taiwan");
        pou.setDirections("95c for 3 minutes");
        pou.setDescription(context.getString(R.string.pou_desc));
        mwhiteOolongTeas.add(pou);
        mafricaOtherTeas.add(pou);
        mTeas.add(pou);

        Tea sencha = new Tea();
        sencha.setName(context.getString(R.string.sencha));
        sencha.setType(context.getString(R.string.tea_green));
        sencha.setDirections("80c for 1 minute");
        sencha.setDescription(context.getString(R.string.sencha_desc));
        sencha.setRegion(context.getString(R.string.japan));
        mgreenTeas.add(sencha);
        mjapanTeas.add(sencha);
        mTeas.add(sencha);

        Tea sm = new Tea();
        sm.setName(context.getString(R.string.shoumei));
        sm.setRegion(context.getString(R.string.china));
        sm.setType("White");
        sm.setDirections("70c for 2 to 3 minutes");
        sm.setDescription(context.getString(R.string.sm_desc));
        mwhiteOolongTeas.add(sm);
        mchinaTeas.add(sm);
        mTeas.add(sm);

        Tea sh = new Tea();
        sh.setName(context.getString(R.string.shui_hsien));
        sh.setType("Oolong");
        sh.setRegion(context.getString(R.string.china));
        sh.setDirections("95c for 2 to 3 minutes");
        sh.setDescription(context.getString(R.string.sh_desc));
        mwhiteOolongTeas.add(sh);
        mchinaTeas.add(sh);
        mTeas.add(sh);

        Tea sjg = new Tea();
        sjg.setName(context.getString(R.string.shui_jin_gui));
        sjg.setType("Oolong");
        sjg.setRegion(context.getString(R.string.china));
        sjg.setDirections("95c for 3 minutes");
        sjg.setDescription(context.getString(R.string.sjg_desc));
        mwhiteOolongTeas.add(sjg);
        mchinaTeas.add(sjg);
        mTeas.add(sjg);

        Tea sn = new Tea();
        sn.setName(context.getString(R.string.silver_needle));
        sn.setType("White");
        sn.setRegion(context.getString(R.string.china));
        sn.setDirections("75c up to 5 minutes");
        sn.setDescription(context.getString(R.string.sn_desc));
        mchinaTeas.add(sn);
        mwhiteOolongTeas.add(sn);
        mTeas.add(sn);

        Tea tgy = new Tea();
        tgy.setName(context.getString(R.string.tieguanyin));
        tgy.setType("Oolong");
        tgy.setRegion(context.getString(R.string.china));
        tgy.setDirections("90-95c for 2 to 3 minutes");
        tgy.setDescription(context.getString(R.string.tgy_desc));
        mchinaTeas.add(tgy);
        mwhiteOolongTeas.add(tgy);
        mTeas.add(tgy);

        Tea tie = new Tea();
        tie.setName(context.getString(R.string.tieluohan));
        tie.setType("Oolong");
        tie.setRegion(context.getString(R.string.china));
        tie.setDirections("95c for 2 to 3 minutes");
        tie.setDescription(context.getString(R.string.tie_desc));
        mwhiteOolongTeas.add(tie);
        mchinaTeas.add(tie);
        mTeas.add(tie);

        Tea yun = new Tea();
        yun.setName(context.getString(R.string.yunnan));
        yun.setType(context.getString(R.string.tea_black));
        yun.setDirections("Varies");
        yun.setRegion(context.getString(R.string.china));
        yun.setDescription(context.getString(R.string.yun_desc));
        mchinaTeas.add(yun);
        mblackTeas.add(yun);
        mTeas.add(yun);

        Tea wp = new Tea();
        wp.setName(context.getString(R.string.white_peony));
        wp.setType("White");
        wp.setDirections("75c for 3 minutes");
        wp.setRegion(context.getString(R.string.china));
        wp.setDescription(context.getString(R.string.wp_desc));
        mwhiteOolongTeas.add(wp);
        mchinaTeas.add(wp);
        mTeas.add(wp);

    }


    List<Tea> getmTeas() { return mTeas; }
    List<Tea> getmJapanTeas() { return mjapanTeas; }
    List<Tea> getmAfricaTeas(){ return mafricaOtherTeas; }
    List<Tea> getmBlackTeas() { return mblackTeas; }
    List<Tea> getmGreenTeas() { return mgreenTeas; }
    List<Tea> getmchinaTeas() { return mchinaTeas; }
    List<Tea> getmWhiteTeas() { return mwhiteOolongTeas; }


}