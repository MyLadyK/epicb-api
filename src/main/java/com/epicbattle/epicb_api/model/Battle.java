package com.epicbattle.epicb_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data // G&S, toString, equals y hashCode
@NoArgsConstructor // Constructor vacío
@AllArgsConstructor // Constructor completo

public class Battle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idBattle;

    //Añadir relaciones con usuarios y/o personajes
}
