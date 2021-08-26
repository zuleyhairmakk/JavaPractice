/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dizimaxmin;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author züleyha
 */
public class DiziMaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        System.out.println("plesase enter arrays value that you want to create ");
        int array=scan.nextInt();
        int []a=new int [array];
        for (int i=0; i<a.length; i++){
            a[i]=(int)(Math.random()*10);
               System.out.print(a[i]+"\t");
        }
        System.out.println();
     
 Arrays.sort(a);

 System.out.println("min is = " + a[0] + " max is = " + a[array-1]);
       
     
    }
    
}
