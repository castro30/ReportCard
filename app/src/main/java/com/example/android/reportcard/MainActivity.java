package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ReportCard> GradeArray= new ArrayList<ReportCard>();

        GradeArray.add(new ReportCard("History",95.0));
        GradeArray.add(new ReportCard("Math",95.3));
        GradeArray.add(new ReportCard("Chemistry",100.0));
        GradeArray.add(new ReportCard("Social Studies",88.9));
        GradeArray.add(new ReportCard("French",90.0));





//        // adapter knows how to create layout for each item in the list, using the
//        //simple_list_item_1.xml layout resource defined in the Android framework.
//        // This list item layout contains a single {@link TextView}, which the adapter will set to
//        // display a single object
        ReportCardAdapter adapter = new ReportCardAdapter(this,GradeArray);
//
//        // Find the {@link ListView} object in a view heirarchy of the {@link Activity}.
//        // There should be a {@link ListView} with the view ID called list, which is declared in
//        // activity_numbers.xml layout file
        ListView listView = (ListView) findViewById(R.id.list);
//
//        // Make the [@link ListView} use the {@link ArrayAdapter} we created above, so that the
//        // {@link ListView} will display array items for each word in the list of GradeArray.
//        // Do this by calling the set adapter method on the {@link ListView} object and pass in
//        // 1 argument which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}
