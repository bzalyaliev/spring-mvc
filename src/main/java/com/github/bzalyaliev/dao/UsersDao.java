package com.github.bzalyaliev.dao;

import com.github.bzalyaliev.model.User;

import java.util.List;

public interface UsersDao extends CrudDao<User> {
    List<User> findAllByFirstName(String firstName);
}
