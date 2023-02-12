package com.github.bzalyaliev.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "owner")
public class Car {

    private long id;
    private String model;
    private User owner;

}

