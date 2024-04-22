package com.prog03.figuras;

public class Rectangulo {
    private int altura;
    private int base;
    public Rectangulo() {
        this.altura = 0;
        this.base = 0;
    }
    public void setterBase(int base) {
        this.base = base;
    }
    public void setterAltura(int altura) {
        this.altura = altura;
    }
    public int getBase() {
        return base;
    }
    public int getAltura() {
        return altura;
    }
    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
    public float getArea() {
        return altura * base;
    }
    public String toString() {
        return "El Area es\s" + getArea() + "\sy la altura es\s" + altura;
    }
    public boolean isCuadrado() {
        return base == altura;
    }

}
