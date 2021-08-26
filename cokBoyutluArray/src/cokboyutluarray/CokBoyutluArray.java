/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cokboyutluarray;

import java.util.Scanner;

/**
 *
 * @author züleyha
 */
public class CokBoyutluArray {

 
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      
      int [][]a=new int [2][2];
    
      for (int i=0; i<2; i++){
          for (int j= 0; j<2; j++){
             a[i][j]=scan.nextInt();
           
          }
      }
         System.out.println("***************************");
          for(int i=0; i<2; i++){
              for (int j=0; j<2; j++ ){ 
              System.out.print(a[i][j]);
          }
          System.out.println();
      }
        
        
        
        
    }
    
}
