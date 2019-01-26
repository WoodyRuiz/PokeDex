/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andres
 */
public class PokeDex
{
    int number;
    String name, height, weight, biography, ability, abilityTwo, typeOne, typeTwo;

    public PokeDex(int number, String name, String height, String weight, String biography, String ability, String abilityTwo, String typeOne, String typeTwo) 
    {
        this.number = number;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.biography = biography;
        this.ability = ability;
        this.abilityTwo = abilityTwo;
        this.typeOne = typeOne;
        this.typeTwo = typeTwo;
    }

    public int getNumber() 
    {
        return number;
    }

    public String getName() 
    {
        return name;
    }

    public String getHeight() 
    {
        return height;
    }

    public String getWeight()
    {
        return weight;
    }

    public String getBiography() 
    {
        return biography;
    }

    public String getAbility() 
    {
        return ability;
    }

    public String getAbilityTwo() 
    {
        return abilityTwo;
    }
    
    public String getTypeOne()
    {
        return typeOne;
    }
    
    public String getTypeTwo()
    {
        return typeTwo;
    }
    public void main(String[] args) throws FileNotFoundException 
    {
    
    }
    
}
