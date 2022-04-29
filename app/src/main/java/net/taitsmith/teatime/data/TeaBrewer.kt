package net.taitsmith.teatime.data

import android.content.Context
import android.util.Log
import io.realm.Realm
import net.taitsmith.teatime.R

/**
 * In this version of TeaBrewer, all we do is create the Realm objects for each [Tea]
 * and assign it its relevant info.
 */
object TeaBrewer {
    //TODO finish up removing the last few hard-coded strings.
    fun populateRealm(context: Context, realm: Realm) {
        realm.executeTransactionAsync(
            { realm1 ->
                val assam = realm1.createObject(Tea::class.java)
                assam.name = context.getString(R.string.assam)
                assam.region = context.getString(R.string.india)
                assam.type = context.getString(R.string.tea_black)
                assam.directions = "90-95c for two minutes"
                assam.description = context.getString(R.string.assam_desc)
                val bdp = realm1.createObject(Tea::class.java)
                bdp.name = context.getString(R.string.black_dragon_pearls)
                bdp.type = context.getString(R.string.tea_black)
                bdp.region = context.getString(R.string.china)
                bdp.directions = "90c for 3-4 minutes"
                bdp.description = context.getString(R.string.bdp_desc)
                val ceylon = realm1.createObject(Tea::class.java)
                ceylon.name = context.getString(R.string.ceylon_sri_lanka)
                ceylon.region = context.getString(R.string.africa)
                ceylon.type = context.getString(R.string.tea_black)
                ceylon.description = context.getString(R.string.ceylon_desc)
                ceylon.directions = "Varies"
                val dhp = realm1.createObject(Tea::class.java)
                dhp.name = context.getString(R.string.da_hong_pao)
                dhp.type = context.getString(R.string.tea_oolong)
                dhp.region = context.getString(R.string.china)
                dhp.directions = "95c for 2 to 3 minutes"
                dhp.description = context.getString(R.string.dhp_desc)
                val darjeeling = realm1.createObject(Tea::class.java)
                darjeeling.name = context.getString(R.string.darjeeling)
                darjeeling.type = context.getString(R.string.tea_black)
                darjeeling.region = context.getString(R.string.india)
                darjeeling.description = context.getString(R.string.dar_desc)
                darjeeling.directions = "Varies"
                val dw = realm1.createObject(Tea::class.java)
                dw.name = context.getString(R.string.dragonwell)
                dw.region = context.getString(R.string.china)
                dw.type = context.getString(R.string.tea_green)
                dw.directions = "75-80c for 60 seconds"
                dw.description = context.getString(R.string.dw_desc)
                val earlgrey = realm1.createObject(Tea::class.java)
                earlgrey.name = context.getString(R.string.earl_grey)
                earlgrey.region = context.getString(R.string.china)
                earlgrey.type = context.getString(R.string.tea_black)
                earlgrey.description = context.getString(R.string.eg_desc)
                earlgrey.directions = "95c for 3 minutes"
                val eb = realm1.createObject(Tea::class.java)
                eb.name = context.getString(R.string.english_breakfast)
                eb.type = context.getString(R.string.tea_black)
                eb.region = context.getString(R.string.china)
                eb.description = context.getString(R.string.eb_desc)
                eb.directions = "95c for 3 minutes"
                val genmaicha = realm1.createObject(Tea::class.java)
                genmaicha.name = context.getString(R.string.genmaicha)
                genmaicha.type = context.getString(R.string.tea_green)
                genmaicha.region = context.getString(R.string.japan)
                genmaicha.directions = "100c for 30 seconds"
                genmaicha.description = context.getString(R.string.gen_desc)
                val gpg = realm1.createObject(Tea::class.java)
                gpg.name = context.getString(R.string.gunpowder_green)
                gpg.type = context.getString(R.string.tea_green)
                gpg.region = context.getString(R.string.china)
                gpg.directions = "70c for 60 seconds"
                gpg.description = context.getString(R.string.gpg_desc)
                val gyo = realm1.createObject(Tea::class.java)
                gyo.name = context.getString(R.string.gyokuro)
                gyo.type = context.getString(R.string.tea_green)
                gyo.region = context.getString(R.string.japan)
                gyo.directions = "50-60c for 90 seconds"
                gyo.description = context.getString(R.string.gyo_desc)
                val hoj = realm1.createObject(Tea::class.java)
                hoj.name = context.getString(R.string.hojicha)
                hoj.type = context.getString(R.string.tea_green)
                hoj.region = context.getString(R.string.japan)
                hoj.directions = "82c for 30 to 90 seconds"
                hoj.description = context.getString(R.string.hoj_desc)
                val irish = realm1.createObject(Tea::class.java)
                irish.name = context.getString(R.string.irish_breakfast)
                irish.region = context.getString(R.string.india)
                irish.type = context.getString(R.string.tea_black)
                irish.directions = "95c for 30 seconds"
                irish.description = context.getString(R.string.ib_desc)
                val jax = realm1.createObject(Tea::class.java)
                jax.name = context.getString(R.string.jaksul)
                jax.type = context.getString(R.string.tea_green)
                jax.region = context.getString(R.string.korea)
                jax.directions = "75c for 2 minutes"
                jax.description = context.getString(R.string.jax_desc)
                val keemun = realm1.createObject(Tea::class.java)
                keemun.name = context.getString(R.string.keemun)
                keemun.type = context.getString(R.string.tea_black)
                keemun.region = context.getString(R.string.china)
                keemun.directions = "95c for 3 minutes"
                keemun.description = context.getString(R.string.keemun_desc)
                val ctc = realm1.createObject(Tea::class.java)
                ctc.name = context.getString(R.string.kenyan_ctc)
                ctc.type = context.getString(R.string.tea_black)
                ctc.region = context.getString(R.string.africa)
                ctc.directions = "95c for 30 seconds"
                ctc.description = context.getString(R.string.ctc_desc)
                val kenyan = realm1.createObject(Tea::class.java)
                kenyan.name = context.getString(R.string.kenyan)
                kenyan.type = context.getString(R.string.tea_black)
                kenyan.directions = "95c for 3 minutes"
                kenyan.region = context.getString(R.string.africa)
                kenyan.description = context.getString(R.string.kenyan_desc)
                val kukicha = realm1.createObject(Tea::class.java)
                kukicha.name = context.getString(R.string.kukicha)
                kukicha.type = context.getString(R.string.tea_green)
                kukicha.region = context.getString(R.string.japan)
                kukicha.directions = "80c for 40 seconds"
                kukicha.description = context.getString(R.string.kuk_desc)
                val lapsang = realm1.createObject(Tea::class.java)
                lapsang.name = context.getString(R.string.lapsang_souchong)
                lapsang.type = context.getString(R.string.tea_black)
                lapsang.region = context.getString(R.string.china)
                lapsang.directions = "100c for 2 to 3 minutes"
                lapsang.description = context.getString(R.string.ls_desc)
                val mpg = realm1.createObject(Tea::class.java)
                mpg.name = context.getString(R.string.monkey_picked_golden)
                mpg.type = context.getString(R.string.tea_black)
                mpg.region = context.getString(R.string.china)
                mpg.directions = "100c for 2 to 3 minutes"
                mpg.description = context.getString(R.string.mpg_desc)
                val plc = realm1.createObject(Tea::class.java)
                plc.name = context.getString(R.string.pi_luo_chun)
                plc.type = context.getString(R.string.tea_green)
                plc.region = context.getString(R.string.china)
                plc.directions = "80c for 1 to 2 minutes"
                plc.description = context.getString(R.string.plc_desc)
                val pou = realm1.createObject(Tea::class.java)
                pou.name = context.getString(R.string.pouchong)
                pou.type = context.getString(R.string.tea_oolong)
                pou.region = context.getString(R.string.taiwan)
                pou.directions = "95c for 3 minutes"
                pou.description = context.getString(R.string.pou_desc)
                val sencha = realm1.createObject(Tea::class.java)
                sencha.name = context.getString(R.string.sencha)
                sencha.type = context.getString(R.string.tea_green)
                sencha.directions = "80c for 1 minute"
                sencha.description = context.getString(R.string.sencha_desc)
                sencha.region = context.getString(R.string.japan)
                val sm = realm1.createObject(Tea::class.java)
                sm.name = context.getString(R.string.shoumei)
                sm.region = context.getString(R.string.china)
                sm.type = context.getString(R.string.tea_white)
                sm.directions = "70c for 2 to 3 minutes"
                sm.description = context.getString(R.string.sm_desc)
                val sh = realm1.createObject(Tea::class.java)
                sh.name = context.getString(R.string.shui_hsien)
                sh.type = context.getString(R.string.tea_oolong)
                sh.region = context.getString(R.string.china)
                sh.directions = "95c for 2 to 3 minutes"
                sh.description = context.getString(R.string.sh_desc)
                val sjg = realm1.createObject(Tea::class.java)
                sjg.name = context.getString(R.string.shui_jin_gui)
                sjg.type = context.getString(R.string.tea_oolong)
                sjg.region = context.getString(R.string.china)
                sjg.directions = "95c for 3 minutes"
                sjg.description = context.getString(R.string.sjg_desc)
                val sn = realm1.createObject(Tea::class.java)
                sn.name = context.getString(R.string.silver_needle)
                sn.type = context.getString(R.string.tea_white)
                sn.region = context.getString(R.string.china)
                sn.directions = "75c up to 5 minutes"
                sn.description = context.getString(R.string.sn_desc)
                val tgy = realm1.createObject(Tea::class.java)
                tgy.name = context.getString(R.string.tieguanyin)
                tgy.type = context.getString(R.string.tea_oolong)
                tgy.region = context.getString(R.string.china)
                tgy.directions = "90-95c for 2 to 3 minutes"
                tgy.description = context.getString(R.string.tgy_desc)
                val tie = realm1.createObject(Tea::class.java)
                tie.name = context.getString(R.string.tieluohan)
                tie.type = context.getString(R.string.tea_oolong)
                tie.region = context.getString(R.string.china)
                tie.directions = "95c for 2 to 3 minutes"
                tie.description = context.getString(R.string.tie_desc)
                val yun = realm1.createObject(Tea::class.java)
                yun.name = context.getString(R.string.yunnan)
                yun.type = context.getString(R.string.tea_black)
                yun.directions = "Varies"
                yun.region = context.getString(R.string.china)
                yun.description = context.getString(R.string.yun_desc)
                val wp = realm1.createObject(Tea::class.java)
                wp.name = context.getString(R.string.white_peony)
                wp.type = context.getString(R.string.tea_white)
                wp.directions = "75c for 3 minutes"
                wp.region = context.getString(R.string.china)
                wp.description = context.getString(R.string.wp_desc)
            },
            {
                Log.d(
                    "TeaBrewer",
                    " Great Success!"
                )
            }) { throwable -> Log.e(TeaBrewer::class.java.simpleName, throwable.toString()) }
    }
}