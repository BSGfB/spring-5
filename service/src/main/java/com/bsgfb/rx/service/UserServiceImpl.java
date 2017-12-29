package com.bsgfb.rx.service;

import com.bsgfb.rx.model.User;
import com.bsgfb.rx.repository.MongoUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private MongoUserRepository userRepository;

    @Autowired
    public UserServiceImpl(final MongoUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(final Long id) {
        return userRepository.findById(id).get();
    }
}
