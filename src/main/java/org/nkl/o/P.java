package org.nkl.o;

import java.sql.Array;

public class P {
    double danio, efectividad;
    String pokemonesT[] = {"agua", "fuego", "planta", "electrico"};


    public void cal(String pokemonAtaq, double atq, String pokemonDef, double def) {
        if (pokemonDef.equals("agua") || pokemonDef.equals("fuego") || pokemonDef.equals("planta") || pokemonDef.equals("electrico")) {
            switch (pokemonAtaq) {
                // Debe haber una manera de hacerlo mejor con un for
                case "agua":
                    if (pokemonDef.equals("agua")) {
                        efectividad = 1;
                    } else if (pokemonDef.equals("fuego")) {
                        efectividad = 0.5;
                    } else if (pokemonDef.equals("planta") || pokemonDef.equals("electrico")) {
                        efectividad = 2;
                    }
                break;

                case "fuego":
                    if (pokemonDef.equals("agua")) {
                        efectividad = 2;
                    } else if (pokemonDef.equals("fuego") || pokemonDef.equals("planta")) {
                        efectividad = 0.5;
                    } else if (pokemonDef.equals("electrico")) {
                        efectividad = 1;
                    }
                break;

                case "planta":
                    if (pokemonDef.equals("agua") || pokemonDef.equals("fuego")) {
                        efectividad = 2;
                    } else if (pokemonDef.equals("planta")) {
                        efectividad = 0.5;
                    } else if (pokemonDef.equals("electrico")) {
                        efectividad = 1;
                    }
                break;

                case "electrico":
                    if (pokemonDef.equals("agua") || pokemonDef.equals("fuego")) {
                        efectividad = 1;
                    } else if (pokemonDef.equals("planta") || pokemonDef.equals("electrico")) {
                        efectividad = 0.5;
                    }
                break;

                default:
                    System.err.println("Eliga un Pókemon de ataque valido.");
                    return;
            }
        } else {
            System.err.println("Eliga un Pókemon de defensa valido.");
            return;
        }
    }
}
