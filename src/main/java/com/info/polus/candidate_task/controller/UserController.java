package com.info.polus.candidate_task.controller;

import com.info.polus.candidate_task.component.UserComponent;
import com.info.polus.candidate_task.domain.User;
import com.info.polus.candidate_task.exception.UserNotFoundException;
import com.info.polus.candidate_task.model.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserComponent component;

    public UserController(UserComponent component) {
        this.component = component;
    }

    @GetMapping("/get")
    public List<User> getUser() {
        return component.getUser();
    }

    @PostMapping("get_specific")
    public Optional<User> getSpecificUser(@RequestBody UserRequest userRequest) throws UserNotFoundException {
        return component.getSpecificUser(userRequest);
    }
}
