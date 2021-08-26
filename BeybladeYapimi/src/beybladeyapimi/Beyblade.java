package beybladeyapimi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author züleyha
 */
public class Beyblade {
    private String beybledeci;
    private int saldiriGucu;
    private int donusHizi;
    
    public Beyblade (String beybledeci, int saldiriGucu, int donusHizi ){
        this.beybledeci=beybledeci;
        this.saldiriGucu=saldiriGucu;
        this.donusHizi=donusHizi;
    }

    public String getBeybledeci() {
        return beybledeci;
    }

    public void setBeybledeci(String beybledeci) {
        this.beybledeci = beybledeci;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }
    
    
    
    
    public void saldir(){
        System.out.println(getBeybledeci()+""+ this.saldiriGucu +"ve "+this.donusHizi+"ile saldiriyor");
    }
    
    public void kutsalCanavarOrtayaCikar(){
        System.out.println("bu beybladenin kutsal canavari bulunmuyor");
    }
    public void bilgileriGoster(){
        System.out.println("beyblade ismi :"+beybledeci);//ayni class icinde oldugi icin direkt beybladeci olarak kullana bildik
        System.out.println("donus hizi "+ donusHizi);
        System.out.println("saldiriGucu"+ saldiriGucu);
    }
}
