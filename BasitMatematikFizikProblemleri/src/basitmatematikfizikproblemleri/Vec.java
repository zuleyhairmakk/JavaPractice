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
public class Vec {
    private String isim;
    private int i;
    private int j;
    private int k;
    
    public Vec(String isim){
        this.isim=isim;
        
        Scanner scan = new Scanner (System.in);
            System.out.println("i yi giriniz ");
            this. i = scan.nextInt();
            
              System.out.println("j yi giriniz ");
            this. j = scan.nextInt();
            
            
              System.out.println("k yi giriniz ");
            this. k = scan.nextInt();
            
            
        }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    }
    

