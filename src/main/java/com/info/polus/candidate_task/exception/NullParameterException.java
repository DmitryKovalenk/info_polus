package com.info.polus.candidate_task.exception;

/**
 * Ошибка будет "брошена" если на сервер придет пустой обязательный параметр
 */

public class NullParameterException extends IllegalArgumentException {
    public NullParameterException(String error) {
        super(error);
    }
}
