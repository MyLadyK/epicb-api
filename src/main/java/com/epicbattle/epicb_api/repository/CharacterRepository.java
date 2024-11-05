package com.epicbattle.epicb_api.repository;

import com.epicbattle.epicb_api.model.Character;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface CharacterRepository extends JpaRepository <Character, Integer> {
    Page findAll(Pageable pageable);
}
