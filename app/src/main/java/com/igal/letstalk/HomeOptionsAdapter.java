package com.igal.letstalk;

import android.content.Context;
import android.media.Image;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by igalh on 31-Oct-17.
 */

public class HomeOptionsAdapter extends BaseAdapter {

    private LayoutInflater inflater;

    public HomeOptionsAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 3;
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
        view = inflater.inflate(R.layout.search_item, null);
        ImageView imageView = view.findViewById(R.id.search_item_icon);
        TextView text = view.findViewById(R.id.search_item_name);
        switch (i) {
            case 0:
                imageView.setImageResource(R.drawable.hot);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    text.setTextAppearance(R.style.search_hot);
                }
                text.setText(R.string.hot);
                break;

            case 1:
                imageView.setImageResource(R.drawable.top_rated);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    text.setTextAppearance(R.style.search_top_rated);
                }
                text.setText(R.string.rated);
                break;
            case 2:
                imageView.setImageResource(R.drawable.most_discussed);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    text.setTextAppearance(R.style.search_most_discussed);
                }
                text.setText(R.string.discussed);
                break;
            default:
                break;
        }
        return view;
    }
}
