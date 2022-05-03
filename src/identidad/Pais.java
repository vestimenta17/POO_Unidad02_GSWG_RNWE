/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identidad;

import java.util.ArrayList;
public class Pais {
    private String nombre;
    private int habitantes;
    private String etnia;
    private ArrayList<Provincias> provinciaList;

    public Pais(String nombre, int habitantes, String etnia) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.etnia = etnia;
    }

    

    public String getNombre() {
        return nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }
    
}
