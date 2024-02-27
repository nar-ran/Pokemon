package org.nkl;

public class Validaciones {
    Menu m = new Menu();

    public void valAtt(double att){
        if(!(att > 0 && att <= 100)){
            System.err.println("El ataque y la defensa deben estar dentro del rango permitido (1-100)");
            m.menu();
        }
    }

    public Object valPk(String pk){
        try{
            PkType.valueOf(pk);
        }catch (IllegalArgumentException e){
            System.err.println(e);
            return true;
        }
        return null;
    }
}
