/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayininrakamlaritoplami;

import java.util.Scanner;

/**
 *
 * @author züleyha
 */
public class SayininRakamlariToplami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan =new Scanner (System.in);
        System.out.println("enter a number ");
      int  number =scan.nextInt();
         
        
       int toplam = 0;
     

        do {
          
            toplam =toplam + number%10;
            number = number/10;
            
          //sayumizi guncelledik
       
           
            
        }while(number>0);
            System.out.println(toplam); 
    }
    
}
