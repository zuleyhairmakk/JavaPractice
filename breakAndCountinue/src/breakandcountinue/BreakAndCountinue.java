/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakandcountinue;

/**
 *
 * @author züleyha
 */
public class BreakAndCountinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=1; i<4; i++){
            for (int j=1; j< 4; j++){
                if (i*j>2)
                    break;
                System.out.println(i*j);
                          
            }
          System.out.println(i);
        }
    }
    
}
