package net.taitsmith.teatime.viewmodels

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.lifecycle.HiltViewModel
import net.taitsmith.teatime.R
import net.taitsmith.teatime.data.Tea
import net.taitsmith.teatime.di.TeaRepository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val teaRepository: TeaRepository
) : ViewModel() {

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

    //we only want to do this on first startup if the database is empty
    fun createDb() {
        val db = Firebase.firestore
        db.collection("teas")
            .get()
            .addOnSuccessListener {result ->
                for (tea in result) {
                    //take items returned
                    teaRepository.addTeas(Tea(
                        tea.id,
                        tea.data["name"].toString(),
                        tea.data["type"].toString(),
                        tea.data["region"].toString(),
                        tea.data["instructions"].toString(),
                        tea.data["description"].toString(),
                        false //set as not tried by default, let the user change later
                        ))
                }
            }
            .addOnFailureListener {
                Log.d("failure", it.message.toString())
            }
    }

    //check to see if the database is empy and needs to be populated from firestore
    fun shouldPopulateDatabase() : Boolean {
        return teaRepository.getAllTeas().isEmpty()
    }
}