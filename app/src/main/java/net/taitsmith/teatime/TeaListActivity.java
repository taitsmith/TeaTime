package net.taitsmith.teatime;

import android.support.v4.app.Fragment;

/**
 * Not sure why I made it this way, but ok.
 */
public class TeaListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new TeaListFragment();
    }


}
