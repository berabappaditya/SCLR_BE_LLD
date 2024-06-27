package Prototype_Registry;

public class Client {
     public static void main(String[] args) {
        CourseRegistry courseRegistry = new CourseRegistry();

        Course dsa = new Course();
        dsa.name = "Data Structures and Algorithms";
        courseRegistry.courseRegister("DSA", dsa);
        Course cs1 = courseRegistry.getCourse("DSA"); 
        Course cs2 = courseRegistry.getCourse("DSA");
        cs2.name = "Data Structures and Algorithms 2";
        System.out.println(cs2.name);
        

     }
    
}
