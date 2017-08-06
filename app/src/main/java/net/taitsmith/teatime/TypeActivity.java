package net.taitsmith.teatime;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
    }

    public static final String EXTRA_LIST_ID =
            "net.taitsmith.teatime.switch_id";
    public static Intent newIntent(Context packageContext, String switchId) {
        Intent intent = new Intent(packageContext, TeaListActivity.class);
        intent.putExtra(EXTRA_LIST_ID, switchId);
        return intent;
    }

    public void teaByRegion(View view) {
        Intent intent = new Intent(this, RegionActivity.class);
        startActivity(intent);
    }

    public void teaBlack(View view) {
        Intent intent = new Intent(this, TeaListActivity.class);
        intent.putExtra(EXTRA_LIST_ID, "black");
        startActivity(intent);
        }

    public void teaGreen(View view) {
        Intent intent = new Intent(this, TeaListActivity.class);
        intent.putExtra(EXTRA_LIST_ID, "green");
        startActivity(intent);
    }

    //to save space, now includes oolong
    public void teaWhite(View view) {
        Intent intent = new Intent(this, TeaListActivity.class);
        intent.putExtra(EXTRA_LIST_ID, "white");
        startActivity(intent);
    }

}