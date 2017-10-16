package net.taitsmith.teatime;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.taitsmith.teatime.data.Tea;

import java.util.UUID;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by taits on 03-May-16
 */
public class TeaFragment extends android.support.v4.app.Fragment {
    private Tea mTea;
    @BindView(R.id.tea_name_textview)
    TextView teaName;
    @BindView(R.id.tea_description_text_view)
    TextView teaDescription;
    @BindView(R.id.tea_type_text_view)
    TextView teaType;
    @BindView(R.id.tea_region_text_view)
    TextView teaRegion;
    @BindView(R.id.tea_directions_text_view)
    TextView teaDirections;

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
        View view = inflater.inflate(R.layout.tea_fragment, container, false);
        ButterKnife.bind(this, view);

        teaName.setText(mTea.getName());
        teaDescription.setMovementMethod(new ScrollingMovementMethod());
        teaDescription.setText(mTea.getmDesc());
        teaType.setText(mTea.getType());
        teaRegion.setText(mTea.getRegion());
        teaDirections.setText(mTea.getDirections());

        return view;
    }
}