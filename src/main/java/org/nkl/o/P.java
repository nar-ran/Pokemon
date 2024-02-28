package org.nkl.o;
// Archivo de prueba

import java.sql.Array;

public class P {
    double danio, efectividad;
    String pokemonesT[] = {"agua", "fuego", "planta", "electrico"};


    // Codigo de prueba con un Mapa
//        Map<String, Double> mapa = new HashMap<>(Map.of());
//
//        mapa.put("agua", Map.of("agua", 1.0,
//                                "fuego", 0.5,
//                                "planta", 2.0,
//                                "electrico",2.0
//                )
//        );
//        mapa.put("fuego", Map.of("agua", 2, "fuego", 0.5, "planta", 0.5, "electrico", 1));
//        mapa.put("planta", Map.of("agua", 2, "fuego", 2, "planta", 0.5, "electrico", 1));
//        mapa.put("electrico", Map.of("agua", 1, "fuego", 1, "planta", 0.5, "electrico", 0.5));

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
