package com.bsgfb.rx.repository;

import com.bsgfb.rx.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

public interface MongoUserRepository extends MongoRepository<User, Long> {
}
