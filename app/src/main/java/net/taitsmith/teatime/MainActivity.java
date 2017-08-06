package net.taitsmith.teatime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.region_button)
    Button regionButton;
    @BindView(R.id.type_button)
    Button typeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
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
