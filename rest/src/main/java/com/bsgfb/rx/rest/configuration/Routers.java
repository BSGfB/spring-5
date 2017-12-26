package com.bsgfb.rx.rest.configuration;

import com.bsgfb.rx.model.User;
import com.bsgfb.rx.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class Routers {
    @Bean
    public RouterFunction<ServerResponse> routes(final UserService userService) {
        /*return route(GET("/getById/{id}"), request -> {
            long id = Long.valueOf(request.pathVariable("id"));
            Mono<ServerResponse> notFound = ServerResponse.notFound().build();
            Mono<User> userMono = userService.getById(id);
            return userMono
                    .flatMap(person -> ServerResponse.ok().contentType(APPLICATION_JSON).body(fromObject(person)))
                    .switchIfEmpty(notFound);
        });*/

        System.out.println("Hello bob");
        return route(GET("/"), request -> {
            Mono<ServerResponse> notFound = ServerResponse.notFound().build();
            Mono<User> userMono = userService.getById(1L);
            return userMono
                    .flatMap(person -> ServerResponse.ok().contentType(APPLICATION_JSON).body(fromObject(person)))
                    .switchIfEmpty(notFound);
        });
    }
}
