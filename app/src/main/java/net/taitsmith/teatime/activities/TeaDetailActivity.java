package net.taitsmith.teatime.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import net.taitsmith.teatime.R;
import net.taitsmith.teatime.data.Tea;
import net.taitsmith.teatime.ui.TeaDetailFragment;

import io.realm.Realm;

import static net.taitsmith.teatime.activities.MainActivity.realmConfiguration;
import static net.taitsmith.teatime.ui.TeaDetailFragment.setTea;

/**
 * For phone mode only, displays a {@link TeaDetailFragment}
 */
public class TeaDetailActivity extends AppCompatActivity {
    private String name;
    private Tea tea;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tea_detail);

        Realm realm = Realm.getInstance(realmConfiguration);

        if (getIntent().hasExtra("TEA_NAME")) {
            name = getIntent().getStringExtra("TEA_NAME");
        }

        if (savedInstanceState != null) {
            name = savedInstanceState.getString("TEA_NAME");
        }

        tea = realm.where(Tea.class)
                .equalTo("name", name)
                .findFirst();

        TeaDetailFragment teaDetailFragment = new TeaDetailFragment();
        FragmentManager manager = getSupportFragmentManager();
        setTea(name);

        manager.beginTransaction()
                .add(R.id.tea_detail_fragment, teaDetailFragment)
                .commit();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("TEA_NAME", name);
    }
}
