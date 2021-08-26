/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author züleyha
 */
public class Atm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner (System.in);
        String islemler ="1.isleminiz:bakiye ogrenme\n"
                + "2.isleminiz:para cekne\n"
                +"3. isleminiz:para yatirma \n"
                +"4.isleminiz:cikis yapmak \n";
        System.out.println("islemleriniz:\n"+islemler);
        int bakiye =1000;
        
        while (true ){
            System.out.println("lutfen yapmak istediginiz islemi seciniz ");
            int islem =scan.nextInt();
            if (islem==4){
                System.out.println("programdan cikiliyor ");
                break;
            }
            else if (islem==1){
                System.out.println("bakiyeniz :"+bakiye);
                
            }
            else if (islem==2){
                System.out.println("lutfen cekmek istediginiz tutari  giriniz ");
                int tutar =scan.nextInt();
        
                bakiye =bakiye-tutar;
                    
                System.out.println("cekmek  istediginiz tutar="+tutar+"yeni bakiyeniz="+bakiye);
            }
            
            else if(islem==3){
                System.out.println("yatirmak istediginiz tutari giriniz ");
                int tutar=scan.nextInt();
                bakiye =bakiye+tutar;
                 System.out.println("yatirmak istediginiz tutar="+tutar+"yeni bakiyeniz="+bakiye);
            }
            else {
                System.out.println("lutfen gecerli  bir islem girininiz ");
            }
                    
        }
    }
    
}
