/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pentagonalnumber;

import java.util.Scanner;

/**
 *
 * @author züleyha
 */
public class PentagonalNumber {
      public static  void pentagonal(int number ){
       
       final int COUNT =10;
       
        for (int n=1; n<=100; n++){
            
         int penta =(n*(3*n-1)/2);
        System.out.print(penta);
        if (n%COUNT==0){
            System.out.println();
        }
        }
       
        
        }
      

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
       pentagonal(100);
    }

   
          
          
        }
        
    

