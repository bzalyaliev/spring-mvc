package com.github.bzalyaliev.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private long id;
    private String firstName;
    private String lastName;

    private List<Car> cars;


}
