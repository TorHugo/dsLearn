package com.base.project.service;

import com.base.project.model.entity.UserModel;

public interface AuthService {
    UserModel authenticated();
    void validadeSelfOrAdmin(final Long idUser);
}
