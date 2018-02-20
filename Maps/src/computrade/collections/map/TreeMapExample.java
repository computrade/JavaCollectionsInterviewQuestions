package computrade.collections.map;

import java.util.Map;
import java.util.TreeMap;

import computrade.Student;

public class TreeMapExample {
    public static void main(String[] args) {
      
            // Instantiate a TreeMap with Integer as the key type and Student as
            // the value type.
    		TreeMap<Integer, Student> students = new TreeMap<Integer, Student>();
            // Instantiate four Students and insert them into the TreeMap. 
    		students.put(12, new Student(12, "Fred"));
    		students.put(98, new Student(98, "Barney"));
    		students.put(49, new Student(49, "Sher"));
    		students.put(71, new Student(71, "Wilma"));
            
            System.out.println("Iterate through the TreeMap to process all Entries (Id, Student):");
            for (Map.Entry<Integer,Student> entry : students.entrySet()) {
                System.out.println("ID: " + entry.getKey() +  " Student: " + entry.getValue() );
            }
            
            System.out.println("***Note: The map is sorted according to the natural ordering of its keys!");
            
            System.out.println("\nprinting first entry:" + students.firstEntry());
            System.out.println("printing last entry:" + students.lastEntry());
            System.out.println("printing sub map with toString method:" + students.subMap(0,50));  
             
        }
}
