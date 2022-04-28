/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad_02;

import java.util.ArrayList;

/**
 *
 * @author morti
 */
public class ParqueaderoComposicion {
    
    private String nombre;
    private String direccion;
    private ArrayList<Auto> autoList;

    public ParqueaderoComposicion(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.autoList = new ArrayList<>();
    }
    
    public Auto crear(Auto auto){
            this.autoList.add(auto);
            return auto;
    }
       
}

