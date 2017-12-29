package com.bsgfb.rx.service;

import com.bsgfb.rx.model.User;
import reactor.core.publisher.Mono;

public interface ReactiveUserService {
    Mono<User> findById(Long id);
}
