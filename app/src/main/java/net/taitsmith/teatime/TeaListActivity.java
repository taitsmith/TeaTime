package net.taitsmith.teatime;

import android.support.v4.app.Fragment;

/**
 * Created by taits on 04-May-16.
 */
public class TeaListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new TeaListFragment();
    }

    //TODO find a way to selectively put teas into list
}
