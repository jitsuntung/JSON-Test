package com.testtest.jtung.dmutest;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by jtung on 9/15/2015.
 */
public class JsonConvert {

    public static String toJSon(WellnessDetails myWD){
        try{
            JSONObject jsonObj = new JSONObject();

            jsonObj.put("Category_ID", myWD.getCategory_ID());
            jsonObj.put("EventDate", myWD.getEventDate());
            jsonObj.put("Desc", myWD.getDescription());
            jsonObj.put("Entered_By", myWD.getEntered_By());
            jsonObj.put("Entered_Date", myWD.getEntered_Date());
            jsonObj.put("minutes", myWD.getMinutes());
            jsonObj.put("Organization", myWD.getOrganization());
            jsonObj.put("results", myWD.getResults());
            jsonObj.put("User_Name", myWD.getUser_Name());

            return jsonObj.toString();
        }

        catch(JSONException ex)
        {
            ex.printStackTrace();
        }

        return null;
    }
}
