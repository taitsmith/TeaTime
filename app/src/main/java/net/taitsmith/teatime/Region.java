package net.taitsmith.teatime;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Region extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region);
    }

    //holds the data to determine which list of teas is displayed by the recyclerview
    public static final String EXTRA_LIST_ID =
            "net.taitsmith.teatime.switch_id";
    public static Intent newIntent(Context packageContext, String switchId) {
        Intent intent = new Intent(packageContext, TeaListActivity.class);
        intent.putExtra(EXTRA_LIST_ID, switchId);
        return intent;
    }

    public void teaChina(View view) {
        Intent intent = new Intent(this, TeaListActivity.class);
        intent.putExtra(EXTRA_LIST_ID, "china");
        startActivity(intent);
    }

    protected void teaJapan(View view) {
        Intent intent = new Intent(this, TeaListActivity.class);
        intent.putExtra(EXTRA_LIST_ID, "japan");
        startActivity(intent);
    }

    protected void teaAfricaIndiaOther(View view) {
        Intent intent = new Intent(this, TeaListActivity.class);
        intent.putExtra(EXTRA_LIST_ID, "africa");
        startActivity(intent);
    }

    public void teaByType(View view) {
        Intent intent = new Intent(this, Type.class);
        startActivity(intent);
    }

}
