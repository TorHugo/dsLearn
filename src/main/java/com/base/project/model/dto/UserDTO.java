package com.base.project.model.dto;

import com.base.project.model.entity.UserModel;
import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String name;
    private String email;

    public UserDTO(UserModel model) {
        this.id = model.getId();
        this.name = model.getName();
        this.email = model.getEmail();
    }
}
