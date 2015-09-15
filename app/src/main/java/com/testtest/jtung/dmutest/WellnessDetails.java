package com.testtest.jtung.dmutest;

import java.net.Inet4Address;
import java.util.Date;

/**
 * Created by jtung on 9/15/2015.
 */
public class WellnessDetails {

    private Integer category_ID;
    private Date eventDate;
    private String description;
    private String entered_By;
    private Date entered_Date;
    private Integer minutes;
    private String organization;
    private String results;
    private String user_Name;

    public Integer getCategory_ID(){
        return category_ID;
    }

    public void setCategory_ID(Integer CID){
        this.category_ID = CID;
    }

    public Date getEventDate(){
        return eventDate;
    }

    public void setEventDate(Date date){
        this.eventDate = date;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String desc){
        this.description = desc;
    }

    public String getEntered_By(){
        return entered_By;
    }

    public void setEntered_By(String enteredBy){
        this.entered_By = enteredBy;
    }

    public Date getEntered_Date(){
        return entered_Date;
    }

    public void setEntered_Date(Date date){
        this.entered_Date = date;
    }

    public Integer getMinutes(){
        return minutes;
    }

    public void setMinutes(Integer min){
        this.minutes = min;
    }

    public String getOrganization(){
        return organization;
    }

    public void setOrganization(String org) {
        this.organization = org;
    }

    public String getResults(){
        return results;
    }

    public void setResults(String result){
        this.results = result;
    }

    public String getUser_Name(){
        return user_Name;
    }

    public void setUser_Name(String userName){
        this.user_Name = userName;
    }
}
