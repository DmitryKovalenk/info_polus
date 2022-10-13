package com.info.polus.candidate_task.component.integration;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.info.polus.candidate_task.component.UserComponent;
import com.info.polus.candidate_task.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles
public class UserComponentIntegrationTest {

    @Autowired
    private UserComponent userComponent;

    @Test
    public void getUser() {
        List<User> user = userComponent.getUser();
        assert user.size() > 0;
    }
}
