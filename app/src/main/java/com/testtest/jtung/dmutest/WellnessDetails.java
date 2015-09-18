package com.testtest.jtung.dmutest;

import java.net.Inet4Address;
import java.util.Date;

/**
 * Created by jtung on 9/15/2015.
 */
public class WellnessDetails {

    private Integer Category_ID;
    private Date EventDate;
    private String Desc;
    private String Entered_By;
    private Date Entered_Date;
    private Integer minutes;
    private String Organization;
    private String results;
    private String User_Name;

    public Integer getCategory_ID(){
        return Category_ID;
    }

    public void setCategory_ID(Integer CID){
        this.Category_ID = CID;
    }

    public Date getEventDate(){
        return EventDate;
    }

    public void setEventDate(Date date){
        this.EventDate = date;
    }

    public String getDescription(){
        return Desc;
    }

    public void setDescription(String desc){
        this.Desc = desc;
    }

    public String getEntered_By(){
        return Entered_By;
    }

    public void setEntered_By(String enteredBy){
        this.Entered_By = enteredBy;
    }

    public Date getEntered_Date(){
        return Entered_Date;
    }

    public void setEntered_Date(Date date){
        this.Entered_Date = date;
    }

    public Integer getMinutes(){
        return minutes;
    }

    public void setMinutes(Integer min){
        this.minutes = min;
    }

    public String getOrganization(){
        return Organization;
    }

    public void setOrganization(String org) {
        this.Organization = org;
    }

    public String getResults(){
        return results;
    }

    public void setResults(String result){
        this.results = result;
    }

    public String getUser_Name(){
        return User_Name;
    }

    public void setUser_Name(String userName){
        this.User_Name = userName;
    }
}
