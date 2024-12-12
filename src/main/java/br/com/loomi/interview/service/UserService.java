package br.com.loomi.interview.service;

import br.com.loomi.interview.controller.CreateUserDTO;
import br.com.loomi.interview.entity.User;
import br.com.loomi.interview.model.TypeUser;
import br.com.loomi.interview.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UUID createUser(CreateUserDTO createUserDTO) {
        var entity = new User(null, createUserDTO.name(), createUserDTO.email(), createUserDTO.password(), Instant.now(), null, TypeUser.CLIENTE);
        var userSaved = userRepository.save(entity);

        return userSaved.getUserId();
    }
}
