package com.github.bzalyaliev.controllers;

import com.github.bzalyaliev.dao.UsersDao;
import com.github.bzalyaliev.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

// Controller - это тот же сервлет, который работает в инфраструктуре Spring
public class UsersController implements Controller {

    @Autowired
    private UsersDao usersDao;

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        if (request.getMethod().equals("GET")) {
            List<User> users = usersDao.findAll();
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("users");
            modelAndView.addObject("usersFromServer", users);
            return modelAndView;
        }

        return null;
    }
}
