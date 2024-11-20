package com.epicbattle.epicb_api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data // G&S, toString, equals y hashCode
@NoArgsConstructor // Constructor vacío
@AllArgsConstructor // Constructor completo
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @NotNull(message = "El mensaje no puede estar en blanco")
    @Size(min = 1, max = 1248, message = "El mensaje debe tener entre 1 y 1248 caracteres")
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}


