/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class Person {
    private String name;
    private String ic;
    
    public Person(String name,String ic){
        
        this.name=name;
        this.ic=ic;
    }
    public String toString(){
        return String.format("%-15s %-15s", name,ic);
    }
}
