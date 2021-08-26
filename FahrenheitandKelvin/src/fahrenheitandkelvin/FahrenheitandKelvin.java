/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheitandkelvin;
import java.util.Scanner;

/**
 *
 * @author züleyha
 */
public class FahrenheitandKelvin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       System.out.println("please enter a degree for fahrenheit");
       double celsius= input.nextDouble();
       double fahrenheit =(celsius * 1.8)+32;
       System.out.println("celsius is" + celsius + "fahrenheit" );
       
       
       
     
    }
    
}
