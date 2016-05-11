package net.taitsmith.teatime;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Type extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
        Toast.makeText(this, "Choose a type", Toast.LENGTH_LONG).show();
    }

    public static final String EXTRA_LIST_ID =
            "net.taitsmith.teatime.switch_id";
    public static Intent newIntent(Context packageContext, String switchId) {
        Intent intent = new Intent(packageContext, TeaListActivity.class);
        intent.putExtra(EXTRA_LIST_ID, switchId);
        return intent;
    }

    public void teaByRegion(View view) {
        Intent intent = new Intent(this, Region.class);
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
    public void teaWhite(View view) {
        Intent intent = new Intent(this, TeaListActivity.class);
        intent.putExtra(EXTRA_LIST_ID, "white");
        startActivity(intent);
    }

}