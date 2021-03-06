package com.testtest.jtung.dmutest;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Activity1 extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.testtest.jtung.dmutest.MESSAGE";
    private static final String TAG = "JSON";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity1, menu);
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

    public void convertToJSon(View view){
        Intent intent = new Intent(this, Activity2.class);
        WellnessDetails wd = new WellnessDetails();

        Date currentDate = new Date();
        String myDF = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(myDF, Locale.US);
        String today = sdf.format(currentDate);
        try {
            currentDate = sdf.parse(today);
            wd.setEntered_Date(currentDate);
        }
        catch(ParseException ex){
            ex.printStackTrace();
        }

        wd.setResults(null);
        wd.setUser_Name("jtung");
        wd.setEntered_By("jtung");
        wd.setOrganization(null);

        EditText catID = (EditText) findViewById(R.id.edit_catID);
        Integer cID = Integer.parseInt(catID.getText().toString());
        wd.setCategory_ID(cID);

        EditText EDesc = (EditText) findViewById(R.id.edit_Desc);
        String Desc = EDesc.getText().toString();
        wd.setDescription(Desc);

        EditText EEventDate = (EditText) findViewById(R.id.edit_EventDate);
        String strEventDate = EEventDate.getText().toString();

        try{
            Date eventDate = sdf.parse(strEventDate);
            wd.setEventDate(eventDate);
        }
        catch(ParseException ex){
            ex.printStackTrace();
        }

        EditText eMinutes = (EditText) findViewById(R.id.edit_Minutes);
        Integer minutes = Integer.parseInt(eMinutes.getText().toString());
        wd.setMinutes(minutes);

        String message = JsonConvert.toJSon(wd);
        Log.v(TAG, message);
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}
