/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andorxorbitwise;

import java.io.PrintStream;

/**
 *
 * @author züleyha
 */
public class AndOrXorBitwise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          //Initial values 
        int a = 34; 
        int b = 73; 
  
        // bitwise and 
        // 0101 & 0111=0101 = 5 
        System.out.println("a&b = " + (a & b)); 
  
        // bitwise or 
        // 0101 | 0111=0111 = 7 
        System.out.println("a|b = " + (a | b)); 
  
        // bitwise xor 
        // 0101 ^ 0111=0010 = 2 
        System.out.println("a^b = " + (a ^ b)); 
  
    }
    
}
