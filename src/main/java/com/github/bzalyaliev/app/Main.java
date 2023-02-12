package com.github.bzalyaliev.app;

import com.github.bzalyaliev.dao.UsersDao;
import com.github.bzalyaliev.dao.UsersDaoJdbcTemplateImpl;
import com.github.bzalyaliev.model.User;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("ьн_зфыыцщкв");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/user_db");

        UsersDao usersDao = new UsersDaoJdbcTemplateImpl(dataSource);
        List<User> users = usersDao.findAll();

        System.out.println(users);

    }
}
