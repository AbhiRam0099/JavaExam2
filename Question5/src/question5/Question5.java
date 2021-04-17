/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Abhilash Ramavaram
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
             // TODO code application logic here
        
        Person p = new Person("joe", "Texas", "8774783738", "JoeJoe@gmail.com");
        System.out.println( p);
        Student s = new Student(2.5, "boby", "Arkansas", "2244556578", "boby@gmail.com");
        System.out.println( s);
        Staff st = new Staff("President", "Recreation", 2500, "01/11/2020",
                "Ron", "New Jersy", "8833428596", "Ron@gmail.com");
        System.out.println( st);
        Employee e = new Employee("Wellness", 2500, "01/10/2019", "Doe", 
                "Chicago", "9975421156", "Doe@gmail.com");
        System.out.println(e);
        Faculty f = new Faculty("10-40 AM", 3, "CS", 4000, "05/12/2015", 
                "Haily", "Denever", "32277266821", "Haily@gmail.com");
        System.out.println( f);
    }
    
}
