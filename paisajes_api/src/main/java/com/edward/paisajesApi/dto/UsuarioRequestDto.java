package com.edward.paisajesApi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequestDto implements Serializable {

    private String name;
    private String rol;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String telefono;

}
