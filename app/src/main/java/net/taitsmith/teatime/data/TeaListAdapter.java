package net.taitsmith.teatime.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import net.taitsmith.teatime.R;

import io.realm.RealmResults;

/**
 * In the original version this was all done by recyclerview, now it's a List view for better
 * incorporation into fragments.
 */

public class TeaListAdapter extends BaseAdapter {
    private RealmResults<Tea> teaList;
    private LayoutInflater inflater;

    public TeaListAdapter(Context context, RealmResults<Tea> teaList){
        this.teaList = teaList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return teaList.size();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;

        if (view == null) {
            view = inflater.inflate(R.layout.tea_list_item, null);
            holder = new ViewHolder();

            holder.teaNameView = view.findViewById(R.id.tea_name_text_view);
            holder.teaRegionView = view.findViewById(R.id.tea_region_text_view);
            holder.teaTypeView = view.findViewById(R.id.tea_type_text_view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        Tea tea = teaList.get(position);

        holder.teaNameView.setText(tea.getName());
        holder.teaRegionView.setText(tea.getRegion());
        holder.teaTypeView.setText(tea.getType());

        return view;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    private class ViewHolder {
        TextView teaNameView;
        TextView teaRegionView;
        TextView teaTypeView;
    }
}