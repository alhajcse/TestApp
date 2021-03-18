package com.test.webapp.service;

import com.test.webapp.model.User;
import com.test.webapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User saveUserInformation(User teacherInformation) {

        return  userRepository.save(teacherInformation);
    }

    public Optional<User> getUserInformationById(Integer id) {

        return userRepository.findById(id);
    }


    public List<User> getUserAll() {

        return (List<User>) userRepository.findAll();
    }
}
