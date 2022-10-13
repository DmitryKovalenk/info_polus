package com.info.polus.candidate_task.service;

import com.info.polus.candidate_task.domain.User;

import java.util.Map;

/**
 * Немножко SOLID'a а именнно - зависимость на абстракциях
 */
public interface UserService {

    Map<String, User> getAllUsers();
}
