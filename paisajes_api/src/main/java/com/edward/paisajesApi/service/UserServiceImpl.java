package com.edward.paisajesApi.service;

import com.edward.paisajesApi.dto.UsuarioRequestDto;
import com.edward.paisajesApi.model.Usuario;
import com.edward.paisajesApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<Usuario> obtenerTodosUsuarios() {
        return userRepository.findAll();
    }

    @Override
    public void insertarUser(UsuarioRequestDto usuario) {
        String passEncoder = usuario.getPassword();

        Usuario usuarioNvo = Usuario.builder().build();
    }
}
