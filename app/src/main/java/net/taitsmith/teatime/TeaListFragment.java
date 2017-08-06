package net.taitsmith.teatime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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


    //TODO update to switch
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

    //creates the list item view
    class TeaHolder extends RecyclerView.ViewHolder
        implements View.OnClickListener {
        @BindView(R.id.tea_name_text_view)
        TextView teaNameView;
        @BindView(R.id.tea_region_text_view)
        TextView teaRegionView;
        @BindView(R.id.tea_type_text_view)
        TextView teaTypeView;

        private Tea tea;

        public TeaHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            //because we want the items to be selectable
            itemView.setOnClickListener(this);

        }

        void bindTea(Tea tea) {
            this.tea = tea;
            teaNameView.setText(this.tea.getmName());
            teaTypeView.setText(this.tea.getmType());
            teaRegionView.setText(this.tea.getmRegion());
        }

        //handles click events, sends tea id to teaactivity to create proper display
        @Override
        public void onClick(View v) {
            Intent intent = TeaActivity.newIntent(getActivity(), tea.getmId());
            startActivity(intent);
        }
    }

    private class TeaAdapter extends RecyclerView.Adapter<TeaHolder> {
        private List<Tea> mTeas;

        public TeaAdapter(List<Tea> teas){
            mTeas = teas;
        }

        @Override
        public TeaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater
                    .inflate(R.layout.tea_list_item, parent, false);
            return new TeaHolder(view);
        }

        @Override
        public void onBindViewHolder(TeaHolder holder, int position) {
            Tea tea = mTeas.get(position);
            holder.bindTea(tea);
        }

        @Override
        public int getItemCount() {
            return mTeas.size();
        }
    }
}

