package com.graphQL.representation;

import com.graphQL.entity.Course;
import com.graphQL.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepresentation {
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String street;
    private String city;
    private List<CourseRepresentation> courses;

    public StudentRepresentation(Student student) {
        this.id = student.getId();
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
        this.gender = student.getGender();
        this.street = student.getAddress().getStreet();
        this.city = student.getAddress().getCity();
        if(student.getCourses()!=null){
            courses = new ArrayList<>();
            for (Course course: student.getCourses()) {
                courses.add(new CourseRepresentation(course));
            }
        }
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<CourseRepresentation> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseRepresentation> courses) {
        this.courses = courses;
    }
}
