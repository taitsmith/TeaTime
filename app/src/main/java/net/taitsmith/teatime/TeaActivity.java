package net.taitsmith.teatime;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

/**
 * Created by taits on 07-May-16. Why did I not make notes?
 */
public class TeaActivity extends SingleFragmentActivity {

    public static final String EXTRA_TEA_ID =
            "net.taitsmith.teatime.tea_id";
    public static Intent newIntent(Context packageContext, UUID teaId) {
        Intent intent = new Intent(packageContext, TeaActivity.class);
        intent.putExtra(EXTRA_TEA_ID, teaId);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        return new TeaFragment();
    }
}
