package com.edward.paisajesApi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "users")
public class Usuario implements Serializable {
    @Id
    private int id;
    private String name;
    private String rol;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String telefono;

}
