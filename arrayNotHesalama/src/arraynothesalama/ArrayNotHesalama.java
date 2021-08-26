/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraynothesalama;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author züleyha
 */
public class ArrayNotHesalama {

    
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scan = new Scanner (System.in);
       System.out.println("Please enter number of student");
       int number=scan.nextInt();
       int []array = new int [number];
     for (int i =0; i<array.length; i++){
        
         array[i]=scan.nextInt();
       
      }
    
     Arrays.sort(array);
     int best=array[number-1];
     int i=0;
     do{
    
           if(array[i]>=best-10){
               System.out.println("Student"+ i + " score is " +array[i] + " and grade is " + " A");
     }
         else  if (array[i]>=best-20){
   System.out.println("Student"+ i + " score is " +array[i] + " and grade is " + " B ");
         
     }
          else if (array[i]>=best-30){
                  System.out.println("Student"+ i + " score is " +array[i] + " and grade is " + " C");
           }
         else   if (array[i]>=best-40){
                  System.out.println("Student"+ i + " score is " +array[i] + " and grade is " + " D");
                 
                          
                          }
           i++;
    }while(i<array.length);
    
}
}
