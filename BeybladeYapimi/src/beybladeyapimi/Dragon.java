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
public class Dragon extends Beyblade {
private String kutsalCanavar;
private String gizliYetenek;

    public Dragon(String beybledeci, int saldiriGucu, int donusHizi, String kutsalCanavar) {
        super(beybledeci, saldiriGucu, donusHizi);
        this.kutsalCanavar=kutsalCanavar;
        this.gizliYetenek=gizliYetenek;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("kutsal canavar :"+kutsalCanavar);
        System.out.println("gizli yetenek :"+gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
       System.out.println(getBeybledeci()+"nin kutsal canavari "+kutsalCanavar+"ortaya cikiyor ");
       System.out.println(getBeybledeci()+"nin saldirisi :hayalet kasirgasi");
    }    
}
