
package com.mycompany.figurasgeometricas;



public class FiguraGeometrica {
    protected String nombre;
    protected String color;

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public double obtenerArea() {
        return 0; 
    }

    public double obtenerPerimetro() {
        return 0; 
    }

    public String getNombre() {
        return nombre; }

    public void setNombre(String nombre) {
        this.nombre = nombre;  }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}