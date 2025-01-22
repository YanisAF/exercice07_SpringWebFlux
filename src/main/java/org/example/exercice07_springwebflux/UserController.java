package org.example.exercice07_springwebflux;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/users")
public class UserController {
//    Probleme de requêtes sur la bdd
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Flux<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<User> getUserById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @PostMapping("/create")
    public Mono<User> createUser(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping("/{id}")
    public Mono<User> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        return userService.update(id, user);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteUser(@PathVariable("id") Long id) {
        return userService.deleteById(id);
    }

}
