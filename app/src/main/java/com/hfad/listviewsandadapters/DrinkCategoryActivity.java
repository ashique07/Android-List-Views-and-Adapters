package com.hfad.listviewsandadapters;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                //Layout resource specifies how to display each item in the Array
                Drink.drinks
                //The Array

        );

        //The ArrayAdapter takes each item in the Array (The Drink Objects) and converts it to a String using toString() and puts each result in text view

        ListView listView = getListView();
        listView.setAdapter(listAdapter);


    }

    public void onListItemClick(ListView listView, View itemView, int position, long id)
    {
        Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
        intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int)id);
        startActivity(intent);
    }
}
