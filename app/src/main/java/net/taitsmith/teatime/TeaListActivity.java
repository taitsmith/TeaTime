package net.taitsmith.teatime;

import android.support.v4.app.Fragment;

/**
 * Created by taits on 04-May-16.
 * References TeaListFragment to populate
 * a recyclerview fragment on screen. All
 * calls must go through here since it's
 * the activity. All work is done in Fragment
 * classes.
 */
public class TeaListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new TeaListFragment();
    }


}
