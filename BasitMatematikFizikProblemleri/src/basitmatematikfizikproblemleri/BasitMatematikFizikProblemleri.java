/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basitmatematikfizikproblemleri;

import java.util.Scanner;

/**
 *
 * @author züleyha
 */
public class BasitMatematikFizikProblemleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan =new Scanner (System.in);
        System.out.println("matematik ve fizik problerinden hangisini yapmak istiyorsunuz");
        
        String islemler ="1.cikis icin Q ya basiniz \n"+
                         "2.daire alanini hesaplamak icin ikiye basin \n"+
                         "3.ucgen cevresi icin 3 e basin \n"+
                         "4.vectorlerin ic carpimi icin 4 e basin \n";
        
        
        while(true){
            System.out.println(islemler);
            System.out.println("lutfen isleminizi seciniz ");
            
            String islem =scan.nextLine();
            
            
            if (islem.equals("1")){
                System.out.println("cikis yapiliyor ");
                break;
                
            }else if ( islem.equals("2")){
                System.out.println("yaricap giriniz ");
                int yaricap=scan.nextInt();
                
                Problem.Matematik.daireAlan(yaricap);//classlari alt alta yazdigimiz icin problem classinin icindeki matematik sinifinin icindeki daire alanini hesapliyoruz 
                
            }else if (islem.equals("3")){
                System.out.println("birinci kenari giriniz ");
                int kenar1=scan.nextInt();
                
                System.out.println("ikinci kenari giriniz ");
                int kenar2 = scan.nextInt();
                
                System.out.println("ucuncu kenari giriniz ");
                int kenar3=scan.nextInt();
                
                
                
                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
                
            }else if ( islem.equals("4")){
                Vec vec1=new Vec("vector 1");//i j k mizi kullanicidan aldik vekrorlerin isimleri icin objeler olusturduk
                Vec vec2 = new Vec("vector2");
                
                
                Problem.Fizik.icCarpim(vec1, vec2);
            }
        }
    }
    
}
