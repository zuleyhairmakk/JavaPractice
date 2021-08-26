/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beybladeyapimi;

/**
 *
 * @author züleyha
 */
public class Dranza extends  Beyblade{
    private String kutsalCanavar;

    public Dranza(String beybledeci, int saldiriGucu, int donusHizi, String kutsalCanavar) {
        super(beybledeci, saldiriGucu, donusHizi);
        this.kutsalCanavar=kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("kutsal canavar :"+kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
       System.out.println(getBeybledeci()+"nin kutsal canavari "+kutsalCanavar+"ortaya cikiyor ");
       System.out.println(getBeybledeci()+"nin saldirisi :alevkilici");
    }
    
    
    
}
