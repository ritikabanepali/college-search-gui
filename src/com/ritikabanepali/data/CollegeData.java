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
        true, true, "Austin", "Texas", "78713", "./pics/austinLogo.png", 32, 86, 
        "https://www.utexas.edu/"));
        
        Data.add(new College("University of Texas at Arlington", 8624.0, 39714,
        true, true, "Arlington", "Texas", "76019", "./pics/arlingtonLogo.png", 83, 51, 
        "https://www.uta.edu/"));
        
        Data.add(new College("Southern Methodist University", 58540.0, 11739,
        true, true, "Dallas", "Texas", "75205", "./pics/smuLogo.png", 53, 80, 
        "https://www.smu.edu/"));
        
        Data.add(new College("Rice University", 51107.0, 6740,
        true, true, "Houston", "Texas", "77005", "./pics/riceLogo.png", 11, 93,
        "https://www.rice.edu/"));
        
        Data.add(new College("University of Houston", 9457.0, 45364,
        true, true, "Houston", "Texas", "77004", "./pics/houstonLogo.png", 63, 59, 
        "https://www.uh.edu/"));
        
        Data.add(new College("Texas A&M", 12382.0, 72928,
        true, true, "College Station", "Texas", "77843", "./pics/tamLogo.png", 63, 82, 
        "https://www.tamu.edu/"));
        
        Data.add(new College("University of North Texas", 11090.0, 40796,
        true, true, "Denton", "Texas", "76203", "./pics/untLogo.png", 84, 64, 
        "https://www.unt.edu/"));
        
        Data.add(new College("University of Texas at Dallas", 13992.0, 29543,
        true, true, "Richardson", "Texas", "75080", "./pics/utdLogo.png", 79, 70, 
        "https://www.utdallas.edu/"));
        
        Data.add(new College("Columbia University", 61671.0, 31455,
        true, true, "New York City", "New York", "10027", "columbiaLogo", 7, 95, 
        "https://www.columbia.edu/"));
        
        Data.add(new College("Georgetown University", 57928.0, 5365,
        true, true, "Washington DC", "Maryland", "20057", "georgetownLogo", 17, 95, 
        "https://www.georgetown.edu/"));
        
        NAMES.add("Search Name, City, or State of School");
        for (College college: Data){
            NAMES.add(college.getName());
        }
        
        
    }
}
