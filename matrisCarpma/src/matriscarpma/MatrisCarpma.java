/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriscarpma;

import java.util.Scanner;

/**
 *
 * @author züleyha
 */
public class MatrisCarpma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //kullanicidan satir sutun degerlerini aldim
        
        Scanner scan=new Scanner (System.in);
        System.out.println("ilk matrisinizi kac satir ve  sutun  istiyorsunuz");
              int satir1=scan.nextInt();
              int sutun1=scan.nextInt();
       
       int a[][]=new int[satir1][sutun1];
      
       
       System.out.println("birinci matris icin degerlerinizi giriniz ");
          for(int i=0; i<satir1; i++){
           for (int j=0; j<sutun1; j++){
           a[i][j]=scan.nextInt();
              System.out.print(a[i][j]);
       }
          System.out.println();
       }
       System.out.println("ikinci matrisinizi kac satir ve sutun istiyorsunuz ");
            int satir2=scan.nextInt();
            int sutun2=scan.nextInt();
            
        
            
          int b[][]=new int[satir2][sutun2];
       
       System.out.println("ikinci matrisinizi olusturmak icin satir ve sutun degerlerini giriniz ");
          for (int k=0; k<satir2; k++){
              for (int z=0; z<sutun2; z++){
                  b[k][z]=scan.nextInt();
                  
                  System.out.print(b[k][z]);
             
           }
              System.out.println();
       }
       
       
        
    }
    
}
