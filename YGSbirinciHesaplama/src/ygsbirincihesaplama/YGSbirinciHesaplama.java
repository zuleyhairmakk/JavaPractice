/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ygsbirincihesaplama;

/**
 *
 * @author züleyha
 */
public class YGSbirinciHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Sayisal sayisal1= new Sayisal(30,40,20,30);
         Sayisal sayisal2 = new Sayisal(25,45,2,35);
         
         
         
                    Sayisal birinci =birinci(sayisal1, sayisal2);
                    System.out.println("sayisal birincisi."+birinci.puanHesaplama());
                    
                    
     EsitAgirlik esitAgirlik1= new EsitAgirlik(20,30,40,2);
     EsitAgirlik esitAgirlik2= new EsitAgirlik(40,10,50,0);
     
                   EsitAgirlik birinci2 =birinci(esitAgirlik1, esitAgirlik2);
                   System.out.println("Esir agirlik birincisi."+birinci.puanHesaplama());
                   
                   
     Sozel sozel1=new Sozel(20,30,2,15);
     Sozel sozel2=new Sozel(20,30,2,10);
                
                     Sozel birinci1=birinci(sozel1,sozel2);
                     System.out.println("sozel birinciisi "+ birinci.puanHesaplama());
                    
    }

  
    public static <E extends Aday > E birinci (E e1, E e2){
        if (e1.puanHesaplama()>e2.puanHesaplama()){
            return e1;
        }else {
            return e2;
        }
    }
    
}
