package org.launchcode;

import java.util.ArrayList;

public class Course {
    private final String topic;
    private final Teacher instructor;
    private final ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor, ArrayList<Student> enrolledStudents) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString() {
        return "Course = " + topic + " / Instructor = " + instructor +
                " / Students = " + enrolledStudents;
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        Course course = (Course) toBeCompared;
        return topic.equals(course.topic) &&
                instructor.equals(course.instructor) &&
                enrolledStudents.equals(course.enrolledStudents);
    }
}
