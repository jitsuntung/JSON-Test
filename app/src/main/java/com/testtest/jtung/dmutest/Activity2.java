package com.testtest.jtung.dmutest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(Activity1.EXTRA_MESSAGE);

        TextView tv1 = (TextView) findViewById(R.id.myTV1);
        tv1.setText("JSon String: \n" + message);

        String data = "";

        try{
            JSONObject jsonRootObj = new JSONObject(message);

            String catID = jsonRootObj.getString("Category_ID");
            String eventDate = jsonRootObj.getString("EventDate");
            String desc = jsonRootObj.getString("Desc");
            String enteredBY = jsonRootObj.getString("Entered_By");
            String enteredDate = jsonRootObj.getString("Entered_Date");
            String minutes = jsonRootObj.getString("minutes");
            String organization = "";
            String results = "";
            String userName = jsonRootObj.getString("User_Name");

            if(jsonRootObj.isNull("Organization")){
                organization = "NULL";
            }
            else{
                organization = jsonRootObj.getString("Organization");
            }

            if(jsonRootObj.isNull("results")){
                results = "NULL";
            }
            else{
                results = jsonRootObj.getString("results");
            }

            data += "Parsed: \nCategoryID: " + catID + "\nEvent Date: " + eventDate +
                    "\nDescription: " + desc + "\nMinutes: " + minutes +
                    "\nResults: " + results + "\nUser Name: "+ userName+
                    "\nEntered By: " + enteredBY + "\nEntered Date: " + enteredDate +
                    "\nOrganization: " + organization;

        } catch (JSONException e) {
            e.printStackTrace();
        }
        TextView tv2 = (TextView) findViewById(R.id.myTV2);
        tv2.setText(data);

        /*// Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(14);
        textView.setText(message);

        // Set the text view as the activity layout
        setContentView(textView);*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
