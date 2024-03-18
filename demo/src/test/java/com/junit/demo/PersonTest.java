package com.junit.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

  private Person cut;

    @BeforeEach
    void setup() {
        cut = new Person();
    }


    @Test
    void setFirstname_test() {
        // ...
    }

    // ...

    @AfterEach
    void teardown() {
        cut = null;
    }

    @Test
    void getFirstname_test() {
        // Arrange
        cut.setFirstname("Sarah");

        // Act
        var result = cut.getFirstname();

        // Assert
        assertEquals("Sarah", result);
    }

    @Test
    void getLastName_test() {
        // Arrange
        cut.setLastname("Lawrence");

        // Act
        var result = cut.getLastname();

        // Assert
        assertEquals("Lawrence", result);
    }

    @Test
    void getAge_test() {
        // Arrange
        cut.setAge(19);

        // Act
        var result = cut.getAge();

        // Assert
        assertEquals(19, result);
    }

    @Test
    void getAge_notNull() {
        // Arrange
        cut.setAge(19);

        // Act
        var result = cut.getAge();

        // Assert
        assertNotNull(result);
    }

    @Test
    void getAge_greaterThanZero() {
        // Arrange
        cut.setAge(19);

        // Act
        var result = cut.getAge();

        // Assert
        assertTrue(result > 0);
    }

}
