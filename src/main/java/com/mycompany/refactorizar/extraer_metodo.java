/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.refactorizar;

/**
 *
 * @author 1cfgs
 */
public class extraer_metodo {
     public void imprimirTodo(){
        imprimirbanner();
        String nombre="hola";
        int cantidad=8;
        imprimirgetdetalles(nombre);
    }

    public void imprimirgetdetalles(String nombre) {
        System.out.println("nombre: "+ nombre);
        System.out.println("cantidad "+getCargoPendiente());
    }

    private void imprimirbanner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getCargoPendiente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
