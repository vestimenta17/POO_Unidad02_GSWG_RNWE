/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad_02;

/**
 *
 * @author HP
 */
public class Articulo {
    private String nombre;
    private int numeroPalabras;
    private String resumen;

    public Articulo(String nombre) {
        this.nombre = nombre;
    }
    public Articulo(String nombre, int numeroPalabras, String resumen) {
        this.nombre = nombre;
        this.numeroPalabras = numeroPalabras;
        this.resumen = resumen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPalabras() {
        return numeroPalabras;
    }

    public String getResumen() {
        return resumen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroPalabras(int numeroPalabras) {
        this.numeroPalabras = numeroPalabras;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombre=" + nombre + ", numeroPalabras=" + 
                numeroPalabras + ", resumen=" + resumen + '}';
    }
    
}
