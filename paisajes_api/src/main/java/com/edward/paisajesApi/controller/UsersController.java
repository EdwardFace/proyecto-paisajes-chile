package com.edward.paisajesApi.controller;

import com.edward.paisajesApi.model.Usuario;
import com.edward.paisajesApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping("/api/saludo")
    public ResponseEntity<List<Usuario>> saludo (){
        List<Usuario> listOptional = userService.obtenerTodosUsuarios();
        return new ResponseEntity<>(listOptional, HttpStatus.OK);
    }
}
