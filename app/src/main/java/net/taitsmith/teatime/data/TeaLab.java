package net.taitsmith.teatime.data;

import android.content.Context;
import android.util.Log;

import net.taitsmith.teatime.R;

import io.realm.Realm;


/**
 * In this version of TeaLab, all we do is create the Realm objects for each {@link Tea}
 * and assign it its relevant info.
 */
public class TeaLab {

    //TODO finish up removing the last few hard-coded strings.
    public static void populateRealm(final Context context, Realm realm) {

        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                Tea assam = realm.createObject(Tea.class);
                assam.setName(context.getString(R.string.assam));
                assam.setRegion(context.getString(R.string.india));
                assam.setType(context.getString(R.string.tea_black));
                assam.setDirections("90-95c for two minutes");
                assam.setDescription(context.getString(R.string.assam_desc));

                Tea bdp = realm.createObject(Tea.class);
                bdp.setName(context.getString(R.string.black_dragon_pearls));
                bdp.setType(context.getString(R.string.tea_black));
                bdp.setRegion(context.getString(R.string.china));
                bdp.setDirections("90c for 3-4 minutes");
                bdp.setDescription(context.getString(R.string.bdp_desc));

                Tea ceylon = realm.createObject(Tea.class);
                ceylon.setName(context.getString(R.string.ceylon_sri_lanka));
                ceylon.setRegion(context.getString(R.string.africa));
                ceylon.setType(context.getString(R.string.tea_black));
                ceylon.setDescription(context.getString(R.string.ceylon_desc));
                ceylon.setDirections("Varies");

                Tea dhp = realm.createObject(Tea.class);
                dhp.setName(context.getString(R.string.da_hong_pao));
                dhp.setType(context.getString(R.string.tea_oolong));
                dhp.setRegion(context.getString(R.string.china));
                dhp.setDirections("95c for 2 to 3 minutes");
                dhp.setDescription(context.getString(R.string.dhp_desc));

                Tea darjeeling = realm.createObject(Tea.class);
                darjeeling.setName(context.getString(R.string.darjeeling));
                darjeeling.setType(context.getString(R.string.tea_black));
                darjeeling.setRegion(context.getString(R.string.india));
                darjeeling.setDescription(context.getString(R.string.dar_desc));
                darjeeling.setDirections("Varies");

                Tea dw = realm.createObject(Tea.class);
                dw.setName(context.getString(R.string.dragonwell));
                dw.setRegion(context.getString(R.string.china));
                dw.setType(context.getString(R.string.tea_green));
                dw.setDirections("75-80c for 60 seconds");
                dw.setDescription(context.getString(R.string.dw_desc));

                Tea earlgrey = realm.createObject(Tea.class);
                earlgrey.setName(context.getString(R.string.earl_grey));
                earlgrey.setRegion(context.getString(R.string.china));
                earlgrey.setType(context.getString(R.string.tea_black));
                earlgrey.setDescription(context.getString(R.string.eg_desc));
                earlgrey.setDirections("95c for 3 minutes");

                Tea eb = realm.createObject(Tea.class);
                eb.setName(context.getString(R.string.english_breakfast));
                eb.setType(context.getString(R.string.tea_black));
                eb.setRegion(context.getString(R.string.china));
                eb.setDescription(context.getString(R.string.eb_desc));
                eb.setDirections("95c for 3 minutes");

                Tea genmaicha = realm.createObject(Tea.class);
                genmaicha.setName(context.getString(R.string.genmaicha));
                genmaicha.setType(context.getString(R.string.tea_green));
                genmaicha.setRegion(context.getString(R.string.japan));
                genmaicha.setDirections("100c for 30 seconds");
                genmaicha.setDescription(context.getString(R.string.gen_desc));

                Tea gpg = realm.createObject(Tea.class);
                gpg.setName(context.getString(R.string.gunpowder_green));
                gpg.setType(context.getString(R.string.tea_green));
                gpg.setRegion(context.getString(R.string.china));
                gpg.setDirections("70c for 60 seconds");
                gpg.setDescription(context.getString(R.string.gpg_desc));

                Tea gyo = realm.createObject(Tea.class);
                gyo.setName(context.getString(R.string.gyokuro));
                gyo.setType(context.getString(R.string.tea_green));
                gyo.setRegion(context.getString(R.string.japan));
                gyo.setDirections("50-60c for 90 seconds");
                gyo.setDescription(context.getString(R.string.gyo_desc));

                Tea hoj = realm.createObject(Tea.class);
                hoj.setName(context.getString(R.string.hojicha));
                hoj.setType(context.getString(R.string.tea_green));
                hoj.setRegion(context.getString(R.string.japan));
                hoj.setDirections("82c for 30 to 90 seconds");
                hoj.setDescription(context.getString(R.string.hoj_desc));

                Tea irish = realm.createObject(Tea.class);
                irish.setName(context.getString(R.string.irish_breakfast));
                irish.setRegion(context.getString(R.string.india));
                irish.setType(context.getString(R.string.tea_black));
                irish.setDirections("95c for 30 seconds");
                irish.setDescription(context.getString(R.string.ib_desc));

                Tea jax = realm.createObject(Tea.class);
                jax.setName(context.getString(R.string.jaksul));
                jax.setType(context.getString(R.string.tea_green));
                jax.setRegion("Korea");
                jax.setDirections("75c for 2 minutes");
                jax.setDescription(context.getString(R.string.jax_desc));

                Tea keemun = realm.createObject(Tea.class);
                keemun.setName(context.getString(R.string.keemun));
                keemun.setType(context.getString(R.string.tea_black));
                keemun.setRegion(context.getString(R.string.china));
                keemun.setDirections("95c for 3 minutes");
                keemun.setDescription(context.getString(R.string.keemun_desc));

                Tea ctc = realm.createObject(Tea.class);
                ctc.setName(context.getString(R.string.kenyan_ctc));
                ctc.setType(context.getString(R.string.tea_black));
                ctc.setRegion("Africa");
                ctc.setDirections("95c for 30 seconds");
                ctc.setDescription(context.getString(R.string.ctc_desc));

                Tea kenyan = realm.createObject(Tea.class);
                kenyan.setName(context.getString(R.string.kenyan));
                kenyan.setType(context.getString(R.string.tea_black));
                kenyan.setDirections("95c for 3 minutes");
                kenyan.setRegion("Africa");
                kenyan.setDescription(context.getString(R.string.kenyan_desc));

                Tea kukicha = realm.createObject(Tea.class);
                kukicha.setName(context.getString(R.string.kukicha));
                kukicha.setType(context.getString(R.string.tea_green));
                kukicha.setRegion(context.getString(R.string.japan));
                kukicha.setDirections("80c for 40 seconds");
                kukicha.setDescription(context.getString(R.string.kuk_desc));

                Tea lapsang = realm.createObject(Tea.class);
                lapsang.setName(context.getString(R.string.lapsang_souchong));
                lapsang.setType(context.getString(R.string.tea_black));
                lapsang.setRegion(context.getString(R.string.china));
                lapsang.setDirections("100c for 2 to 3 minutes");
                lapsang.setDescription(context.getString(R.string.ls_desc));

                Tea mpg = realm.createObject(Tea.class);
                mpg.setName(context.getString(R.string.monkey_picked_golden));
                mpg.setType(context.getString(R.string.tea_black));
                mpg.setRegion(context.getString(R.string.china));
                mpg.setDirections("100c for 2 to 3 minutes");
                mpg.setDescription(context.getString(R.string.mpg_desc));

                Tea plc = realm.createObject(Tea.class);
                plc.setName(context.getString(R.string.pi_luo_chun));
                plc.setType(context.getString(R.string.tea_green));
                plc.setRegion(context.getString(R.string.china));
                plc.setDirections("80c for 1 to 2 minutes");
                plc.setDescription(context.getString(R.string.plc_desc));

                Tea pou = realm.createObject(Tea.class);
                pou.setName(context.getString(R.string.pouchong));
                pou.setType("Oolong");
                pou.setRegion("Taiwan");
                pou.setDirections("95c for 3 minutes");
                pou.setDescription(context.getString(R.string.pou_desc));

                Tea sencha = realm.createObject(Tea.class);
                sencha.setName(context.getString(R.string.sencha));
                sencha.setType(context.getString(R.string.tea_green));
                sencha.setDirections("80c for 1 minute");
                sencha.setDescription(context.getString(R.string.sencha_desc));
                sencha.setRegion(context.getString(R.string.japan));

                Tea sm = realm.createObject(Tea.class);
                sm.setName(context.getString(R.string.shoumei));
                sm.setRegion(context.getString(R.string.china));
                sm.setType("White");
                sm.setDirections("70c for 2 to 3 minutes");
                sm.setDescription(context.getString(R.string.sm_desc));

                Tea sh = realm.createObject(Tea.class);
                sh.setName(context.getString(R.string.shui_hsien));
                sh.setType("Oolong");
                sh.setRegion(context.getString(R.string.china));
                sh.setDirections("95c for 2 to 3 minutes");
                sh.setDescription(context.getString(R.string.sh_desc));

                Tea sjg = realm.createObject(Tea.class);
                sjg.setName(context.getString(R.string.shui_jin_gui));
                sjg.setType("Oolong");
                sjg.setRegion(context.getString(R.string.china));
                sjg.setDirections("95c for 3 minutes");
                sjg.setDescription(context.getString(R.string.sjg_desc));

                Tea sn = realm.createObject(Tea.class);
                sn.setName(context.getString(R.string.silver_needle));
                sn.setType("White");
                sn.setRegion(context.getString(R.string.china));
                sn.setDirections("75c up to 5 minutes");
                sn.setDescription(context.getString(R.string.sn_desc));

                Tea tgy = realm.createObject(Tea.class);
                tgy.setName(context.getString(R.string.tieguanyin));
                tgy.setType("Oolong");
                tgy.setRegion(context.getString(R.string.china));
                tgy.setDirections("90-95c for 2 to 3 minutes");
                tgy.setDescription(context.getString(R.string.tgy_desc));

                Tea tie = realm.createObject(Tea.class);
                tie.setName(context.getString(R.string.tieluohan));
                tie.setType("Oolong");
                tie.setRegion(context.getString(R.string.china));
                tie.setDirections("95c for 2 to 3 minutes");
                tie.setDescription(context.getString(R.string.tie_desc));

                Tea yun = realm.createObject(Tea.class);
                yun.setName(context.getString(R.string.yunnan));
                yun.setType(context.getString(R.string.tea_black));
                yun.setDirections("Varies");
                yun.setRegion(context.getString(R.string.china));
                yun.setDescription(context.getString(R.string.yun_desc));

                Tea wp = realm.createObject(Tea.class);
                wp.setName(context.getString(R.string.white_peony));
                wp.setType("White");
                wp.setDirections("75c for 3 minutes");
                wp.setRegion(context.getString(R.string.china));
                wp.setDescription(context.getString(R.string.wp_desc));

            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {
                Log.d("TeaLab", " Great Success!");
            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable throwable) {
                Log.e(TeaLab.class.getSimpleName(), throwable.toString());
            }
        });
    }
}