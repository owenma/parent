package com.owen.service;

import com.owen.User;


public interface UserService {

     User getUser(String name);

     User saveUser(String name,Integer age, String address);
}
