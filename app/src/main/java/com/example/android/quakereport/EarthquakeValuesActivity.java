package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeValuesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        final ArrayList<Earthquake> earthquakes = new ArrayList<Earthquake>();
        earthquakes.add(new Earthquake("1.1", "San Francisco", "2018/02/11"));
        earthquakes.add(new Earthquake("9.2", "Pasadena", "2017/11/12"));
        earthquakes.add(new Earthquake("3.4", "Los Angeles", "2017/11/12"));
        earthquakes.add(new Earthquake("2.1", "Toronto", "2017/11/12"));
        earthquakes.add(new Earthquake("5.4", "Carachi", "2017/11/12"));
        earthquakes.add(new Earthquake("6.7", "Pantelupa", "2017/11/12"));
        earthquakes.add(new Earthquake("1.2", "Amsterdam", "2017/11/12"));
        earthquakes.add(new Earthquake("4.3", "Mexico City", "2017/11/12"));
        earthquakes.add(new Earthquake("9.9", "San Francisco", "2017/11/12"));
        earthquakes.add(new Earthquake("7.0", "Los Santos", "2017/11/12"));

        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}