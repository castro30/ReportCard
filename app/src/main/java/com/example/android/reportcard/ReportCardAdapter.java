package com.example.android.reportcard;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by castr_000 on 8/21/2017.
 */

public class ReportCardAdapter extends ArrayAdapter<ReportCard>{

    private static final String LOG_TAG = ReportCard.class.getSimpleName();

    /**

     * This is our own custom constructor (it doesn't mirror a superclass constructor).

     * The context is used to inflate the layout file, and the list is the data we want

     * to populate into the lists.

     *

     * @param context        The current context. Used to inflate the layout file.

     * @param grades A List of Words objects to display in a list

     */

    public ReportCardAdapter(Activity context, ArrayList<ReportCard> grades) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.

        // the second argument is used when the ArrayAdapter is populating a single TextView.

        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not

        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0, grades);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent,false);
        }

        // Get the {@link Word} object located at this position in the list
        ReportCard currentSubject = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID english_text_view
        TextView subjectTextName = (TextView) listItemView.findViewById(R.id.subject_text_view);
        // Get the english name from the current word object
        // and set this as the TextView
        subjectTextName.setText(currentSubject.getSubject());

        // Get the {@link Word} object located at this position in the list
        ReportCard currentGrade = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView gradeTextName = (TextView) listItemView.findViewById(R.id.grade_text_view);
        // Get the miwok name from the current word object
        // and set this as the TextView



        gradeTextName.setText(currentGrade.toString());

        return listItemView;
    }
}
