/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class Registration {
    private static int count=1001;
     private int regNo;
     private Person owner;
     private Car car;
     
     
     public Registration(Person owner,Car car){
         this.owner=owner;
         this.car=car;
         this.regNo=count;
         count++;
     }
     public static int getCount(){
         return count;
     }
     
     public String toString(){
         return String.format("%-10d %s %s", regNo,owner.toString(),car.toString());
     }
     
}
     

