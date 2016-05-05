package net.taitsmith.teatime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.Fragment;

public class MainActivity extends AppCompatActivity {
    private Button mRegionButton;
    private Button mTypeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void teaByType(View view) {
        Intent intent = new Intent(this, Type.class);
        startActivity(intent);
    }

    public void teaByRegion(View view) {
        Intent intent = new Intent(this, Region.class);
        startActivity(intent);
    }





}
