package com.epicbattle.epicb_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Character {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private int idCharacter;
    private String nameCharacter;
    private String categoryCharacter;
    private String universCharacter;
    private double healthCharacter;
    private double attackCharacter;
    private double defenseCharacter;
    private double speedCharacter;
    private double staminaCharacter;
    private double intelligenceCharacter;
    private double specialCharacter;
    private String imageUrl;

}
