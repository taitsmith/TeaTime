package net.taitsmith.teatime.activities;

import android.content.Intent;
import android.content.SharedPreferences;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import net.taitsmith.teatime.R;
import net.taitsmith.teatime.data.Tea;
import net.taitsmith.teatime.data.Utils;
import net.taitsmith.teatime.databinding.ActivityMainBinding;
import net.taitsmith.teatime.ui.TeaDetailFragment;
import net.taitsmith.teatime.ui.TeaListFragment;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

import static net.taitsmith.teatime.data.TeaBrewer.populateRealm;
import static net.taitsmith.teatime.ui.TeaDetailFragment.setTea;
import static net.taitsmith.teatime.ui.TeaListFragment.setTeaList;

public class MainActivity extends AppCompatActivity implements
        TeaListFragment.OnTeaSelectedListener{

    private Realm realm;
    private String sortBy;
    private String selection;
    private int position;
    private boolean isTwoPane;
    private RealmResults<Tea> teaList;
    private FragmentManager manager;
    private ActivityMainBinding binding;

    public static RealmConfiguration realmConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setSupportActionBar(binding.toolbar1.toolbar);

        if (savedInstanceState == null) {
            sortBy = "all";
            selection = null;
            position = 0;
        } else {
            sortBy = savedInstanceState.getString("SORT_ORDER");
            selection = savedInstanceState.getString("SORT_SELECTION");
            position = savedInstanceState.getInt("POSITION");
        }

        Realm.init(this);

        isTwoPane = findViewById(R.id.tea_detail_fragment) != null;

        manager = getSupportFragmentManager();

        realmConfiguration = new RealmConfiguration.Builder()
                .name("teaRealm.realm")
                .build();

        realm = Realm.getInstance(realmConfiguration);

        teaList = Utils.teaList(sortBy, selection);

        if (realm.isEmpty()) {
            populateRealm(this, realm);
        }

        checkPrefs();
        setUi();
    }

    private void setUi() {
        if (isTwoPane) {
            TeaListFragment listFragment = new TeaListFragment();
            TeaDetailFragment teaDetailFragment = new TeaDetailFragment();
            setTeaList(teaList);
            setTea(teaList.get(position).getName());

            manager.beginTransaction()
                    .add(R.id.tea_list_fragment, listFragment)
                    .add(R.id.tea_detail_fragment, teaDetailFragment)
                    .commit();
        } else {
            TeaListFragment teaListFragment = new TeaListFragment();
            setTeaList(teaList);
            manager.beginTransaction()
                    .add(R.id.tea_list_fragment, teaListFragment)
                    .commit();
        }
    }

    @Override
    public void onTeaSelected(int position) {
        this.position = position;

        if (isTwoPane) {
            TeaDetailFragment fragment = new TeaDetailFragment();
            setTea(teaList.get(position).getName());

            manager.beginTransaction()
                    .add(R.id.tea_detail_fragment, fragment)
                    .commit();
        } else {
            Intent intent = new Intent(this, TeaDetailActivity.class);
            intent.putExtra("TEA_NAME", teaList.get(position).getName());
            startActivity(intent);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("SORT_ORDER", sortBy);
        outState.putInt("POSITION", position);

        if (selection != null) {
            outState.putString("SORT_SELECTION", selection);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sort_china:
                sortBy = "region";
                selection = "China";
                break;
            case R.id.sort_japan:
                sortBy = "region";
                selection = "Japan";
                break;
            case R.id.sort_other_region:
                sortBy = "region";
                selection = "other";
                break;
            case R.id.sort_black:
                sortBy = "type";
                selection = "Black Tea";
                break;
            case R.id.sort_green:
                sortBy = "type";
                selection = "Green Tea";
                break;
            case R.id.sort_other_type:
                sortBy = "type";
                selection = "other";
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        teaList = Utils.teaList(sortBy, selection);
        setUi();
        return true;
    }

    private void checkPrefs() {
        SharedPreferences preferences = getSharedPreferences("SHARED_PREFS", 0);
        if (!preferences.contains("SHOW_EXP") || (preferences.getBoolean("SHOW_EXP", false))) {
            Utils.showExplanation(this);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_menu, menu);
        return true;
    }
}
