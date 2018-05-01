package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake>  {

//    /**
//     * Resource ID for the background color for this list of words
//     */
//    private int mColorResourceId;

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
        }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        magnitudeTextView.setText(currentEarthquake.getDefaultMagnitude());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView cityTextView = (TextView) listItemView.findViewById(R.id.city);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        cityTextView.setText(currentEarthquake.getDefaultCity());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView timestampTextView = (TextView) listItemView.findViewById(R.id.timestamp);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        timestampTextView.setText(currentEarthquake.getDefaultTime());

        // Return the whole list item layout (containing 3 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
