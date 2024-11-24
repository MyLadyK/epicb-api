package com.epicbattle.epicb_api.service;

import com.epicbattle.epicb_api.exception.GlobalExceptionHandler;
import com.epicbattle.epicb_api.model.Character;
import com.epicbattle.epicb_api.repository.CharacterRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository){
        this.characterRepository = characterRepository;
    }

    /* Get de siempre

    public List <Character> getAllCharacters (){
        return characterRepository.findAll();
    }
    */

    // Implementar paginación, lo que solicita resultados en "páginas" y no todos a la vez.

    public Page<com.epicbattle.epicb_api.model.Character> getAllCharacters(Pageable pageable) {
        return characterRepository.findAll(pageable);
    }

    public com.epicbattle.epicb_api.model.Character createCharacter (@RequestBody com.epicbattle.epicb_api.model.Character character){
        return characterRepository.save(character);
    }

    public com.epicbattle.epicb_api.model.Character getCharacterById(@PathVariable int id) {
        return characterRepository.findById(id)
                .orElseThrow(() -> new GlobalExceptionHandler.ResourceNotFoundException("Personaje no encontrado"));
    }

    public com.epicbattle.epicb_api.model.Character updateCharacter(@PathVariable int id, @RequestBody com.epicbattle.epicb_api.model.Character characterDetails) {
        com.epicbattle.epicb_api.model.Character character = characterRepository.findById(id)
                .orElseThrow(() -> new GlobalExceptionHandler.ResourceNotFoundException("Personaje no encontrado"));

        character.setNameCharacter(characterDetails.getNameCharacter());
        character.setCategoryCharacter(characterDetails.getCategoryCharacter());
        character.setUniverseCharacter(characterDetails.getUniverseCharacter());
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

        //La URL acepta peticiones delete capturando idCharacter desde la ruta
    public ResponseEntity<String> deleteCharacter(@PathVariable int idCharacter) {  // ResponseEntity<String> para devolver el mensaje de personaje eliminado
        Character character = getCharacterById(idCharacter);
        characterRepository.delete(character);
        return ResponseEntity.ok("Personaje eliminado");
    }
}
