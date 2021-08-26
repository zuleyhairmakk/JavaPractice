/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author züleyha
 */
public class Kedi extends Hayvan {
    public Kedi(String isim){
    super(isim);
    }

    @Override
    public void konus() {
        System.out.println(this.getIsim()+"miyavliyor");
    }
    
    
}
