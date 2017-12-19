package com.owen.web;

import com.owen.User;
import com.owen.service.UserService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class UserController {

    @Resource(name = "userServiceImpl")
    private UserService userService;


    @RequestMapping(value = "/user/{name}",method = RequestMethod.GET)
    public String getUserInfo(@PathVariable(name = "name")String name, ModelMap modelMap){
        User user= userService.getUser(name);
        return user.toString();
    }

    @RequestMapping(value = "/save/{name}/{age}/{address}",method = RequestMethod.GET)
    public String saveUserInfo(@PathVariable(name = "name")String name,@PathVariable(name = "age")Integer age,@PathVariable(name = "address")String address,ModelMap modelMap){
        User user= userService.saveUser(name,age,address);
        return user.toString();
    }

}