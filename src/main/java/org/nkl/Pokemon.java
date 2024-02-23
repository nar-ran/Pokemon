package org.nkl;

public class Pokemon {
    private String tipo;
    private String knd;
    private int attr;

    public Pokemon(String tipo, String knd, int attr) {
        this.tipo = tipo;
        this.knd = knd;
        this.attr = attr;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getKnd() {
        return knd;
    }

    public void setKnd(String knd) {
        this.knd = knd;
    }

    public int getAttr() {
        return attr;
    }

    public void setAttr(int attr) {
        this.attr = attr;
    }
}
