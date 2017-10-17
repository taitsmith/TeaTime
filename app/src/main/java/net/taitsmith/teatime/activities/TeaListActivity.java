package net.taitsmith.teatime.activities;

import android.support.v4.app.Fragment;

import net.taitsmith.teatime.ui.TeaListFragment;

/**
 * Not sure why I made it this way, but ok.
 */
public class TeaListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new TeaListFragment();
    }


}
