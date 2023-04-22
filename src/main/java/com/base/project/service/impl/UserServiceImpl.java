package com.base.project.service.impl;

import com.base.project.exception.impl.ResourceNotFoundException;
import com.base.project.model.dto.UserDTO;
import com.base.project.model.entity.UserModel;
import com.base.project.repository.UserRepository;
import com.base.project.service.AuthService;
import com.base.project.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private AuthService authService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        log.info("1. Searching user in the database, by user email {}", email);
        UserModel user = repository.findByEmail(email);
        if (user == null)
            throw new UsernameNotFoundException("Email not found.");

        return user;
    }

    @Override
    public UserDTO findById(final Long idUser) {
        log.info("1. Validate self or admin.");
        authService.validadeSelfOrAdmin(idUser);

        log.info("2. Searching user in the database by idUser: {}", idUser);
        final UserModel userModel = repository.findById(idUser)
                .orElseThrow(() -> new ResourceNotFoundException("Entity not found!"));
        return new UserDTO(userModel);
    }
}
