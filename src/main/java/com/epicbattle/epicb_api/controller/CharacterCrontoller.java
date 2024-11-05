package com.epicbattle.epicb_api.controller;

import com.epicbattle.epicb_api.exception.GlobalExceptionHandler;
import com.epicbattle.epicb_api.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.epicbattle.epicb_api.model.Character;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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
    public Page<Character> getAllCharacters(Pageable pageable) {
        return characterRepository.findAll(pageable);
    }


    @PostMapping
    public Character createCharacter (@RequestBody Character character){
        return characterRepository.save(character);
    }

    @GetMapping("/{id}")
    public Character getCharacterById(@PathVariable int id) {
        return characterRepository.findById(id)
                .orElseThrow(() -> new GlobalExceptionHandler.ResourceNotFoundException("Personaje no encontrado"));
    }

    @PutMapping("/{id}")
    public Character updateCharacter(@PathVariable int id, @RequestBody Character characterDetails) {
        Character character = characterRepository.findById(id)
                .orElseThrow(() -> new GlobalExceptionHandler.ResourceNotFoundException("Personaje no encontrado"));

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

    @DeleteMapping("/{idCharacter}")    //La URL acepta peticiones delete capturando idCharacter desde la ruta
    public ResponseEntity<String> deleteCharacter(@PathVariable int idCharacter) {  // ResponseEntity<String> para devolver el mensaje de personaje eliminado
        Character character = getCharacterById(idCharacter);
        characterRepository.delete(character);
        return ResponseEntity.ok("Personaje eliminado");
    }

}
