package com.epicbattle.epicb_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;


@Entity //Esta clase es una entidad en la base de datos
@Table(name = "users") //Cambia el nombre de la tabla a users, porque user es una palabra reservada en H2

@Data // G&S, toString, equals y hashCode
@NoArgsConstructor // Constructor vacío
@AllArgsConstructor // Constructor completo
public class User {

    @Id //Clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genera ID automáticamente.

    private int idUser;
    private String nameUser;
    private String mailUser;
    private String passwordHash;
    private int energy;
    private Timestamp lastEnergyRefill;

    @OneToMany // Relación de uno a muchos con UserCharacter
    private List <UserCharacter> character;

    @OneToMany // Relación de uno a muchos con Message enviado
    private List <Message> messageSent;

    @OneToMany // Relación de uno a muchos con Message recibido
    private List <Message> messageReceived;

    @OneToMany // Relación de uno a muchos con BattleResult
    private List <BattleResult> battleResult;

}
