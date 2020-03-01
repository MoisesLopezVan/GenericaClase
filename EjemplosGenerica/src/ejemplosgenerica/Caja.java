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
public class Caja<T>{
    private T contenido;
    Caja(T x)
    {
    contenido = x;
    }
    public T getValue()
    {
    return contenido;
    }
    public void changeValue(T y)
    {
    contenido = y;
    }
    public void showType()
    {
    System.out.println("Tipo es: " + contenido.getClass().getName());
    }
}
