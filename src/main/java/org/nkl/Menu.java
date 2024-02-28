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

            try{
                System.out.println("Pokémon de Ataque: ");
                pokemonAtq = sc.next();
                if(v.valPk(pokemonAtq.toUpperCase())){
                    System.err.println("Eliga un pokemon de Ataque valido");
                    continue;
                }

                System.out.println("Ingrese el Ataque: (1-100)");
                pkAtq = sc.nextInt();
                if(v.valAtt(pkAtq)) { continue; };

                System.out.println("Pokémon de Defensa: ");
                pokemonDef = sc.next();
                if(v.valPk(pokemonDef.toUpperCase())){
                    System.err.println("Eliga un pokemon de Defensa valido");
                    continue;
                }

                System.out.println("Ingrese la Defensa: (1-100)");
                pkDef = sc.nextInt();
                if(v.valAtt(pkDef)) { continue; };

                cn.cal(pokemonAtq.toLowerCase(), pkAtq, pokemonDef.toLowerCase(), pkDef);
            }catch (InputMismatchException e){
                System.err.println("El ataque y la defensa deben ser números.");
                boolean continuar = sc.next().equals("1");
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
