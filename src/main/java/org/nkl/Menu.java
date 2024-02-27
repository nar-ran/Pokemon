package org.nkl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void mostrar(){
        boolean continuar = true;

        CalcDan cn = new CalcDan();
        Validaciones v = new Validaciones();

        String pokemonAtq, pokemonDef;
        int pkAtq, pkDef;

        do{
            System.out.println("Pókemones Disponibles:");

            for (PkType pkEnum: PkType.values()){
                System.out.println("⭒ ".concat(pkEnum.toCapitalizeString()));
            }

            try{
                System.out.println("Pokémon de Ataque: ");
                pokemonAtq = sc.next();
                v.valPk(pokemonAtq.toUpperCase());
                PkType.valueOf(pokemonAtq.toUpperCase());

                System.out.println("Ingrese el Ataque: (1-100)");
                pkAtq = sc.nextInt();
                v.valAtt(pkAtq);

                System.out.println("Pokémon de Defensa: ");
                pokemonDef = sc.next();
                v.valPk(pokemonDef.toUpperCase());
                PkType.valueOf(pokemonDef.toUpperCase());

                System.out.println("Ingrese la Defensa: (1-100)");
                pkDef = sc.nextInt();
                v.valAtt(pkDef);

                cn.cal(pokemonAtq.toLowerCase(), pkAtq, pokemonDef.toLowerCase(), pkDef);
            }catch (IllegalArgumentException e2){
                System.err.println("Eliga un Pókemon de ataque valido.");
            }catch (InputMismatchException e){
                System.err.println("El ataque y la defensa deben ser números.");
                continuar = sc.next().equals("1");
            }

        }while(menu());
    }

    public boolean menu(){
        System.out.println("""

                    - - - - - Menú - - - - -
                    1. Iniciar batalla nueva\s
                    Otra tecla para salir
                    - - - - - - - - - - - - -""");

        return sc.next().equals("1");
    }
}
