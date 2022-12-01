/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ezequ
 */
public class Informacion {
    private String nombre, edad, celular;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Informacion(String nombre, String edad, String celular) {
        this.nombre = nombre;
        this.edad = edad;
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Informacion{" + "nombre=" + nombre + ", edad=" + edad + ", celular=" + celular + '}';
    }
    
    
    
}
