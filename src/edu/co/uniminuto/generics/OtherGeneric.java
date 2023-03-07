/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.co.uniminuto.generics;

/**
 *
 * @author Miguel
 */
public class OtherGeneric<T,S> {
    private T numb;
    private S numb1;

    public OtherGeneric(T numb, S numb1) {
        this.numb = numb;
        this.numb1 = numb1;
    }
    
    public void adition (){
        
        String s = numb.toString();
        String d = numb1.toString();
        
        double suma = Double.parseDouble(s)+Double.parseDouble(d);
        
        System.out.println("reponse  "+suma);
    }
    
}
