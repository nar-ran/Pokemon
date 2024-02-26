package org.nkl;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void mostrar(){
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        CalcDan cn = new CalcDan();

        String pokemonAtq, pokemonDef;
        int pkAtq, pkDef;

        System.out.println("- - - - La batalla Pókemon - - - -");
        System.out.println("Bienvenid@ a la batalla, eliga los Pókemones...");

        do{
            System.out.println("Pókemones Disponibles:");

            for (PkType pkEnum: PkType.values()){
                System.out.println("⭒ ".concat(String.valueOf(pkEnum)));
            }

            try{
                System.out.println("Pokémon de Ataque: ");
                pokemonAtq = sc.next();
                cn.valPk(pokemonAtq);

                System.out.println("Ingrese el Ataque: (1-100)");
                pkAtq = sc.nextInt();
                cn.valAtt(pkAtq);

                System.out.println("Pokémon de Defensa: ");
                pokemonDef = sc.next();
                cn.valPk(pokemonDef);

                System.out.println("Ingrese la Defensa: (1-100)");
                pkDef = sc.nextInt();
                cn.valAtt(pkDef);

                cn.cal(pokemonAtq.toLowerCase(), pkAtq, pokemonDef.toLowerCase(), pkDef);
            }catch (InputMismatchException e){
                System.err.println("El ataque y la defensa deben ser números.");
                continuar = sc.next().equals("1");
            }

            System.out.println("""

                    - - - - - Menú - - - - -
                    1. Iniciar batalla nueva\s
                    Otra tecla para salir
                    - - - - - - - - - - - - -""");
            continuar = sc.next().equals("1");
        }while(continuar);
    }
}
