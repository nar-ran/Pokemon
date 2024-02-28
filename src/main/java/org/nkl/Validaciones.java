package org.nkl;

public class Validaciones {
    public boolean valRango(double att){
        if(!(att > 0 && att <= 100)){
            System.err.println("El ataque y la defensa deben estar dentro del rango permitido (1-100)");
            return true;
        }
        return false;
    }

    public boolean valPokemon(String pk){
        try{
            PkType.valueOf(pk);
            return false;
        }catch (IllegalArgumentException e){
            return true;
        }
    }
}
