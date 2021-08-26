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
public class Sozel extends Aday {

    public Sozel(int turkce, int matematik, int fizik, int edebiyat) {
        super(turkce, matematik, fizik, edebiyat);
    }

    @Override
    int puanHesaplama() {
      return getTurkce()*5+
              getMatematik()*2+
              getFizik()*1+
              getEdebiyat()*5;
    }
    
}
