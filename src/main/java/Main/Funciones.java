/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Class.Persona;
import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Funciones 
{
    private ArrayList<Persona> personas = new ArrayList<>();
    

    public Funciones(ArrayList<Persona> personas) 
    {
        this.personas = personas;
    }
    
    //Funciones funcion = new Funciones();
    public Funciones() {}
    
    //añadir usuarios
    public void anadirUser(Persona nuevaPersona)
    {
        personas.add(nuevaPersona);
    }
    
    //elimianr usuario por nombre
    public void eliminarUser(String personaAElimianr)
    {
        Persona elegido = null;
        for (Persona p : personas)
        {
            if(p.getNombre().equals(personaAElimianr))
            {
               elegido = p;
            }
            if(elegido == null)
            {
                System.out.println("Usuario no encontrado");
            }else
            {
                personas.remove(elegido);
            }
        }
    }
    
    //modificar usuario 
    public void modificarUser(Persona personaNewDate)
    {
        for(Persona p : personas)
        {
            if(p.getNombre().equals(personaNewDate.getNombre()))
            {
                p.setNif(personaNewDate.getNif());
                p.setEmail(personaNewDate.getEmail());
                p.setTlf(personaNewDate.getTlf());
            }
        }
    }
    
    //Buscar datos usuarios
    public Persona buscarUser (String encomtrarUser) 
    {
        for(Persona p : personas)
        {
            if(p.getNombre().equals(encomtrarUser))
            {
                return p;
            }
        }
        return null;
    }
    
    //Ver todos los usuarios
    public void verUsuarios()
    {
        for(Persona p : personas)
        {
            System.out.println(p.toString());
        }    
    }
      
    public ArrayList<Persona> getPersonas() 
    {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) 
    {
        this.personas = personas;
    }
} 