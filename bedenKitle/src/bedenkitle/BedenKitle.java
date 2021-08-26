/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bedenkitle;

import java.util.Scanner;

/**
 *
 * @author züleyha
 */
public class BedenKitle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("enter  your kg ");
       Scanner scan = new Scanner (System.in);
       double  kg =scan.nextDouble();
        System.out.println("enter  your h ");
            double h =scan.nextDouble();
            double bki= (kg/(h*h));
            
            if (bki<16.5){
                System.out.println("zayif");
            }
            
            else if (bki>= 16.5 || bki<25){
            
                System.out.println("normal");
         }
            else  {
                     System.out.println("fazla kilolu"); 
    }
    
}
}
