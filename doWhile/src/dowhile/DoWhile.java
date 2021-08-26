/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

/**
 *
 * @author züleyha
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1; 
        do {
            int num=1;
            for (int j=1; j<=i; j++){
                System.out.print(num+"g");
                num=num+2;
            }
            System.out.println();
            i++;
            
            }while(i<=5);
        }
    }
    

