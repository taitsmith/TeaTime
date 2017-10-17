package net.taitsmith.teatime.data;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;

import net.taitsmith.teatime.R;

import io.realm.Realm;
import io.realm.RealmResults;

import static net.taitsmith.teatime.activities.MainActivity.realmConfiguration;

/**
 * Do some cool stuff here instead of in the activities.
 */

public class Utils {

    public static RealmResults<Tea> teaList(String sortBy, @Nullable String selection) {
        Realm realm = Realm.getInstance(realmConfiguration);

        if (sortBy.equals("all")) {
            return realm.where(Tea.class)
                    .findAll();
        } else if (selection.equals("other")) {
            if (sortBy.equals("region")) {
                return realm.where(Tea.class)
                        .not()
                        .in("region", new String[]{"China", "Japan"})
                        .findAll();
            } else {
                return realm.where(Tea.class)
                        .not()
                        .in("type", new String[]{"Green Tea", "Black Tea"})
                        .findAll();
            }
        }

        return realm.where(Tea.class)
                .equalTo(sortBy, selection)
                .findAll();
    }

    public static void showExplanation(final Context context) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setMessage(context.getString(R.string.alert_explanation));
        builder.setPositiveButton(context.getString(R.string.alert_got_it), null);
        builder.setNegativeButton(context.getString(R.string.alert_dont_show_again), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                SharedPreferences preferences = context.getSharedPreferences("SHARED_PREFS", 0);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("SHOW_EXP", false);
                editor.apply();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
