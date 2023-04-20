package com.base.project.service;

import com.base.project.model.dto.UserDTO;

public interface UserService {

    UserDTO findById(final Long idUser);
}
