package com.hfad.listviewsandadapters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);


        //OnItemClickListener is a nested class with the AdapterView Class
        //ListView is a Subclass of AdapterView
        //view = reference to the view item that was clicked
        //position = position in the list view
        //row ID of the data
        //parent = view that was clicked (in this case the ListView)

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    Intent intent = new Intent(TopLevelActivity.this,DrinkCategoryActivity.class);

                    startActivity(intent);
                }

            }
        };

        //Add the listener to the List View
        ListView listView = (ListView)findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}
