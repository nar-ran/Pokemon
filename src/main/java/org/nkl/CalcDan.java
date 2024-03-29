package org.nkl;

import java.text.DecimalFormat;

public class CalcDan {
    private double efectividad;

    public void cal(String pokemonAtaq, double atq, String pokemonDef, double def) {
        switch (pokemonAtaq) {
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
                switch (pokemonDef) {
                    case "agua", "fuego" -> efectividad = 1;
                    case "planta", "electrico" -> efectividad = 0.5;
                }
                break;
        }

        double danio = 50 * (atq / def) * efectividad;
        String tpEfe = efectividad == 2 ? "Súper Efectivo" : efectividad == 1 ? "Neutral" : "No es muy efectivo";
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("El daño causado por el Pókemon de "+ pokemonAtaq +" al Pókemon de "+pokemonDef+" durante la batalla fue de: " + df.format(danio));
        System.out.println("El ataque tuvo una efectividad del " + efectividad + " (" + tpEfe + ")");
    }

}