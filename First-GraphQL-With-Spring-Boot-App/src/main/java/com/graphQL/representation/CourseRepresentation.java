package com.graphQL.representation;

import com.graphQL.entity.Course;

import javax.persistence.Column;

public class CourseRepresentation {

    private int id;

    private String courses;

    public CourseRepresentation(Course course) {
        this.id = course.getId();
        this.courses = course.getCourses();
    }

}
