/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identidad;


public class Provincias {
    private String nombre;
    private String etnia;
    private int cantones;

    public Provincias(String nombre, String etnia, int cantones) {
        this.nombre = nombre;
        this.etnia = etnia;
        this.cantones = cantones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEtnia() {
        return etnia;
    }

    public int getCantones() {
        return cantones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public void setCantones(int cantones) {
        this.cantones = cantones;
    }
    
    
}
