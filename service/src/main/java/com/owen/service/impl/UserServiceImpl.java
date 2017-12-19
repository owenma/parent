package com.owen.service.impl;

import com.owen.User;
import com.owen.dao.repository.UserRepository;
import com.owen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    public User getUser(String name){
        return userRepository.findByName(name);
    }

    @Transactional
    public User saveUser(String name,Integer age, String address){
        User user = new User(name, age, address);
        return userRepository.save(user);
    }
}
