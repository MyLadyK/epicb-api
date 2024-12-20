package com.epicbattle.epicb_api.repository;

import com.epicbattle.epicb_api.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository <Character, Integer> {
}
