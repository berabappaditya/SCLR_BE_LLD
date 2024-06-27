package Prototype_Registry;

public class Course implements Prototype<Course> {
    String name;
    int credits;
    int max_students;
    String id;
    int duration;

    Course() {

    }

    Course(Course course) {
        this.name = course.name;
        this.credits = course.credits;
        this.max_students = course.max_students;
        this.id = course.id;
        this.duration = course.duration;
    }

    @Override
    public Course clone() {
        return new Course(this);
    }

}
