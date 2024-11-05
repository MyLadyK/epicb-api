package com.epicbattle.epicb_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "characters")

@Data // G&S, toString, equals y hashCode
@NoArgsConstructor // Constructor vacío
@AllArgsConstructor // Constructor completo
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
