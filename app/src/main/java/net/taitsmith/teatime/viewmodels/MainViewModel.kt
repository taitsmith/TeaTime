package net.taitsmith.teatime.viewmodels

import android.content.Context
import androidx.lifecycle.ViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import net.taitsmith.teatime.R

class MainViewModel : ViewModel() {

    fun showExplanation(context: Context) {
        val builder = MaterialAlertDialogBuilder(context)
        builder.setMessage(context.getString(R.string.alert_explanation))
        builder.setPositiveButton(context.getString(R.string.alert_got_it), null)
        builder.setNegativeButton(context.getString(R.string.alert_dont_show_again)) { _, _ ->
            val preferences = context.getSharedPreferences("SHARED_PREFS", 0)
            val editor = preferences.edit()
            editor.putBoolean("SHOW_EXP", false)
            editor.apply()
        }
        val dialog = builder.create()
        dialog.show()
    }
}