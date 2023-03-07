/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationgenerico;

import edu.co.uniminuto.generics.Generic;
import edu.co.uniminuto.generics.OtherGeneric;

/**
 *
 * @author Miguel
 */
public class JavaApplicationGenerico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // esto pdria ser ideal para cuando no se que tipo de dato voy a utilizar 
        // ya que el opera con los que yo declaree
        
        
        Generic<String> generic= new Generic("esto es una cadena");
        generic.obtenerTipo();
        generic.prinTipo();
        Generic<Integer> genericInteger = new Generic(33);
        genericInteger.obtenerTipo();
        genericInteger.prinTipo();
        
        
        OtherGeneric<Double,Double> gene = new OtherGeneric(3.3,56.667);
        gene.adition();
        
    }
    
}
