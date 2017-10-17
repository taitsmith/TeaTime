package net.taitsmith.teatime.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import net.taitsmith.teatime.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegionActivity extends AppCompatActivity {
    @BindView(R.id.china_button)
    Button chinaButton;
    @BindView(R.id.africa_button)
    Button africaButton;
    @BindView(R.id.japan_button)
    Button japanButton;
    @BindView(R.id.type_button)
    Button typeButton;

    Intent intent;

    //holds the data to determine which list of teas is displayed by the recyclerview
    public static final String EXTRA_LIST_ID =
            "net.taitsmith.teatime.switch_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region);
        ButterKnife.bind(this);

        intent = new Intent(this, TeaListActivity.class);
    }

    @OnClick(R.id.china_button)
    public void viewChinaTeas(){
        intent.putExtra(EXTRA_LIST_ID, "china");
        startActivity(intent);
    }

    @OnClick(R.id.africa_button)
    public void viewAfricaTeas(){
        intent.putExtra(EXTRA_LIST_ID, "africa");
        startActivity(intent);
    }

    @OnClick(R.id.japan_button)
    public void viewJapanTeas(){
        intent.putExtra(EXTRA_LIST_ID, "japan");
        startActivity(intent);
    }

    @OnClick(R.id.type_button)
    public void viewTeasByType(){
        Intent viewTypeIntent = new Intent(this, TypeActivity.class);
        startActivity(viewTypeIntent);
    }

}
