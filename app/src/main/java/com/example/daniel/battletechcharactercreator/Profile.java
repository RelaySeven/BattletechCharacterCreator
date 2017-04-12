package com.example.daniel.battletechcharactercreator;

import java.util.Date;

/**
 * Created by Daniel on 4/11/2017.
 */

public class Profile extends MainActivity {
    private String charName;
    private String eyeColor;
    private String pName;
    private String hairColor;
    private int weight = 0;
    private int height = 0;
    private Date birthDate;
    private Date campaignDate;

    public Date getCampaignDate() {
        return campaignDate;
    }

    public void setCampaignDate(Date campaignDate) {
        this.campaignDate = campaignDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }






}
