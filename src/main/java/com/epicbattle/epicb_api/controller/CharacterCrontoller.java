package com.epicbattle.epicb_api.controller;

import com.epicbattle.epicb_api.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.epicbattle.epicb_api.model.Character;

import java.util.List;

@RestController
@RequestMapping ("/api/characters")
public class CharacterCrontoller {

    @Autowired
    private CharacterRepository characterRepository;

    @GetMapping
    public List <Character> getAllCharacters (){
        return characterRepository.findAll();
    }

    @PostMapping
    public Character createCharacter (@RequestBody Character character){
        return characterRepository.save(character);
    }
}
