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
public class Pokemon {
    
    
 int pokemonId;
 String pokemonName;
 PokemonAbility pokemonAbility;
 int pokemonHP;
 int pokemonATK;
 int pokemonDEF;
 int pokemonSPATK;
 int pokemonSPDEF;
 int pokemonSpeed;

    public Pokemon(int pokemonId, String pokemonName, PokemonAbility pokemonAbility, int pokemonHP, int pokemonATK, int pokemonDEF, int pokemonSPATK, int pokemonSPDEF, int pokemonSpeed) {
        this.pokemonId = pokemonId;
        this.pokemonName = pokemonName;
        this.pokemonAbility = pokemonAbility;
        this.pokemonATK = pokemonATK;
        this.pokemonDEF = pokemonDEF;
        this.pokemonSPATK = pokemonSPATK;
        this.pokemonSPDEF = pokemonSPDEF;
        this.pokemonSpeed = pokemonSpeed;
    }

    public int getPokemonHP() {
        return pokemonHP;
    }

    public void setPokemonHP(int pokemonHP) {
        this.pokemonHP = pokemonHP;
    }

 
 
 
 
 
    public int getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(int pokemonId) {
        this.pokemonId = pokemonId;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public PokemonAbility getPokemonAbility() {
        return pokemonAbility;
    }

    public void setPokemonAbility(PokemonAbility pokemonAbility) {
        this.pokemonAbility = pokemonAbility;
    }

    public int getPokemonATK() {
        return pokemonATK;
    }

    public void setPokemonATK(int pokemonATK) {
        this.pokemonATK = pokemonATK;
    }

    public int getPokemonDEF() {
        return pokemonDEF;
    }

    public void setPokemonDEF(int pokemonDEF) {
        this.pokemonDEF = pokemonDEF;
    }

    public int getPokemonPATK() {
        return pokemonSPATK;
    }

    public void setPokemonPATK(int pokemonSPATK) {
        this.pokemonSPATK = pokemonSPATK;
    }

    public int getPokemonSPDEF() {
        return pokemonSPDEF;
    }

    public void setPokemonSPDEF(int pokemonSPDEF) {
        this.pokemonSPDEF = pokemonSPDEF;
    }

    public int getPokemonSpeed() {
        return pokemonSpeed;
    }

    public void setPokemonSpeed(int pokemonSpeed) {
        this.pokemonSpeed = pokemonSpeed;
    }
    
    
    
    
    
    
    public int attackPokemon(Character character, Weapon weapon, Pokemon pokemon){
        return 0;
    }
    
}
