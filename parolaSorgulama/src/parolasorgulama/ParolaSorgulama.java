/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parolasorgulama;

import java.util.Scanner;

/**
 *
 * @author züleyha
 */
public class ParolaSorgulama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan =new Scanner (System.in);
        String kullanici_adi="zuleyha";
        String kullanici_parola="123456";
        int giris_hakki=3;
        
        for (int i =1; i<=3; i++){
        System.out.println("please enter your name  ");
        String name  =scan.nextLine();
         System.out.println("please enter your pasword ");
         String pasword =scan.nextLine();
         
         if (kullanici_adi.equals(name)){
         
                 if (kullanici_parola.equals(pasword)){
                     System.out.println("welcome...........");
                     break;
                 }
                
                 }
          else {
             giris_hakki=giris_hakki-1;
                     System.out.println("your pasword or name is wrong,   please try again " + " giris hakkiniz =  "+ giris_hakki+ "adet kalmistir ");
                     
         }
         if (giris_hakki==0){
             System.out.println("haklariniz bitmistir");
             break;
         
         }
          
                     
         }
         
          }
    
}
