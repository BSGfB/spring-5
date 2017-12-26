package com.bsgfb.rx.service;

import com.bsgfb.rx.model.User;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class StaticUserService implements UserService {
    private Map<Long, User> users = new HashMap<>();
    private AtomicLong idCounter = new AtomicLong(0);

    public StaticUserService() {
        System.out.println("Kek");
        save(new User("bsgfb", "blashuk@email.com", "qwe"));
        save(new User("bob", "bob@email.com", "123"));
    }

    @Override
    public Mono<Long> save(final User user) {
        user.setId(idCounter.incrementAndGet());
        users.put(user.getId(), user);

        return Mono.justOrEmpty(user.getId());
    }

    @Override
    public Flux<User> getAll() {
        return Flux.fromIterable(users.values());
    }

    @Override
    public Mono<User> getById(long id) {
        return Mono.justOrEmpty(users.get(id));
    }
}
