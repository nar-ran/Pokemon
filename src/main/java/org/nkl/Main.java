package org.nkl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        String pokemonAtq, pokemonDef;
        int pkAtq, pkDef;

        System.out.println("- - - - La batalla Pókemon - - - -");
        System.out.println("Bienvenid@ a la batalla, eliga los Pókemones...");

        do{
            System.out.println("Pókemones Disponibles:  \n⭒ Agua \n⭒ Fuego " +
                    "\n⭒ Planta \n⭒ Eléctrico \n- - - - - - - - - - - - - - - - \n");
            try{
                System.out.println("Pokémon de Ataque: ");
                pokemonAtq = sc.next();
                System.out.println("Ingrese el Ataque: (1-100)");
                pkAtq = sc.nextInt();

                System.out.println("Pokémon de Defensa: ");
                pokemonDef = sc.next();
                System.out.println("Ingrese la Defensa: (1-100)");
                pkDef = sc.nextInt();

                if((pkAtq > 0 && pkAtq <= 100) && (pkDef > 0 && pkDef < 100)){
                    CalcDan cl = new CalcDan();
                    cl.cal(pokemonAtq.toLowerCase(), pkAtq, pokemonDef.toLowerCase(), pkDef);
                }else{
                    System.err.println("El ataque y la defensa deben estar dentro del rango permitido (1-100)");
                }
            }catch (InputMismatchException e){
                System.err.println("El ataque y la defensa deben ser números.");
                continuar = sc.next().equals("1");
            }

            System.out.println("\n- - - - - Menú - - - - -" +
                    "\n1. Iniciar batalla nueva " +
                    "\nOtra tecla para salir" +
                    "\n- - - - - - - - - - - - -");
            continuar = sc.next().equals("1");
        }while(continuar);
    }
}