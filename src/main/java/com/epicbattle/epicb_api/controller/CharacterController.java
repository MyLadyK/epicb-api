package com.epicbattle.epicb_api.controller;

import com.epicbattle.epicb_api.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.epicbattle.epicb_api.model.Character;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping ("/api/characters")
public class CharacterController {

    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public Page<Character> getAllCharacters(Pageable pageable) {
        return characterService.getAllCharacters(pageable);
    }

    @PostMapping
    public Character createCharacter(@RequestBody Character character) {
        return characterService.createCharacter(character);
    }

    @GetMapping("/{id}")
    public Character getCharacterById(@PathVariable int id) {
        return characterService.getCharacterById(id);
    }

    @PutMapping("/{id}")
    public Character updateCharacter(@PathVariable int id, @RequestBody Character characterDetails) {
        return characterService.updateCharacter(id, characterDetails);
    }

    @DeleteMapping("/{idCharacter}")
    public ResponseEntity<String> deleteCharacter(@PathVariable int idCharacter) {
        characterService.deleteCharacter(idCharacter);
        return ResponseEntity.ok("Personaje eliminado");
    }

}
