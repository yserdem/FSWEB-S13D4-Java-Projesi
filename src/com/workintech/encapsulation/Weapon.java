package com.workintech.encapsulation;

public enum Weapon {
    AR15("AR-15"),
    AK47("AK-47"),
    GLOCK("GLOCK 17"),
    BERETTA("Beretta 92"),
    RUGER("Ruger LCR");

    final String weaponName;

    Weapon(String weaponName){
        this.weaponName = weaponName;
    }



}
