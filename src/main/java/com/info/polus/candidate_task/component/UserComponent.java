package com.info.polus.candidate_task.component;

import com.info.polus.candidate_task.domain.User;
import com.info.polus.candidate_task.exception.UserNotFoundException;
import com.info.polus.candidate_task.model.UserRequest;
import com.info.polus.candidate_task.service.UserService;
import com.info.polus.candidate_task.validator.UserRequestValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Данный класс был создан осознано, для реализации бизнес-логики.
 */

@Component
@Slf4j
public class UserComponent {

    private final UserService userService;
    private final UserRequestValidator requestValidator;
    private final Converter<Map<String, User>, List<User>> mapToListConverter;

    public UserComponent(UserService userService,
                         UserRequestValidator requestValidator,
                         Converter<Map<String, User>, List<User>> mapToListConverter) {
        this.userService = userService;
        this.requestValidator = requestValidator;
        this.mapToListConverter = mapToListConverter;
    }

    public List<User> getUser() {
        return mapToListConverter.convert(userService.getAllUsers());
    }

    public Optional<User> getSpecificUser(UserRequest userRequest) throws UserNotFoundException {
        Integer clientId = requestValidator.requestValidate(userRequest);
        Map<String, User> allUsers = userService.getAllUsers();
        return Objects.requireNonNull(mapToListConverter.convert(allUsers)).stream()
                .filter(u -> u.getId().equals(clientId))
                .findFirst();
    }
}
