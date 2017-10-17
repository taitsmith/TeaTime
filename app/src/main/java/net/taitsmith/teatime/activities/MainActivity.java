package net.taitsmith.teatime.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import net.taitsmith.teatime.R;
import net.taitsmith.teatime.data.Tea;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

import static net.taitsmith.teatime.data.TeaLab.populateRealm;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.region_button)
    Button regionButton;
    @BindView(R.id.type_button)
    Button typeButton;
    Realm realm;

    public static RealmConfiguration realmConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Realm.init(this);

        realmConfiguration = new RealmConfiguration.Builder()
                .name("teaRealm.realm")
                .build();

        realm = Realm.getInstance(realmConfiguration);

        if (realm.isEmpty()) {
            populateRealm(this, realm);
        }

    }

    @OnClick(R.id.region_button)
    public void viewByRegion(){
        Intent intent = new Intent(this, RegionActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.type_button)
    public void viewByType(){
        Intent intent = new Intent(this, TypeActivity.class);
        startActivity(intent);
    }

    //TODO add an info menu to display basic info about teas etc
}
