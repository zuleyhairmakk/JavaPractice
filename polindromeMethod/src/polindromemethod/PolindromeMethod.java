/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polindromemethod;

import java.util.Scanner;

/**
 *
 * @author züleyha
 */
public class PolindromeMethod {
    public static int  reserve(int a ){
      int temp= a;
    int reserve= 0;
       while (a>0){
            reserve=temp%10;
            temp= temp/10;
          
   
       }
       return reserve;
    }
    
  // public static boolean isPolindrome(int number ){
            
              
   // }
   
 
    
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        System.out.println("enter a number ");
        int number = scan.nextInt();
        if ( number == reserve(number)){
            System.out.println("it is polindrome name ");
        }
  
         
     
    }
    
}
