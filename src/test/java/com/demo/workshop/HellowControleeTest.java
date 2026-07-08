package com.demo.workshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {

    @Test
    void helloTest() {

        HelloController controller =
                new HelloController();

        assertEquals(
                "Hello AWS Workshop",
                controller.hello()
        );
    }
}
