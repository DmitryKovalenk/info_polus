package com.info.polus.candidate_task.converter;

import com.info.polus.candidate_task.domain.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

@Component
public class MapToListConverter implements Converter<Map<String, User>, List<User>> {


    @Override
    public List<User> convert(Map<String, User> source) {
        List<User> userList = new ArrayList<>(source.values());
        userList.sort(Comparator.comparingInt(User::getId));
        userList.forEach(System.out::println);
        return userList;
    }
}
