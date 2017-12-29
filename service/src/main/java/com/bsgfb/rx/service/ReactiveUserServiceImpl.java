package com.bsgfb.rx.service;

import com.bsgfb.rx.model.User;
import com.bsgfb.rx.repository.ReactiveMongoUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ReactiveUserServiceImpl implements ReactiveUserService {

    private ReactiveMongoUserRepository userRepository;

    @Autowired
    public ReactiveUserServiceImpl(final ReactiveMongoUserRepository reactiveMongoUserRepository) {
        this.userRepository = reactiveMongoUserRepository;
    }

    @Override
    public Mono<User> findById(final Long id) {
        return userRepository.findById(id);
    }
}
