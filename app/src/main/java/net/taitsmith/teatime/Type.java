package net.taitsmith.teatime;

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
    public void mainMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void teaByRegion(View view) {
        Intent intent = new Intent(this, Region.class);
        startActivity(intent);
    }
}
