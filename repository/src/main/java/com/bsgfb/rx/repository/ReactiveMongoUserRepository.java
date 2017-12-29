package com.bsgfb.rx.repository;

import com.bsgfb.rx.model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Component;

public interface ReactiveMongoUserRepository extends ReactiveMongoRepository<User, Long> {
}
