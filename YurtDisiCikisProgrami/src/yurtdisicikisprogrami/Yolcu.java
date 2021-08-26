/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yurtdisicikisprogrami;

import java.util.Scanner;

/**
 *
 * @author züleyha
 */
public class Yolcu implements YurtDisiKurallari {
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(int harc, boolean siyasiYasak, boolean vizeDurumu) {
          Scanner scan = new Scanner (System.in);
   System.out.println( "lutfen harcinizi giriniz");
   this.harc=scan.nextInt();
   System.out.println( "herhangi bir siyasi yasaginiz var  i evet/hayir ");
String cevap =scan.nextLine();
if (cevap.equals("evet")){
    this.siyasiYasak=true;
}else{
    this.siyasiYasak=false;
}
   System.out.println( "vizeniz bulunuyor mu  ");
   String cevap2=scan.nextLine();
   if (cevap2.equals("evet")){
       this.vizeDurumu=true;
       
   }else{
       this.siyasiYasak=false;
   }
   
    }
 
    

    @Override
    public boolean yurtdisiHarciKontrol() {
        if ( this.harc<15){
            System.out.println( "lutfen yurt disi harcini tam yatirin ");
            return false ;
        }else {
            System.out.println( "islem tamam ");
            return true;
        }
       
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak== true){
            System.out.println("yurt disina cikamazsiniz ");
            return false;
        }else {
            return true;
        }
    }

    @Override
    public boolean vizeDurumu() {
      if(this.vizeDurumu== true){
          System.out.println( "vize islemleri tamam");
          return true;
      }else {
          return false;
      }
    }
    
}
