/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktoriyelwhile;

import java.util.Scanner;

/**
 *
 * @author züleyha
 */
public class FaktoriyelWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan= new Scanner (System.in);
        System.out.println("enter a number ");
        int number =scan.nextInt();
        int faktoriyel=1;
        int i=1;
        while (i <= number ){
            faktoriyel=faktoriyel*i;
             
           
           
              i++;
        }
         System.out.println("faktoriyeliniz ="+faktoriyel);
      
    }
    
}
