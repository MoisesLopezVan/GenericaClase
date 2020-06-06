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
        
        /*Lista<String> lista = new Lista<>();
        
        System.out.println("sList - print linkedlist: " + lista);
        System.out.println("sList.size() - print linkedlist size: " + lista.size());
        
        lista.add("Lista1");
        lista.add("Lista2");
        lista.add("Lista3");
        lista.add("Lista4");
        lista.add("Lista5");
        lista.add("Lista6");
        lista.add("Lista7");
        lista.add("Lista8");
        lista.add("Lista9");
        lista.add("Lista10");
       
        //System.out.println("Datos: "+lista.get(1));
        System.out.println("sList.size() - print linkedlist size: " + lista.size());
        System.out.println("sList.get(3) - get 3rd element: " + lista.get(3));
        System.out.println("sList.remove(2) - remove 2nd element: " + lista.remove(2));
        System.out.println("sList.get(3) - get 3rd element: " + lista.get(3));
        System.out.println("sList.size() - print linkedlist size: " + lista.size());
        System.out.println("sList - print linkedlist: " + lista);*/
    }
}
