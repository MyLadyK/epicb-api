package com.epicbattle.epicb_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data // G&S, toString, equals y hashCode
@NoArgsConstructor // Constructor vacío
@AllArgsConstructor // Constructor completo
public class UserCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idUserCharacter;
    private User owner;
    private Character baseCharacter; //personaje base.

    /* Se extrae del personaje base
    @NotNull(message = "El nombre no puede ser null")
    @Size(min = 1, max = 50, message = "El nombre debe tener entre 1 y 50 caracteres")
    private String nameUserCharacter;

    @Size(min = 1, max = 80, message = "La categoría debe tener entre 1 y 80 caracteres")
    private String categoryUserCharacter;

    @Size(min = 1, max = 100, message = "El universo al que pertenece debe tener entre 1 y 100 caracteres")
    private String universeUserCharacter;

     */

    @NotNull(message = "La salud no puede ser null")
    @Min(value = 1, message = "La salud mínima es 1")
    @Max(value = 100, message = "La salud máxima es 100")
    private double healthUserCharacter;

    @NotNull(message = "El ataque no puede ser null")
    @Min(value = 1, message = "El ataque mínim es 1")
    @Max(value = 10, message = "El ataque máxim es 10")
    private double attackUserCharacter;

    @NotNull(message = "La defensa no puede ser null")
    @Min(value = 1, message = "La defensa mínima es 1")
    @Max(value = 10, message = "La defensa máxima es 10")
    private double defenseUserCharacter;

    @NotNull(message = "La velocidad no puede ser null")
    @Min(value = 1, message = "La velocidad mínima es 1")
    @Max(value = 10, message = "La velocidad máxima es 10")
    private double speedUserCharacter;

    @NotNull(message = "El aguante no puede ser null")
    @Min(value = 1, message = "El aguante mínimo es 1")
    @Max(value = 10, message = "El aguante máximo es 10")
    private double staminaUserCharacter;

    @NotNull(message = "La inteligencia no puede ser null")
    @Min(value = 1, message = "La inteligencia mínima es 1")
    @Max(value = 10, message = "La inteligencia máxima es 10")
    private double intelligenceUserCharacter;

    @NotNull(message = "El especial no puede ser null")
    @Min(value = 1, message = "El especial mínimo es 1")
    @Max(value = 5, message = "El especial máximo es 5")
    private double specialUserCharacter;

    private String imageUrlUserCharacter;
    private int timesUsed;

}
