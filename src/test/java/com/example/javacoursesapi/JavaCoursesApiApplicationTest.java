package com.example.javacoursesapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaCoursesApiApplicationTest {

    @Test
    public void added(){
        JavaCoursesApiApplication api = new JavaCoursesApiApplication();
        assertEquals(10, api.added(5, 5));
    }
}