package com.igal.letstalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

public class HomeDiscussions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.discussion_list_screen);

        GridView options = (GridView) findViewById(R.id.search_options_gridview);
        HomeOptionsAdapter homeOptionsAdapter = new HomeOptionsAdapter(this);

        options.setAdapter(homeOptionsAdapter);

        ListView discussions = (ListView) findViewById(R.id.listview_discussion);
        HomeDiscussionsAdapter homeDiscussionsAdapter = new HomeDiscussionsAdapter(this);

        discussions.setAdapter(homeDiscussionsAdapter);
    }
}
