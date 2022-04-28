/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad_02;

/**
 *
 * @author HP
 */
public class PrincipalComposicion {
    public static void main(String[] args){
        Revista r= new Revista("La semana del estudiante","AblaYala",
                "45665412IAS");
        r.crear("El agua es vida", 2785, "Si es vida........",0);
        r.crear("El agua es vida", 2785, "Si es vida........",0);
        r.crear("El agua es vida", 2785, "Si es vida........",0);

        System.out.println(r);
       
    }
    
}
