/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad_02;

/**
 *
 * @author HP
 */
public class Revista {
    private String nombre;
    private String editor;

    public Revista(String nombre, String editor, String isbn) {
        this.nombre = nombre;
        this.editor = editor;
        this.isbn = isbn;
    }
    private String isbn;

    public Revista(String nombre) {
        this.nombre = nombre;
    }
    
    
}
