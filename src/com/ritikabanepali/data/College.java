/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ritikabanepali.data;

/**
 *
 * @author ritika
 */
public class College {
    
    private String name;
    private double tuition;
    private int size;
    private boolean hasBachelors;
    private boolean hasMasters;
    private String city;
    private String state;
    private String zipcode;
    private String logoURL;
    private int acceptanceRate;
    private int gradRate;
    
    //this is a constructor
    public College(
        String name,
        double tuition,
        int size,
        boolean hasBachelors,
        boolean hasMasters,
        String city,
        String state,
        String zipcode,
        String logoURL,
        int acceptanceRate,
        int gradRate) 
    {
        this.name = name;
        this.tuition = tuition;
        this.size = size;
        this.hasBachelors = hasBachelors;
        this.hasMasters = hasMasters;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.logoURL = logoURL;
        this.acceptanceRate = acceptanceRate;
        this.gradRate = gradRate;
        
    }
    
    public String getCity(){
           return city;
       }
    public String getName(){
           return name;
       }
    public double getTuition(){
           return tuition;
       }
    public int getSize(){
           return size;
       }
    public boolean getHasBachelors(){
           return hasBachelors;
       }
    public boolean getHasMasters(){
           return hasMasters;
       }
    public String getState(){
           return state;
       }
    public String getLogoURL(){
           return logoURL;
       }
    public int getAcceptanceRate(){
           return acceptanceRate;
       }
    public int getGradRate(){
           return gradRate;
    }
    public String getZipcode(){
        return zipcode;
    }
}
