/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Class.Persona;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author franc
 */
public class GestionUserProo {

   public static void main(String[] args) throws IOException 
    {
        //CARGA DE DATOS DE FICHEROS
        //funcion

        boolean menuInicio = true;
        Scanner scanner = new Scanner(System.in);
        
        
        //En Funciones  //public Funciones(ArrayList<Persona> persona
        Funciones funcion = new Funciones();
        
       try 
       {
           //Lectura
           FileInputStream input = new FileInputStream("persona.dat");
           ObjectInputStream inputObject = new ObjectInputStream(input);
                    //clase   //objeto            //clase
           ArrayList<Persona> listado = (ArrayList<Persona>) inputObject.readObject();
           funcion.setPersonas(listado);
           input.close();
        } catch (FileNotFoundException ex) {
        } catch (ClassNotFoundException ex) {
           Logger.getLogger(GestionUserProo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while (menuInicio)
        {
            System.out.println("1. Añadir usuario");
            System.out.println("2. Eliminar usuario");
            System.out.println("3. Modificar datos usuario");
            System.out.println("4. Buscar datos usuario");
            System.out.println("5. Ver todos los usuarios");
            System.out.println("6. Salir");
            System.out.print("Que quieres hacer: ");
            
            int inputUser = scanner.nextInt();
            
            switch (inputUser)
            {
                case 1: // Añadir usuario
                    
                    //error no deja meter el nombre de la persona
                    System.out.println("MENU AÑADIR USUARIOS");
                    
                    System.out.print("Di el nombre de la persona: ");
                    String nombreUser = scanner.next();
                    scanner.nextLine();
                    
                    System.out.print("Di el NIF de " + nombreUser + ": "); 
                    String nifUser = scanner.next();
                    scanner.nextLine();
                    
                    System.out.print("Di el email de " + nombreUser + ": ");
                    String emailUser = scanner.next();
                    scanner.nextLine();
                    
                    System.out.print("Di el numero de telefono de " + nombreUser + ": ");
                    String tlfUser = scanner.next();
                    scanner.nextLine();
                    
                    funcion.anadirUser(new Persona(nombreUser, nifUser, emailUser, tlfUser));
                    System.out.println("Usuario añadido con exito");
                    funcion.verUsuarios();
                    break;
                    
                case 2: // Eliminar usuario
                    System.out.print("Di el nombre de la persona que dese eliminar: ");
                    String nombreUserEliminar = scanner.nextLine();
                    scanner.nextLine();
                    funcion.eliminarUser(nombreUserEliminar);
                    break;
                    
                case 3: // Modificar datos usuario
                    
                    break;
                    
                case 4: // Buscar datos usuario
                    System.out.print("Di el nombre de la persona que dese buscar: ");
                    String nombreUserBuscar = scanner.nextLine();
                    scanner.nextLine();
                    funcion.buscarUser(nombreUserBuscar);
                    break;
                    
                case 5: // Ver todos los usuarios
                    funcion.verUsuarios();
                    break;
                    
                case 6: // Salir
                    System.out.println("Saliendo...");
                    {
                        try 
                        {
                            FileOutputStream output = new FileOutputStream("persona.dat");     
                            //para objetos
                            ObjectOutputStream outputObject = new ObjectOutputStream(output);
                                              //CAMBIAR --> objeto principal.get ArrayList
                            outputObject.writeObject(funcion.getPersonas());
                            output.close();


                        } 
                        catch (FileNotFoundException ex) 
                        {
                            Logger.getLogger(GestionUserProo.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) 
                        {
                        Logger.getLogger(GestionUserProo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    menuInicio = false;
                    break;
 
                default:
                    System.out.println("Respuesta invalida");
//                    menuInicio = false;
            }
                    
            
        }
    }
}
