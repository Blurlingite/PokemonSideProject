/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongroup.dto;

/**
 *
 * @author vishnukdawah
 */
public class Weapon {
    
    int weaponId;
    String weaponName;
    WeaponAbility weaponAbility;
    int weaponATK;
    int weaponDEF;
    int weaponSPATK;
    int weaponSPDEF;
    int weaponSpeed;
    int weaponDurability;

    public int getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(int weaponId) {
        this.weaponId = weaponId;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public WeaponAbility getWeaponAbility() {
        return weaponAbility;
    }

    public void setWeaponAbility(WeaponAbility weaponAbility) {
        this.weaponAbility = weaponAbility;
    }

    public int getWeaponATK() {
        return weaponATK;
    }

    public void setWeaponATK(int weaponATK) {
        this.weaponATK = weaponATK;
    }

    public int getWeaponDEF() {
        return weaponDEF;
    }

    public void setWeaponDEF(int weaponDEF) {
        this.weaponDEF = weaponDEF;
    }

    public int getWeaponSPATK() {
        return weaponSPATK;
    }

    public void setWeaponSPATK(int weaponSPATK) {
        this.weaponSPATK = weaponSPATK;
    }

    public int getWeaponSPDEF() {
        return weaponSPDEF;
    }

    public void setWeaponSPDEF(int weaponSPDEF) {
        this.weaponSPDEF = weaponSPDEF;
    }

    public int getWeaponSpeed() {
        return weaponSpeed;
    }

    public void setWeaponSpeed(int weaponSpeed) {
        this.weaponSpeed = weaponSpeed;
    }

    public int getWeaponDurability() {
        return weaponDurability;
    }

    public void setWeaponDurability(int weaponDurability) {
        this.weaponDurability = weaponDurability;
    }

    
    
    
    public int attackPokemon(Character charcter, Weapon weapon, Pokemon pokemon){
        
        
        
        return 0;
    }

    public Weapon updateWeaponStats(Weapon weapon){
        
        return weapon;
        
    }
    
    
    
}
