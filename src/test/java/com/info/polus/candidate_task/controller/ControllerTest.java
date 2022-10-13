package com.info.polus.candidate_task.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ControllerTest {

    @Autowired
    private UserController controller;

    @Test
    public void contextLoads() {
        assertThat(controller).isNotNull();
    }

}
