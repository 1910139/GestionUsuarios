/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.Serializable;

/**
 *
 * @author franc
 */
//la clase tiene q ser serializable
public class Persona implements Serializable
{
    private String nombre;
    private String nif;
    private String email;
    private String tlf;

    public Persona(String nombre, String nif, String email, String tlf)
    {
        this.nombre = nombre;
        this.nif = nif;
        this.email = email;
        this.tlf = tlf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }
    

    //generar code toString
    @Override
    public String toString() 
    {
        return "Persona{" + "nombre=" + nombre + ", nif=" + nif + ", email=" + email + ", tlf=" + tlf + '}';
    }
}


