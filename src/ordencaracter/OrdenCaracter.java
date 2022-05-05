/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordencaracter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author javi_
 */
public class OrdenCaracter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena= "america";
        ArrayList vocal = new ArrayList<>();
        ArrayList consonate = new ArrayList<>();
        ArrayList ordenado = new ArrayList<>();
        
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            
            if(c == 'a' || c== 'e' || c== 'i' || c== 'o' || c== 'u'){
               if(!vocal.contains(c)){
                   vocal.add(c);
               }
                
            }else{
                if(!consonate.contains(c)){
                    consonate.add(c);
                }
                
            }
        }
        
        Collections.sort(vocal);
        Collections.sort(consonate);
        ordenado.addAll(consonate);
        ordenado.addAll(vocal);
         
        
        System.out.println(ordenado);
    }
    
}
