/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uptlax.Practica10;

/**
 *
 * @author Evelin Rojas Garcia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Archivo archivo = new Archivo("archivos/personas.txt");
        String temp = archivo.leer();
        System.out.println(temp);
        
        archivo.escribir("archivos/nuevo_archivo.txt","Esto es nuevo",false);
        
        Persona persona=new Persona();
        persona.setNombre("Evelin");
        persona.setCompania("Universidad Poliecnica de Tlaxcala");
        persona.setId("1");
        persona.setEdad("19");
             
        archivo.escribirObjeto(persona"archivos/persona.data");
        
        Persona personaDesdeArchivo = archivo.leerObjecto("archivos/persona.data");
        System.out.println(personaDesdeArchivo.getNombre());
        System.out.println(personaDesdeArchivo.getCompania());
    }
    
}
