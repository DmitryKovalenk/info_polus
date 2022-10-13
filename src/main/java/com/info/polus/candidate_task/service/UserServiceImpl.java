package com.info.polus.candidate_task.service;

import com.info.polus.candidate_task.domain.Car;
import com.info.polus.candidate_task.domain.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * Сервис максимально простой, имитирует "поход" на endpoint вне приложения,
 * либо же какую-то логику, которая не связана с вызовом endpoint.
 */

@Service
public class UserServiceImpl implements UserService{

    public Map<String, User> getAllUsers() {
        return getUsers();
    }

    /**
     * Симуляция похода в БД
     *
     * @return
     */
    private Map<String, User> getUsers() {
        Map<String, User> userMap = new HashMap<>();
        userMap.put("John", new User(1, "John", Arrays.asList(
                new Car("Ford", "Mustang Boss 429", 1969),
                new Car("Chevrolet", "Chevelle SS 396", 1970),
                new Car("Dodge", "Charger", 2011)
        )));
        userMap.put("Mike", new User(2, "Mike", Arrays.asList(
                new Car("Mercedes", "E 63 AMG", 2018),
                new Car("Mercedes", "GLE", 2020)
        )));
        userMap.put("Travis", new User(3, "Travis", Arrays.asList(
                new Car("BMW", "M8 Grand Coupe", 2020),
                new Car("BMW", "750", 2019)
        )));

        userMap.put("Jackie", new User(4, "Travis", Arrays.asList(
                new Car("Porsche", "Panamera", 2021),
                new Car("Porsche", "Taycan", 2021)
        )));
        return userMap;
    }
}
