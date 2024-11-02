package com.edward.paisajesApi.repository;

import com.edward.paisajesApi.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Usuario,Integer> {
}
