/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.co.uniminuto.generics;

/**
 *
 * @author Miguel
 */
public class Generic<T> {
    
    private T tipo;

    public Generic(T tipo) {
        this.tipo = tipo;
    }

    public T getTipo() {
        return tipo;
    }

    public void setTipo(T tipo) {
        this.tipo = tipo;
    }
    
    public void obtenerTipo(){
    
        System.out.println("el tipo es "+this.tipo.getClass().getSimpleName());
    
    }
    public void prinTipo()
    {
    
    System.out.println("El valor del tipo: "+this.tipo.toString());
    }
}
