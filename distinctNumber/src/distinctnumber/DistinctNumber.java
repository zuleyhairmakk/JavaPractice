/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distinctnumber;


import java.util.Scanner;

/**
 *
 * @author züleyha
 */
public class DistinctNumber {
    public static void arrayi_bastir (int []array){
      for (int j :array) {
            System.out.print(array[j]);     
                    }
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int toplam=0;
    int []a= new int  [10];
      System.out.println("please enter integers between 1-100");
     
        for (int i=0; i<a.length; i++) {
           int  number =scan.nextInt();
        }
     

       arrayi_bastir(a);
        
}
 
}
