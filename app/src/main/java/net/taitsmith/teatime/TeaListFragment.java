package net.taitsmith.teatime;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.taitsmith.teatime.data.Tea;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 *It's a fragment. It displays the recyclerview containing the list of teas
 * based on which group was selected in the previous activity. It used to be
 * gross spaghetti code but a year later (summer 2017) it's been cleaned up
 * a bit to be less horrifying and make a bit more sense. Names have been changed
 * and Butterknife was added to reduce boilerplate (as they say).
 */

public class TeaListFragment extends Fragment{
    private TeaAdapter teaAdapter;
    List<Tea> teas;

    @BindView(R.id.tea_recycler_view)
    RecyclerView teaRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tea_list_fragment, container, false);
        ButterKnife.bind(this, view);

        teaRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private void updateUI() {
        String teaId = (String) getActivity().getIntent()
                .getSerializableExtra(RegionActivity.EXTRA_LIST_ID);
        TeaLab teaLab = TeaLab.get(getActivity());

        //can you believe this was originally a GIANT
        //if else if block? it was gross.
        switch (teaId) {
            case "china":
                teas = teaLab.getmchinaTeas();
                break;
            case "black":
                teas = teaLab.getmBlackTeas();
                break;
            case "japan":
                teas = teaLab.getmchinaTeas();
                break;
            case "green":
                teas = teaLab.getmGreenTeas();
                break;
            case "africa":
                teas = teaLab.getmAfricaTeas();
                break;
            case "allTeas":
                teas = teaLab.getmTeas();
                break;
            case "white":
                teas = teaLab.getmWhiteTeas();
                break;
            default:
                throw new UnsupportedOperationException("Unknown tea typ");
        }

        teaAdapter = new TeaAdapter(teas);
        teaRecyclerView.setAdapter(teaAdapter);
    }
}

