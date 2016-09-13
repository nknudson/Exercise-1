package com.matc.entity;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

/**
 * Created by nataliya.knudson on 9/7/2016.
 */
public class UserTest {
    /**
     * User user;
     *
     * @Before public void setUp() {
     * user = new User("Test", "One", "5", createLocalDateFromString("08-01-2000"));
     * }
     * <p>
     * private LocalDate createLocalDateFromString(String inputDate) {
     * DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");
     * return LocalDate.parse(inputDate, DATE_FORMAT);
     * <p>
     * }
     * @Test public void getAge() throws Exception {
     * assertEquals(16, user.getAge());
     * }
     */
    User userTest;
    @Before
    public void setUp() {
        userTest = new User("Test", "One", "5", createLocalDateFromString("08-01-2000"));
    }

    private LocalDate createLocalDateFromString(String inputDate) {
        DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(inputDate, DATE_FORMAT);
    }

    @Test
    public void getAgeTest() {
        // setup
        // User userTest = new User("Test", "One", "5", createLocalDateFromString("08-01-2000"));



        // exercise
        int ageCalculated = userTest.getAge();
        // assert
        assertEquals(16, ageCalculated);
    }
}

