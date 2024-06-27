package Prototype_Registry;

import java.util.HashMap;
import java.util.Map;

public class CourseRegistry {
    private Map<String, Course> courses;

    CourseRegistry(){
        this.courses = new HashMap<>();
    }
    static {
        // invoke the static block
    }

    public void courseRegister(String str, Course course) {
        courses.put(str, course);   
    }

    public Course getCourse(String str) {
        return courses.get(str).clone();
    }
    
}
