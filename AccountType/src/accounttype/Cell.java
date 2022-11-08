/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accounttype;

/**
 *
 * @author LENOVO
 */
public class Cell<E>{
    private E data;
    public void setValue(E celldata){
        data = celldata;
    }
    public E getValue() {
        return data;
    }
}
