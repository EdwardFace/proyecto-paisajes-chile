package com.edward.paisajesApi.service;

import com.edward.paisajesApi.dto.UsuarioRequestDto;
import com.edward.paisajesApi.model.Usuario;

import java.util.List;

public interface UserService {
    List<Usuario> obtenerTodosUsuarios();
    void insertarUser(UsuarioRequestDto usuario);
}
