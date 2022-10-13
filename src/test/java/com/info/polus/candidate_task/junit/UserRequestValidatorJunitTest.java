package com.info.polus.candidate_task.junit;

import com.info.polus.candidate_task.exception.UserNotFoundException;
import com.info.polus.candidate_task.model.UserRequest;
import com.info.polus.candidate_task.validator.UserRequestValidator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class UserRequestValidatorJunitTest {

    @InjectMocks
    private UserRequestValidator userRequestValidator;
    @Mock
    private UserRequest userRequest;


    @Before
    public void init() throws UserNotFoundException {
        this.userRequestValidator = Mockito.mock(UserRequestValidator.class);
        this.userRequest = Mockito.mock(UserRequest.class);
        Mockito.when(userRequestValidator.requestValidate(userRequest)).thenReturn(Mockito.anyInt());
    }

    @Test
    public void convertTest() throws UserNotFoundException {
        Integer anyInt = userRequestValidator.requestValidate(userRequest);
        assertEquals(anyInt, Integer.valueOf(Mockito.anyInt()));
    }
}
