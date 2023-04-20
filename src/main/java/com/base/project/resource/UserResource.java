package com.base.project.resource;

import com.base.project.model.dto.UserDTO;
import com.base.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.base.project.util.ResponseUtils.successful;

@RestController
@RequestMapping(value = "/api/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{idUser}")
    public ResponseEntity<UserDTO> findById(@PathVariable final Long idUser){
        final UserDTO userDTO = userService.findById(idUser);
        return  ResponseEntity.status(successful).body(userDTO);
    }
}
