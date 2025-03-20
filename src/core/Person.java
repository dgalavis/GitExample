/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author galav
 */
public class Person {
    private long id;
    private String name;
    private int age;
    
    public Person (long id, String Name, int age){
        this.id = id;
        this.name = name;
        this.age= age;
    }
    
    public String toString (){
        return "Person ("+ "id= "+ id +", name= "+ name +")";
    } 
    
}
