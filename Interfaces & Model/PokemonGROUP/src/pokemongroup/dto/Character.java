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
public class Character {
    
    
    String  characterName;
    int characterHP;
    int characterMaxHP;
//    List<ItemDTO> inventory = new ArrayList<>():
    int pokeCoins;
    Weapon weaponChoice;
    int currentLevel;

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getCharacterHP() {
        return characterHP;
    }

    public void setCharacterHP(int characterHP) {
        this.characterHP = characterHP;
    }

    public int getCharacterMaxHP() {
        return characterMaxHP;
    }

    public void setCharacterMaxHP(int characterMaxHP) {
        this.characterMaxHP = characterMaxHP;
    }

    public int getPokeCoins() {
        return pokeCoins;
    }

    public void setPokeCoins(int pokeCoins) {
        this.pokeCoins = pokeCoins;
    }

    public Weapon getWeaponChoice() {
        return weaponChoice;
    }

    public void setWeaponChoice(Weapon weaponChoice) {
        this.weaponChoice = weaponChoice;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }
    
    
public void startBattle(Character character, Pokemon pokemon){
    
}



// use an item stored in inventory
// get from inventory by the item's ID
public void useItem(int inventoryItemId){
    
}

// update the character's HP
public void updateStats(int characterHP){
    
    this.characterHP += characterHP;
    
}
    
    
}



