package org.nkl;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pokemon> pk = new ArrayList<>();

        String pokemonAtq, pokemonDef;
        int pkAtq, pkDef;

        System.out.println("---- La batalla Pókemon ----\n");

        System.out.println("Pokémon de Ataque: ");
        pokemonAtq = sc.next();
        System.out.println("Ingrese el Ataque: ");
        pkAtq = sc.nextInt();

        pk.add(new Pokemon(pokemonAtq, "atq", pkAtq));

        System.out.println("Pokémon de Defensa: ");
        pokemonDef = sc.next();
        System.out.println("Ingrese la Defensa: ");
        pkDef = sc.nextInt();

        pk.add(new Pokemon(pokemonDef, "def", pkDef));


//        System.out.println("Pokemon de defensa");

    }
}