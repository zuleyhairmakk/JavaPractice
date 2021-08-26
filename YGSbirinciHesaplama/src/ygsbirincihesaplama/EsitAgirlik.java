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
public class EsitAgirlik extends Aday{

    public EsitAgirlik(int turkce, int matematik, int fizik, int edebiyat) {
        super(turkce, matematik, fizik, edebiyat);
    }

    @Override
    int puanHesaplama() {
           return getTurkce()*5+
                   getMatematik()*5+
                   getFizik()*1+
                   getEdebiyat()*4;
    }
    
}
