package com.rainyalley.architecture.impl;


import com.rainyalley.architecture.Page;
import com.rainyalley.architecture.enums.ResourceEnum;
import com.rainyalley.architecture.model.User;
import com.rainyalley.architecture.po.UserAdd;
import com.rainyalley.architecture.repository.UserRepository;
import com.rainyalley.architecture.service.UserService;
import com.rainyalley.architecture.util.ExceptionTranslator;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author bin.zhang
 */
@Slf4j
@Setter
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    private ExceptionTranslator translator = new ExceptionTranslator(ResourceEnum.USER);

    @Transactional(readOnly = true, rollbackFor = Throwable.class)
    @Override
    public Mono<User> get(Mono<Long> id) {
        return userRepository.findById(id).map(this::map);
    }


    @Override
    public Flux<User> list(Mono<Page> page) {
        return page
                .flatMapMany(p -> userRepository.findAll()
                .map(this::map))
                .onErrorMap(translator::translate);
    }

    @Override
    public Flux<User> tail(Mono<Page> page) {
        return page
                .flatMapMany(p -> userRepository.findBy()
                        .map(this::map))
                .onErrorMap(translator::translate);
    }


    @Override
    public Mono<User> add(Mono<UserAdd> userAdd) {
        return userAdd
                .flatMap(a -> userRepository.save(map(a)))
                .map(this::map)
                .doOnError(e -> log.error("add error", e))
                .onErrorMap(translator::translate);
    }

    @Override
    public Flux<User> add(Flux<UserAdd> userAdd) {
        return userRepository.saveAll(userAdd.map(this::map)).map(this::map).onErrorMap(e -> translator.translate(e));
    }

    @Override
    public Mono<User> remove(Mono<Long> id) {
        return id
                .flatMap(i -> userRepository.findById(id))
                .doOnNext(e -> userRepository.deleteById(e.getId()).subscribe())
                .map(this::map)
                .doOnError(e -> log.error("remove error", e))
                .onErrorMap(e -> translator.translate(e));
    }

    private User map(com.rainyalley.architecture.entity.User user) {
        return User.builder()
                .id(user.getId())
                .name(user.getName())
                .password(user.getPassword())
                .build();
    }


    private com.rainyalley.architecture.entity.User map(UserAdd userAdd) {
        com.rainyalley.architecture.entity.User e = new com.rainyalley.architecture.entity.User();
        e.setId(System.currentTimeMillis());
        e.setName(userAdd.getName());
        e.setPassword(userAdd.getPassword());
        return e;
    }

}
