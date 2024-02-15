/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola;

import java.util.LinkedList;

/**
 *
 * @author kevin.aristizabal
 */
public class Cola <T extends Base >{
    
    private LinkedList<T>elementos;
    
    public Cola(){
        
        elementos = new LinkedList();
        
    }
    
    public void encolar(T elemnto){
        
        elementos.addLast(elemnto);
    
    }
    
    public T desencolar(){
        
        return elementos.removeFirst();
    }
    
    public boolean estaVacia(){
        
        return elementos.isEmpty();
    }
    
}
