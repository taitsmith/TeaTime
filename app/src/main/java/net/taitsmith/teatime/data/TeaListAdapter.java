package net.taitsmith.teatime.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import net.taitsmith.teatime.R;
import net.taitsmith.teatime.databinding.TeaListItemBinding;

import io.realm.RealmResults;

/**
 * In the original version this was all done by recyclerview, now it's a List view for better
 * incorporation into fragments.
 */

public class TeaListAdapter extends BaseAdapter {
    RealmResults<Tea> teaList;
    LayoutInflater inflater;
    TeaListItemBinding binding;

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
            binding = TeaListItemBinding.inflate(inflater,
                    parent,
                    false);
            view = binding.getRoot();
            holder = new ViewHolder();

            view.setTag(holder);
        }

        binding.setTea(teaList.get(position));

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
    }
}