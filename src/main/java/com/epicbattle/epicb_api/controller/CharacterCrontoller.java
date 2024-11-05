package com.epicbattle.epicb_api.controller;

import com.epicbattle.epicb_api.repository.CharacterRepository;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.web.bind.annotation.*;
import com.epicbattle.epicb_api.model.Character;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping ("/api/characters")
public class CharacterCrontoller {

    @Autowired
    private CharacterRepository characterRepository;

    /* Get de siempre
    @GetMapping
    public List <Character> getAllCharacters (){
        return characterRepository.findAll();
    }
    */

    // Implementar paginación, lo que solicita resultados en "páginas" y no todos a la vez.
    @GetMapping
    public Page<Character> getAllCharacters(Pageable pageable){
        return characterRepository.findAll(pageable);
    }

    @PostMapping
    public Character createCharacter (@RequestBody Character character){
        return characterRepository.save(character);
    }

    public Character getCharacterById(int idCharacter){
        return characterRepository.findById(idCharacter)
                .orElseThrow(() -> new ConfigDataResourceNotFoundException("Personaje no encontrado"));
    }

    public Character updateCharacter (int idCharacter, Character characterDetails){
        Character character = getCharacterById(idCharacter);

        character.setNameCharacter(characterDetails.getNameCharacter());
        character.setCategoryCharacter(characterDetails.getCategoryCharacter());
        character.setUniversCharacter(characterDetails.getUniversCharacter());
        character.setHealthCharacter(characterDetails.getHealthCharacter());
        character.setAttackCharacter(characterDetails.getAttackCharacter());
        character.setDefenseCharacter(characterDetails.getDefenseCharacter());
        character.setSpeedCharacter(characterDetails.getSpeedCharacter());
        character.setStaminaCharacter(characterDetails.getStaminaCharacter());
        character.setIntelligenceCharacter(characterDetails.getIntelligenceCharacter());
        character.setSpecialCharacter(characterDetails.getSpecialCharacter());
        character.setImageUrl(characterDetails.getImageUrl());

        return characterRepository.save(character);
    }

    public void deleteCharacter (int idCharacter){
        Character character = getCharacterById(idCharacter);
        characterRepository.delete(character);
    }
}
