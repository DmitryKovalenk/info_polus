package com.info.polus.candidate_task.component.junit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.info.polus.candidate_task.component.UserComponent;
import com.info.polus.candidate_task.domain.User;
import com.info.polus.candidate_task.model.UserRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

public class UserComponentJunitTest {

    @InjectMocks
    private UserComponent userComponent;
    @Mock
    private List<User> userResponse;
    @Mock
    private UserRequest userRequest;

    @BeforeEach
    public void init() throws JsonProcessingException {
        this.userComponent = Mockito.mock(UserComponent.class);
        this.userRequest = Mockito.mock(UserRequest.class);
        this.userResponse = Mockito.mock(ArrayList.class);
        when(userComponent.getUser()).thenReturn(userResponse);
    }

    @Test
    public void getUserTest() {
        List<User> response = userComponent.getUser();
        assertThat(response).isEqualTo(userResponse);
    }
}
