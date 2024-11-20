package com.epicbattle.epicb_api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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

    @NotNull(message = "El nombre no puede estar en blanco")
    @Size(min = 1, max = 50, message = "El nombre debe tener entre 1 y 50 caracteres")
    private String nameUser;

    @NotNull(message = "El correo no puede estar en blanco")
    @Size(min = 1, max = 100, message = "El correo debe tener entre 1 y 100 caracteres")
    private String mailUser;

    @NotNull(message = "La contraseña no puede estar en blanco")
    @Size(min = 8, max = 20, message = "La contraseña debe tener entre 8 y 20 caracteres")
    private String passwordHash;

    private int energy;
    private Timestamp lastEnergyRefill;
    private int pointsUser;

    @OneToMany // Relación de uno a muchos con UserCharacter
    private List <UserCharacter> character;

    @OneToMany // Relación de uno a muchos con Message enviado
    private List <Message> messageSent;

    @OneToMany // Relación de uno a muchos con Message recibido
    private List <Message> messageReceived;

    @OneToMany // Relación de uno a muchos con BattleResult
    private List <BattleResult> battleResult;

}
