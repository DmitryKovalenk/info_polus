package com.info.polus.candidate_task.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Можно было использовать GET. Но требование задачи - POST запрос.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private Integer id;
}
