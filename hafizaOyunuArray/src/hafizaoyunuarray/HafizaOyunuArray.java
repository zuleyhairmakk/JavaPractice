/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafizaoyunuarray;

import java.util.Scanner;

/**
 *
 * @author züleyha
 */
public class HafizaOyunuArray {
   final int  COUNT=4;
public static void print (int[][] a,int satir, int sutun){
   
    for (int i = 0; i<a.length; i++){
        for (int j= 0; j<a.length; j++){
            
            if (i==satir && j==sutun ){
                System.out.println(a[i][j]);
            }
            else{
                System.out.print("*");
            }
           
        }
    }



}

public static void p(int [][]a , int satir1, int sutun1){
      for (int i = 0; i<a.length; i++){
        for (int j= 0; j<a[i].length; j++){
            
            if (i==satir1 && j==sutun1 ){
                System.out.println(a[i][j]);
            }
            else{
                System.out.print("*");
            }
          
        }
    }

    
}

public static void main(String[] args) {
        
        
        
     
        Scanner scan = new Scanner (System.in);
        int [][]a =new int [4][4];
        a[0][0]=5;
        a[0][1]=4;
        a[0][2]=3;
        a[0][3]=2;
        
        a[1][0]=4;
        a[1][1]=3;
        a[1][2]=5;
        a[1][3]=7;
        
        a[2][0]=8;
        a[2][1]=10;
        a[2][2]=2; 
        a[2][3]=11;
        
        a[3][0]=11;
        a[3][1]=10;
        a[3][2]=7;
        a[3][3]=8;
        
        int score = 0;
       // System.out.println(Arrays.toString(a));
        
     while (true){
         
     int satir =scan.nextInt();
     
      int sutun = scan.nextInt();
    
      
      
      
        int satir2 =scan.nextInt();
       
         int sutun2 = scan.nextInt();
           print(a,satir, sutun);
        // p(a,satir2,sutun2);
        
      if(a[satir][sutun]==a[satir2][satir2]){
          
          
            score =score +10;
              System.out.println("dogru bildiniz \n"+"your score is "+score);
            
        }
      else {
          System.out.println("yanlis bildiniz ");
         
      }
      System.out.println("if you want to countinue the play please press the 1");
   
     int  answer =scan.nextInt();
     if (answer==1){
         System.out.println("please countinue ");
         
     }
     else {
         System.out.println("the game is over");
         System.out.println("your score is = "  + score);
         break;
     }
         
     }
        
          
          
    }
    
}
