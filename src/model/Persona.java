/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author FabricioNicolas
 */
public class Persona {
    private String Nombre;
    private String Apellido;
    private String Direccion;

    public Persona(String Nombre, String Apellido, String Direccion) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Direccion=" + Direccion + '}';
    }
    
    

}
