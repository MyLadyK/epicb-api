package com.epicbattle.epicb_api.model;

import jakarta.persistence.*;

@Entity
@Table (name = "characters")
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


    //G&S
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getSpecialCharacter() {
        return specialCharacter;
    }

    public void setSpecialCharacter(double specialCharacter) {
        this.specialCharacter = specialCharacter;
    }

    public double getIntelligenceCharacter() {
        return intelligenceCharacter;
    }

    public void setIntelligenceCharacter(double intelligenceCharacter) {
        this.intelligenceCharacter = intelligenceCharacter;
    }

    public double getStaminaCharacter() {
        return staminaCharacter;
    }

    public void setStaminaCharacter(double staminaCharacter) {
        this.staminaCharacter = staminaCharacter;
    }

    public double getSpeedCharacter() {
        return speedCharacter;
    }

    public void setSpeedCharacter(double speedCharacter) {
        this.speedCharacter = speedCharacter;
    }

    public double getDefenseCharacter() {
        return defenseCharacter;
    }

    public void setDefenseCharacter(double defenseCharacter) {
        this.defenseCharacter = defenseCharacter;
    }

    public double getAttackCharacter() {
        return attackCharacter;
    }

    public void setAttackCharacter(double attackCharacter) {
        this.attackCharacter = attackCharacter;
    }

    public double getHealthCharacter() {
        return healthCharacter;
    }

    public void setHealthCharacter(double healthCharacter) {
        this.healthCharacter = healthCharacter;
    }

    public String getUniversCharacter() {
        return universCharacter;
    }

    public void setUniversCharacter(String universCharacter) {
        this.universCharacter = universCharacter;
    }

    public String getCategoryCharacter() {
        return categoryCharacter;
    }

    public void setCategoryCharacter(String categoryCharacter) {
        this.categoryCharacter = categoryCharacter;
    }

    public String getNameCharacter() {
        return nameCharacter;
    }

    public void setNameCharacter(String nameCharacter) {
        this.nameCharacter = nameCharacter;
    }

    public int getIdCharacter() {
        return idCharacter;
    }

    public void setIdCharacter(int idCharacter) {
        this.idCharacter = idCharacter;
    }
}
