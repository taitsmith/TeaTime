package net.taitsmith.teatime.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import net.taitsmith.teatime.data.Tea;
import net.taitsmith.teatime.data.TeaListAdapter;
import net.taitsmith.teatime.databinding.TeaListFragmentBinding;

import io.realm.RealmResults;

/**
 *It's a fragment. It displays the recyclerview containing the list of teas
 * based on which group was selected in the previous activity.
 */

public class TeaListFragment extends Fragment{
    TeaListAdapter adapter;
    OnTeaSelectedListener listener;
    private static RealmResults<Tea> teaList;
    private TeaListFragmentBinding binding;

    public interface OnTeaSelectedListener{
        void onTeaSelected(int position);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            listener = (OnTeaSelectedListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() +
                    "Must implement OnTeaSelectedListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = TeaListFragmentBinding.inflate(inflater, container, false);

        adapter = new TeaListAdapter(getContext(), teaList);

        binding.teaListView.setAdapter(adapter);

        binding.teaListView.setOnItemClickListener((parent, view1, position, id) ->
                listener.onTeaSelected(position));

        return binding.getRoot();
    }

    public static void setTeaList(RealmResults<Tea> realmResults) {
        teaList = realmResults;
    }

}

