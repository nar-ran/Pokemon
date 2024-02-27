package org.nkl;

public enum PkType {
    AGUA, FUEGO, PLANTA, ELECTRICO;

    public String toCapitalizeString() {
        String name = this.toString();
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public String toLowerCaseString() {
        return this.toString().toLowerCase();
    }
}
