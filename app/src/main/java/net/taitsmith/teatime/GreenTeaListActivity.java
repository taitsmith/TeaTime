package net.taitsmith.teatime;

import android.support.v4.app.Fragment;

/**
 * Created by taits on 04-May-16.
 * References BlackTeaListFragment to populate
 * a recyclerview fragment on screen. All
 * calls must go through here since it's
 * the activity. All work is done in Fragment
 * classes.
 */
public class GreenTeaListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new GreenTeaListFragment();
    }

    //TODO find a way to selectively put teas into list
}
