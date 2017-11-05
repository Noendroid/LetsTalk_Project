package com.igal.letstalk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by igalh on 02-Nov-17.
 */

public class DiscussionListAdapter extends BaseAdapter {
    LayoutInflater inflater;

    public DiscussionListAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.comment_item, null);
        TextView title = view.findViewById(R.id.comment_item_username);
        title.setText("position " + i);
        return view;
    }
}
