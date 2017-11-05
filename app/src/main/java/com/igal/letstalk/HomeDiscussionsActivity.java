package com.igal.letstalk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

public class HomeDiscussionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.discussion_list_screen);

//        options adapter
        GridView options = (GridView) findViewById(R.id.search_options_gridview);
        HomeOptionsAdapter homeOptionsAdapter = new HomeOptionsAdapter(this);
        options.setAdapter(homeOptionsAdapter);

//        discussions adapter
        ListView discussions = (ListView) findViewById(R.id.listview_discussion);
        HomeDiscussionsAdapter homeDiscussionsAdapter = new HomeDiscussionsAdapter(this);
        discussions.setAdapter(homeDiscussionsAdapter);

//        toolbar
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.discussion_list_toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.discussion_list_toolbar_items, menu);
        return true;
    }

    // here will be defined the actions for each button in the menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.discussion_list_action_add:
//                start an intent to post
                return true;

            case R.id.discussion_list_action_logout:
//                logout the user
                Intent logoutIntent = new Intent(this, LoginActivity.class);
                startActivity(logoutIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}
