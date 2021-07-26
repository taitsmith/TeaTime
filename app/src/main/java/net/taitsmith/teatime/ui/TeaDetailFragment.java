package net.taitsmith.teatime.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import net.taitsmith.teatime.data.Tea;
import net.taitsmith.teatime.databinding.TeaFragmentBinding;

import io.realm.Realm;

import static net.taitsmith.teatime.activities.MainActivity.realmConfiguration;

public class TeaDetailFragment extends Fragment {
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
        TeaFragmentBinding binding = TeaFragmentBinding.inflate(inflater);
        binding.teaNameTextview.setText(tea.getName());
        binding.teaTypeTextView.setText(tea.getType());
        binding.teaRegionTextView.setText(tea.getRegion());
        binding.teaDirectionsTextView.setText(tea.getDirections());
        binding.teaDescriptionTextView.setText(tea.getDescription());

        return binding.getRoot();
    }

    public static void setTea(String s) {
        name = s;
    }
}