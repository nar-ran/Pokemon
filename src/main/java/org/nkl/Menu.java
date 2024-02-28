package org.nkl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void mostrar(){
        CalcDan cn = new CalcDan();
        Validaciones v = new Validaciones();

        String pokemonAtq, pokemonDef;
        int pkAtq, pkDef;

        do{
            System.out.println("Pókemones Disponibles:");

            for (PkType pkEnum: PkType.values()){
                System.out.println("⭒ ".concat(pkEnum.toCapitalizeString()));
            }

            do{
                System.out.println("Pokémon de Ataque: ");
                pokemonAtq = sc.next();
                if(v.valPokemon(pokemonAtq.toUpperCase())){
                    System.err.println("Eliga un pokemon de Ataque valido");

                    System.out.println("Pókemones Disponibles:");
                    for (PkType pkEnum: PkType.values()){
                        System.out.println("⭒ ".concat(pkEnum.toCapitalizeString()));
                    }
                }
            }while(v.valPokemon(pokemonAtq.toUpperCase()));

            do {
                System.out.println("Ingrese el Ataque: (1-100)");
                while (!sc.hasNextInt()) {
                    System.err.println("El ataque debe ser un número entero.");
                    System.out.println("Ingrese el Ataque: (1-100)");
                    sc.next(); // Limpiar el buffer del escáner
                }
                pkAtq = sc.nextInt();
            }while (v.valRango(pkAtq));

            do{
                System.out.println("Pokémon de Defensa: ");
                pokemonDef = sc.next();
                if(v.valPokemon(pokemonDef.toUpperCase())){
                    System.err.println("Eliga un pokemon de Defensa valido");

                    System.out.println("Pókemones Disponibles:");
                    for (PkType pkEnum: PkType.values()){
                        System.out.println("⭒ ".concat(pkEnum.toCapitalizeString()));
                    }
                }
            }while(v.valPokemon(pokemonDef.toUpperCase()));

            do{
                System.out.println("Ingrese la Defensa: (1-100)");
                while (!sc.hasNextInt()) {
                    System.err.println("La defensa debe ser un número entero.");
                    System.out.println("Ingrese la Defensa: (1-100)");
                    sc.next();
                }
                pkDef = sc.nextInt();
            }while(v.valRango(pkDef));

            cn.cal(pokemonAtq.toLowerCase(), pkAtq, pokemonDef.toLowerCase(), pkDef);
        }while(menu());
    }

    public boolean menu(){
        System.out.println("""

                    - - - - - Menú - - - - -
                    1. Iniciar batalla nueva
                    Otra tecla para salir
                    - - - - - - - - - - - - -""");

        return sc.next().equals("1");
    }
}
