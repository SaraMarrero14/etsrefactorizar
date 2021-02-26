/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.refactorizar;

import java.util.Scanner;

/**
 *
 * @author 1cfgs
 */
public class alumno2 {
        public String nombre;
       public String apellidos;
       public String dni;
       public alumno(){
       }
   public static void main(String []args){
       alumno objeto=new alumno();
       Scanner teclado=new Scanner(System.in);
       System.out.println("introduce el nombre");
       objeto.nombre=teclado.nextLine();
       System.out.println("introduce el apellido");
       objeto.apellidos=teclado.nextLine();
       System.out.println("introduce el dni");
       objeto.dni=teclado.nextLine();
       System.out.println("alumno:"+objeto.nombre+"apellidos"+objeto.apellidos+"dni"+objeto.dni);
   } 
}
