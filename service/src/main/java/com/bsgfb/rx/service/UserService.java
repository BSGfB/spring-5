package com.bsgfb.rx.service;

import com.bsgfb.rx.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<Long> save(User user);

    Flux<User> getAll();

    Mono<User> getById(long id);
}
