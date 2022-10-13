package com.info.polus.candidate_task.validator;

import com.info.polus.candidate_task.exception.UserNotFoundException;
import com.info.polus.candidate_task.model.UserRequest;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Проверяем запрос на корректность и на обязательный параметр id
 */
@Component
public class UserRequestValidator {

    public Integer requestValidate(UserRequest source) throws UserNotFoundException {
        return Optional.of(source)
                .map(UserRequest::getId)
                .filter(i -> {
                    if (i <= 0 || i > 4) {
                        try {
                            throw new UserNotFoundException(String.format("user with id: %s not found. " +
                                                                          "Allowed value is: 1,2,3,4", i));
                        } catch (UserNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        return true;
                    }
                })
                .orElseThrow(() -> new UserNotFoundException("id must not be null"));
    }
}
