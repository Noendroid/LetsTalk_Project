package com.igal.letstalk;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by igalh on 31-Oct-17.
 */

public class HomeDiscussionsAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private Context context;

    public HomeDiscussionsAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public int getCount() {
        return 15;
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
        view = inflater.inflate(R.layout.discussion_item, null);
        TextView title = view.findViewById(R.id.discussion_item_title);
        TextView content = view.findViewById(R.id.discussion_item_content);
        TextView reply = view.findViewById(R.id.discussion_item_reply);
        ImageView reply_icon = view.findViewById(R.id.discussion_item_reply_icon);

        View.OnClickListener redirectToDiscussion = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent discussionRedirect = new Intent(context, DiscussionActivity.class);
                discussionRedirect.putExtra("title", "title to send");
                context.startActivity(discussionRedirect);
            }
        };

        View.OnClickListener redirectToReply = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent discussionRedirect = new Intent(context, ReplyActivity.class);
                discussionRedirect.putExtra("title", "title to send");
                context.startActivity(discussionRedirect);
            }
        };

        title.setOnClickListener(redirectToDiscussion);
        content.setOnClickListener(redirectToDiscussion);

        reply.setOnClickListener(redirectToReply);
        reply_icon.setOnClickListener(redirectToReply);

        return view;
    }
}
