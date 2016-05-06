package net.taitsmith.teatime;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by taits on 02-May-16.
 * Does all the work of finding and populating
 * the recyclerview fragment. Can't be actively
 * called because it's a fragment, calls must go
 * through BlackTeaListActivity.
 */

//TODO make this BlackTeaListFragment by changing List<Tea> tea to .getblackTeas
public class GreenTeaListFragment extends Fragment{
    private RecyclerView mTeaRecyclerView; //recycler to create list
    private TeaAdapter mAdapter; /*adapter takes from array via holder
                                  *and puts into recyler view to fill out
                                  *list items
                                  */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tea_list_fragment, container, false);

        mTeaRecyclerView = (RecyclerView) view.findViewById(R.id.tea_recycler_view);
        mTeaRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private void updateUI() {
        TeaLab teaLab = TeaLab.get(getActivity());
        List<Tea> teas = teaLab.getmGreenTeas();


        mAdapter = new TeaAdapter(teas);
        mTeaRecyclerView.setAdapter(mAdapter);

        //TODO selectively populate tealist by List<> methods?
    }

    private class TeaHolder extends RecyclerView.ViewHolder
        implements View.OnClickListener {
        private TextView mTeaNameView, mTeaTypeView, mTeaRegionView;
        private Tea mTea;

        public TeaHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            mTeaNameView = (TextView)
                    itemView.findViewById(R.id.tea_name_text_view);
            mTeaRegionView = (TextView)
                    itemView.findViewById(R.id.tea_region_text_view);
            mTeaTypeView = (TextView)
                    itemView.findViewById(R.id.tea_type_text_view);
        }

        public void bindTea(Tea tea) {
            mTea = tea;
            mTeaNameView.setText(mTea.getmName());
            mTeaTypeView.setText(mTea.getmType());
            mTeaRegionView.setText(mTea.getmRegion());
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(
                    getContext(),
                    "This doesn't do anything ",
                    Toast.LENGTH_LONG).show();
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

