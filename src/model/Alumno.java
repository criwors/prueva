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
public class Alumno extends Persona {
    private int IdAlumno;
    private int AnnioIngresado;

    public Alumno(String Nombre, String Apellido, String Direccion) {
        super(Nombre, Apellido, Direccion);
    }

    public int getIdAlumno() {
        return IdAlumno;
    }

    public void setIdAlumno(int IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    public int getAnnioIngresado() {
        return AnnioIngresado;
    }

    public void setAnnioIngresado(int AnnioIngresado) {
        this.AnnioIngresado = AnnioIngresado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "IdAlumno=" + IdAlumno + ", AnnioIngresado=" + AnnioIngresado + '}';
    }
    
    
    
}
