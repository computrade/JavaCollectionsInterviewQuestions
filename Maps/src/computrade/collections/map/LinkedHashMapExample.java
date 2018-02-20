package computrade.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

import computrade.Student;

public class LinkedHashMapExample {
	
    public static void main(String[] args) {
      
            // Instantiate a LinkedHashMap with Integer as the key type and Student as the value type.
         	Map<Integer, Student> students = new LinkedHashMap<Integer, Student>();
         	// Instantiate four Students and insert them into the LinkedHashMap. 
    		students.put(12, new Student(12, "Fred"));
    		students.put(98, new Student(98, "Barney"));
    		students.put(49, new Student(49, "Sher"));
    		students.put(71, new Student(71, "Wilma"));
          
            System.out.println("\nIterate through the LinkedHashMap to process all Entries (Id, Student):");
            for (Map.Entry<Integer,Student> entry : students.entrySet()) {
                System.out.println("ID: " + entry.getKey() +  " Student: " + entry.getValue() );
            }   
            
        }
}
