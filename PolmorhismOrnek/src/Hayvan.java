/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author züleyha
 */
public class Hayvan {
    private String isim;
    
    public Hayvan(String isim ){
        this.isim=isim;
    }
    public void setIsim(String isim ){
        this.isim=isim;
    }
    public String getIsim (){
        return isim;
                }
    public void konus(){
        System.out.println("hayvan konusuyor ");
    }
}
