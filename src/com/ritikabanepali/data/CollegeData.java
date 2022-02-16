/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ritikabanepali.data;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 *
 * @author ritika
 */
public class CollegeData {
    
    public static List<College> Data = new ArrayList<>();
    public static List<String> NAMES = new ArrayList<>();
    static {
        Data.add(new College("University of Texas at Austin", 10824.0, 50950,
        true, true, "Austin", "Texas", "78713", " ", 32, 86));
        
        Data.add(new College("University of Texas at Arlington", 8624.0, 39714,
        true, true, "Arlington", "Texas", "76019", " ", 83, 51));
        
        Data.add(new College("Southern Methodist University", 58540.0, 11739,
        true, true, "Dallas", "Texas", "75205", " ", 53, 80));
        
        Data.add(new College("Rice University", 51107.0, 6740,
        true, true, "Houston", "Texas", "77005", " ", 11, 93));
        
        Data.add(new College("University of Houston", 9457.0, 45364,
        true, true, "Houston", "Texas", "77004", " ", 63, 59));
        
        Data.add(new College("Texas A&M", 12382.0, 72928,
        true, true, "College Station", "Texas", "77843", " ", 63, 82));
        
        Data.add(new College("University of North Texas", 11090.0, 40796,
        true, true, "Denton", "Texas", "76203", " ", 84, 64));
        
        Data.add(new College("University of Texas at Dallas", 13992.0, 29543,
        true, true, "Richardson", "Texas", "75080", " ", 79, 70));
        
        Data.add(new College("Columbia University", 61671.0, 31455,
        true, true, "New York City", "New York", "10027", " ", 7, 95));
        
        Data.add(new College("Georgetown University", 57928.0, 5365,
        true, true, "Washington DC", "Maryland", "20057", " ", 17, 95));
        
       
        for (College college: Data){
            NAMES.add(college.getName());
        }
        
        
    }
}
