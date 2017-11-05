package com.igal.letstalk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class DiscussionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.discussion);

        ListView comments = (ListView) findViewById(R.id.discussion_comments_listview);
        DiscussionListAdapter commentsAdapter = new DiscussionListAdapter(this);
        comments.setAdapter(commentsAdapter);

        Intent intent = getIntent();
        TextView title = (TextView) findViewById(R.id.discussion_title);
        title.setText(intent.getExtras().getString("title", "no title entered"));
    }
}
