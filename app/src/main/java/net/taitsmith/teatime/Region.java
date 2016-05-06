package net.taitsmith.teatime;

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
        Toast.makeText(this, "Choose a region", Toast.LENGTH_LONG).show();
    }

    protected void teaChina(View view) {
        Intent intent = new Intent(this, ChinaTeaListActivity.class);
        startActivity(intent);
    }

    //TODO add other region methods

    public void mainMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void teaByType(View view) {
        Intent intent = new Intent(this, Type.class);
        startActivity(intent);
    }
}
