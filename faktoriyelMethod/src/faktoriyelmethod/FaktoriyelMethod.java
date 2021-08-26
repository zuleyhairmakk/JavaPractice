/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktoriyelmethod;

import java.util.Scanner;

/**
 *
 * @author züleyha
 */
public class FaktoriyelMethod {

    /**
     * @param args the command line arguments
     * 
     */
   public static void faktoriyel(){
       Scanner scan = new Scanner (System.in);
       System.out.println("please enter a  number ");
       int number = scan.nextInt();
       
       int faktoriyel = 1;
       
      while (number >0){
          faktoriyel= faktoriyel*number;
          
          number --;
          
       }
       System.out.println(faktoriyel);
   }
    
    public static void main(String[] args) {
        // TODO code application logic here
      faktoriyel();
    }
     
}
