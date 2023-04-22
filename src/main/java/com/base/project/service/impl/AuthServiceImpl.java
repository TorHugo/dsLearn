package com.base.project.service.impl;

import com.base.project.exception.impl.ForbiddenException;
import com.base.project.exception.impl.UnauthorizedException;
import com.base.project.model.entity.UserModel;
import com.base.project.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.*;
import com.base.project.service.AuthService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
@Slf4j
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserModel authenticated() {
        try {
            log.info("1. Find user to security context.");
            String userName = SecurityContextHolder.getContext().getAuthentication().getName();
            return userRepository.findByEmail(userName);
        } catch (Exception e){
            throw new UnauthorizedException("Invalid user!");
        }
    }

    @Override
    public void validadeSelfOrAdmin(final Long idUser) {
        UserModel user = authenticated();
        if (!Objects.equals(user.getId(), idUser) && !user.hasHole("ROLE_ADMIN"))
            throw new ForbiddenException("Access denied!");
    }

}
