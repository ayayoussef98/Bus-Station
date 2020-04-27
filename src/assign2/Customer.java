/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

/**
 *
 * @author Ayah Soffar
 */
public class Customer {
    private String name;
    protected int noofBooked;
    private int age;
    private String codet;
    private double tprice;
    

    public Customer(String name, int noofBooked, int age,String codet, double tprice) {
        this.name = name;
        this.noofBooked = noofBooked;
        this.age = age;
        this.codet= codet;
        this.tprice= tprice;
    }

    public double getTprice() {
        return tprice;
    }

    public void setTprice(double tprice) {
        this.tprice = tprice;
    }

  public   Customer() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoofBooked() {
        return noofBooked;
    }

    public void setNoofBooked(int noofBooked) {
        this.noofBooked = noofBooked;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCodet() {
        return codet;
    }

    public void setCodet(String codet) {
        this.codet = codet;
    }
    
    
}
