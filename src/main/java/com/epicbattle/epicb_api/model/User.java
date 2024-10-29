package com.epicbattle.epicb_api.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;


@Entity //Esta clase es una entidad en la base de datos
@Table(name = "users") //Cambia el nombre de la tabla a users, porque user es una palabra reservada en H2
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

    @OneToMany // Relación de uno a muchos con Message (enviado)
    private List <Message> messageSent;

    @OneToMany // Relación de uno a muchos con Message (recibido)
    private List <Message> messageReceived;

    @OneToMany // Relación de uno a muchos con BattleResult
    private List <BattleResult> battleResult;


    //Constructor vacío necesario para JPA
    public User() {

    }

    //Constructor completo
    public User(int idUser, String nameUser, String mailUser, String passwordHash, int energy, Timestamp lastEnergyRefill) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.mailUser = mailUser;
        this.passwordHash = passwordHash;
        this.energy = energy;
        this.lastEnergyRefill = lastEnergyRefill;
    }

    //G&S


    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getMailUser() {
        return mailUser;
    }

    public void setMailUser(String mailUser) {
        this.mailUser = mailUser;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public Timestamp getLastEnergyRefill() {
        return lastEnergyRefill;
    }

    public void setLastEnergyRefill(Timestamp lastEnergyRefill) {
        this.lastEnergyRefill = lastEnergyRefill;
    }

    public List<UserCharacter> getCharacter() {
        return character;
    }

    public void setCharacter(List<UserCharacter> character) {
        this.character = character;
    }

    public List<Message> getMessageSent() {
        return messageSent;
    }

    public void setMessageSent(List<Message> messageSent) {
        this.messageSent = messageSent;
    }

    public List<Message> getMessageReceived() {
        return messageReceived;
    }

    public void setMessageReceived(List<Message> messageReceived) {
        this.messageReceived = messageReceived;
    }

    public List<BattleResult> getBattleResult() {
        return battleResult;
    }

    public void setBattleResult(List<BattleResult> battleResult) {
        this.battleResult = battleResult;
    }


    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", nameUser='" + nameUser + '\'' +
                ", mailUser='" + mailUser + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", energy=" + energy +
                ", lastEnergyRefill=" + lastEnergyRefill +
                ", character=" + character +
                ", messageSent=" + messageSent +
                ", messageReceived=" + messageReceived +
                ", battleResult=" + battleResult +
                '}';
    }
}
