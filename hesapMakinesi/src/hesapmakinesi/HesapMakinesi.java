/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesapmakinesi;
import java.util.Scanner;
/**
 *
 * @author züleyha
 */
public class HesapMakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("lutfen yapmak istediginiz islemi giriniz ");
        String str=input.nextLine();
        
        for (int i=0; i<str.length()-1; i++){
           int a= str.charAt(i);
           
         System.out.println(a);
    }
       
    }
    
}
