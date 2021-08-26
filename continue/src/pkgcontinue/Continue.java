/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgcontinue;

/**
 *
 * @author züleyha
 */
public class Continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int i =0; 
      while (i<5){
          for (int j = i; j>1; j--){
              System.out.print(j);
              System.out.println("****");
              i++;
          }
      }
    }
    
}
