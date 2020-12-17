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
public class Profesor extends Persona {
    private int IdProfesor;
    private String titulo;
    private String Departamento;
    
    public Profesor(String Nombre, String Apellido, String Direccion) {
        super(Nombre, Apellido, Direccion);
    }

    public int getIdProfesor() {
        return IdProfesor;
    }

    public void setIdProfesor(int IdProfesor) {
        this.IdProfesor = IdProfesor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" + "IdProfesor=" + IdProfesor + ", titulo=" + titulo + ", Departamento=" + Departamento + '}';
    }
    
    
}
