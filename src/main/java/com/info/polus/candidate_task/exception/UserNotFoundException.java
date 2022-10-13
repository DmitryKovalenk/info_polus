package com.info.polus.candidate_task.exception;

/**
 * Ошибка будет "брошена" если мы не найдем пользователя по указанному id
 */

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String error) {
        super(error);
    }
}
