package com.epicbattle.epicb_api.repository;

import com.epicbattle.epicb_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {
    User findByNameUser (String nameUser); //Método adicional para encontrar al usuario con el nombre
}
