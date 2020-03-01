/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosgenerica;

/**
 *
 * @author MoisesDario
 */
public class Principal {
    
    public static void main(String[] args){
        Fruta f= new Fruta("Chincuya" , "verde");
        Verdura v = new Verdura("Chipilin","verde");
        Persona p = new Persona("Moises",12);
        
        Caja<Fruta> cajaFruta = new Caja<>(f); 
        Caja<Verdura> cajaVerdura = new Caja<>(v);
        Caja<Persona> cajaPersona = new Caja<>(p);
        
        cajaFruta.showType();
        cajaVerdura.showType();
        cajaPersona.showType();
        
    }
}
