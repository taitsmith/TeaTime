package net.taitsmith.teatime;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.UUID;

/**
 * Created by taits on 03-May-16.
 */
public class TeaFragment extends android.support.v4.app.Fragment {
    private Tea mTea;
    private TextView teaName, teaType, teaRegion, teaDirections, teaDescription;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //gets id from intent extra to display the selected Tea object
        UUID teaId = (UUID) getActivity().getIntent()
                .getSerializableExtra(TeaActivity.EXTRA_TEA_ID);
        mTea = TeaLab.get(getActivity()).getTeas(teaId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tea_fragment, container, false);

        //sets tea name in proper textview
        teaName = (TextView)v.findViewById(R.id.tea_name_textview);
        teaName.setText(mTea.getmName());

        teaDescription = (TextView)v.findViewById(R.id.tea_description_text_view);

        //in case the screen is to small to display all the text
        teaDescription.setMovementMethod(new ScrollingMovementMethod());

        //displays dummy text in case something goes wrong
        if(mTea.getmDesc() == 0) {
            mTea.setmDesc(R.string.tea_desc);
        } else
        teaDescription.setText(mTea.getmDesc());

        //finds and sets tea type (black, white etc) in proper text view
        teaType = (TextView)v.findViewById(R.id.tea_type_text_view);
        teaType.setText(mTea.getmType());


        //finds and sets region (africa, china etc) in proper text view
        teaRegion = (TextView)v.findViewById(R.id.tea_region_text_view);
        teaRegion.setText(mTea.getmRegion());

        teaDirections = (TextView)v.findViewById(R.id.tea_directions_text_view);

        //failsafe in case something goes wrong, displays dummy text
        if(mTea.getmDirections() == null) { //more dummy text
            teaDirections.setText("Oops. Nothing to see here");
        } else teaDirections.setText(mTea.getmDirections());


        return v;

    }
}