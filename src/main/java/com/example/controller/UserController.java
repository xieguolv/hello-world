package com.example.controller;

import com.example.entity.User;
import com.example.kfit.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @RequestMapping("save")
    public String save(User user){
        userInfoRepository.save(user);
        return "";
    }

    @RequestMapping("find")
    public List<User> find(){

        return userInfoRepository.findAll();
    }

    @RequestMapping("delete")
    public void delete(User user){

        userInfoRepository.delete(user);
    }

    @RequestMapping("insert")
    public void insert(User user){

        userInfoRepository.insert(user);
    }

    @RequestMapping("findByUsernameAndPassword")
    public User findByUsernameAndPassword(String username,String password){

        return userInfoRepository.findByUsernameAndPassword(username,password);
    }

    public User findByCountnumberAndPassword(String countnumber,String password){

        return userInfoRepository.findByCountnumberAndPassword(countnumber,password);
    }
}
