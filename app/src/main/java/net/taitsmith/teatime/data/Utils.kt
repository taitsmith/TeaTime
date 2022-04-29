package net.taitsmith.teatime.data

import android.app.AlertDialog
import android.content.Context
import io.realm.RealmResults
import net.taitsmith.teatime.activities.MainActivity
import net.taitsmith.teatime.R
import io.realm.Realm

object Utils {
    fun teaList(sortBy: String, selection: String?): RealmResults<Tea> {
        val realm = Realm.getInstance(MainActivity.realmConfiguration)
        if (sortBy == "all") {
            return realm.where(Tea::class.java)
                .findAll()
        } else if (selection == "other") {
            return if (sortBy == "region") {
                realm.where(Tea::class.java)
                    .not()
                    .`in`("region", arrayOf("China", "Japan"))
                    .findAll()
            } else {
                realm.where(Tea::class.java)
                    .not()
                    .`in`("type", arrayOf("Green Tea", "Black Tea"))
                    .findAll()
            }
        }
        return realm.where(Tea::class.java)
            .equalTo(sortBy, selection)
            .findAll()
    }

    fun showExplanation(context: Context) {
        val builder = AlertDialog.Builder(context)
        builder.setMessage(context.getString(R.string.alert_explanation))
        builder.setPositiveButton(context.getString(R.string.alert_got_it), null)
        builder.setNegativeButton(context.getString(R.string.alert_dont_show_again)) { dialog, which ->
            val preferences = context.getSharedPreferences("SHARED_PREFS", 0)
            val editor = preferences.edit()
            editor.putBoolean("SHOW_EXP", false)
            editor.apply()
        }
        val dialog = builder.create()
        dialog.show()
    }
}