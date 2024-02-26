package org.nkl;

import java.util.Arrays;

public class CalcDan{
    double danio, efectividad;
    public void cal(String pokemonAtaq, double atq, String pokemonDef, double def){
            switch (pokemonAtaq){
                case "agua":
                    switch (pokemonDef) {
                        case "agua" -> efectividad = 1;
                        case "fuego" -> efectividad = 0.5;
                        case "planta", "electrico" -> efectividad = 2;
                    }
                break;

                case "fuego":
                    switch (pokemonDef) {
                        case "agua" -> efectividad = 2;
                        case "fuego", "planta" -> efectividad = 0.5;
                        case "electrico" -> efectividad = 1;
                    }
                break;

                case "planta":
                    switch (pokemonDef) {
                        case "agua", "fuego" -> efectividad = 2;
                        case "planta" -> efectividad = 0.5;
                        case "electrico" -> efectividad = 1;
                    }
                break;

                case "electrico":
                    switch (pokemonDef){
                        case "agua", "fuego" -> efectividad = 1;
                        case "planta", "electrico" -> efectividad = 0.5;
                    }
                break;

                default:
                    System.err.println("Eliga un Pókemon de ataque valido.");
                return;
            }

        danio = 50*(atq/def)*efectividad;
        String tpEfe = efectividad == 2 ? "Súper Efectivo" : efectividad == 1 ? "Neutral" : "No es muy efectivo";
        System.out.println("El daño causado durante la batalla fue de: "+danio);
        System.out.println("El ataque tuvo una efectividad del x"+efectividad +" ("+tpEfe+")");
    }

    public void valAtt(double att){
        if(!(att > 0 && att <= 100)){
            System.err.println("El ataque y la defensa deben estar dentro del rango permitido (1-100)");
        }
    }

    public void valPk(String pk){
        for(PkType pkt : PkType.values()){
            if(!pk.equals(String.valueOf(pkt))){
                System.err.println("Eliga un Pókemon de ataque valido.");
                return;
            }
        }
    }

}