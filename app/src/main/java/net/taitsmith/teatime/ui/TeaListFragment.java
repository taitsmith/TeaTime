package net.taitsmith.teatime.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import net.taitsmith.teatime.R;
import net.taitsmith.teatime.data.Tea;
import net.taitsmith.teatime.data.TeaListAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Realm;
import io.realm.RealmResults;

import static net.taitsmith.teatime.activities.MainActivity.realmConfiguration;

/**
 *It's a fragment. It displays the recyclerview containing the list of teas
 * based on which group was selected in the previous activity. It used to be
 * gross spaghetti code but a year later (summer 2017) it's been cleaned up
 * a bit to be less horrifying and make a bit more sense. Names have been changed
 * and Butterknife was added to reduce boilerplate (as they say).
 */

public class TeaListFragment extends Fragment{
    @BindView(R.id.tea_list_view)
    ListView teaRecyclerView;

    TeaListAdapter adapter;
    OnTeaSelectedListener listener;
    private static RealmResults<Tea> teaList;

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
        View view = inflater.inflate(R.layout.tea_list_fragment, container, false);
        ButterKnife.bind(this, view);

        adapter = new TeaListAdapter(getContext(), teaList);

        teaRecyclerView.setAdapter(adapter);

        teaRecyclerView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listener.onTeaSelected(position);
            }
        });

        return view;
    }

    public static void setTeaList(RealmResults<Tea> realmResults) {
        teaList = realmResults;
    }

}

