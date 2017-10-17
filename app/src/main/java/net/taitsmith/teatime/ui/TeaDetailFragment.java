package net.taitsmith.teatime.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.taitsmith.teatime.R;
import net.taitsmith.teatime.data.Tea;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Realm;

import static net.taitsmith.teatime.activities.MainActivity.realmConfiguration;

/**
 * Created by taits on 03-May-16
 */
public class TeaDetailFragment extends android.support.v4.app.Fragment {
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

    private static String name;
    private Tea tea;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Realm realm = Realm.getInstance(realmConfiguration);

        tea = realm.where(Tea.class)
                .equalTo("name", name)
                .findFirst();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tea_fragment, container, false);
        ButterKnife.bind(this, view);

        teaName.setText(tea.getName());
        teaType.setText(tea.getType());
        teaRegion.setText(tea.getRegion());
        teaDirections.setText(tea.getDirections());
        teaDescription.setText(tea.getDescription());

        return view;
    }

    public static void setTea(String s) {
        name = s;
    }
}