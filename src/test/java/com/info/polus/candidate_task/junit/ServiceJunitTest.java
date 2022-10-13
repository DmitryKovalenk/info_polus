package com.info.polus.candidate_task.junit;

import com.info.polus.candidate_task.domain.User;
import com.info.polus.candidate_task.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ServiceJunitTest {

    @InjectMocks
    private UserService userService;
    @Mock
    private Map<String, User> user;

    @Before
    public void init() {
        this.userService = Mockito.mock(UserService.class);
        this.user = Mockito.mock(HashMap.class);
        Mockito.when(userService.getAllUsers()).thenReturn(user);
    }

    @Test
    public void getUserTest() {
        Map<String, User> users = userService.getAllUsers();
        assertEquals(users, this.user);
    }
}
