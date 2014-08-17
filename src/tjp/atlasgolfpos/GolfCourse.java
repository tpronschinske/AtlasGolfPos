/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tjp.atlasgolfpos;

import java.util.Date;

/**
 *
 * @author Travis
 */
public class GolfCourse {
    
    private String courseName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private Date yearEstablished;
    private String numberHoles;
    private String setsOfTees;

    public void GolfCourse(){
        
    }
    
    public GolfCourse(String courseName, String address, String city, String state, String zip, Date yearEstablished, String numberHoles, String setsOfTees) {
        this.courseName = courseName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.yearEstablished = yearEstablished;
        this.numberHoles = numberHoles;
        this.setsOfTees = setsOfTees;
    }

     
    
    public final Date getYearEstablished() {
        return yearEstablished;
    }

    public final void setYearEstablished(Date yearEstablished)throws IllegalArgumentException {
        this.yearEstablished = yearEstablished;
    }
    
    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName)throws IllegalArgumentException {
        if(courseName == null || courseName.length() == 0){
            throw new IllegalArgumentException("Course Name Cant Be Null");
        }
        this.courseName = courseName;
    }

    public final String getAddress() {
        return address;
    }

    public final void setAddress(String address) throws IllegalArgumentException{
        if(address == null || address.length() == 0){
            throw new IllegalArgumentException("Course Address Cant Be Null");
        }
        this.address = address;
    }

    public final String getCity() {
        return city;
    }

    public final void setCity(String city)throws IllegalArgumentException {
        if(city == null || city.length() == 0){
            throw new IllegalArgumentException("Course City Cant Be Null");
        }
        this.city = city;
    }

    public final String getState() {
        return state;
    }

    public final void setState(String state)throws IllegalArgumentException {
        if(state == null || state.length() == 0){
            throw new IllegalArgumentException("Course State Cant Be Null");
        }
        this.state = state;
    }

    public final String getZip() {
        return zip;
    }

    public final void setZip(String zip)throws IllegalArgumentException {
        if(zip == null || zip.length() == 0){
            throw new IllegalArgumentException("Course Zip Cant Be Null");
        }
        this.zip = zip;
    }

    public final String getNumberHoles() {
        return numberHoles;
    }

    public final void setNumberHoles(String numberHoles)throws IllegalArgumentException {
        if(numberHoles == null || numberHoles.length() == 0){
            throw new IllegalArgumentException("Course Number Of Holes Cant Be Null");
        }
        this.numberHoles = numberHoles;
    }

    public final String getSetsOfTees() {
        return setsOfTees;
    }

    public final void setSetsOfTees(String setsOfTees)throws IllegalArgumentException {
        if(setsOfTees == null || setsOfTees.length() == 0){
            throw new IllegalArgumentException("Sets Of Tees Cant Be Null");
        }
        this.setsOfTees = setsOfTees;
    }
    
    
    
    
    
    
}
