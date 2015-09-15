package com.testtest.jtung.dmutest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Activity1 extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.testtest.jtung.dmutest.MESSAGE";

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

        EditText catID = (EditText) findViewById(R.id.edit_catID);
        Integer cID = Integer.parseInt(catID.getText().toString());
        wd.setCategory_ID(cID);

        EditText EDesc = (EditText) findViewById(R.id.edit_Desc);
        String Desc = EDesc.getText().toString();
        wd.setDescription(Desc);

        EditText EEventDate = (EditText) findViewById(R.id.edit_EventDate);
        String strEventDate = EEventDate.getText().toString();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

        try{
            Date eventDate = format.parse(strEventDate);
            wd.setEventDate(eventDate);
        }
        catch(ParseException ex){
            ex.printStackTrace();
        }

        EditText eMinutes = (EditText) findViewById(R.id.edit_Minutes);
        Integer minutes = Integer.parseInt(eMinutes.getText().toString());
        wd.setMinutes(minutes);

        String message = JsonConvert.toJSon(wd);
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}
