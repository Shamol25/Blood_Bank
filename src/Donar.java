
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AR
 */
public class Donar {
    
    private String name,phone,Id, address, blood_group;
    private double balance=5, bld_amount;
    Donar(String name, String Id,String phone, String address,String blood_group)
    
   
    {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.blood_group = blood_group;
    }
    
     Donar(String name,String phone, String address,String blood_group)
    
    {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.blood_group = blood_group;
    }


    public String getName() {
        return name;
    }
    
    double get_balance()
    {
        return balance;
    }
    
    void set_money(double amount)
    {
         balance += amount;   
    }
    
   void check_money(Registered_donar R, double amount)
    {
       junior_Casher J = new junior_Casher(); 
       J.send_money(R, amount);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }
    
    void check_money(Nonreginstered_doner N, double amount) {
       junior_Casher J = new junior_Casher();
       J.send_money(N, amount);
       
    }
}


class Registered_donar extends Donar{

    Registered_donar(String name,String Id, String phone, String address,String blood_group) {
        super(name, phone,Id, address, blood_group);
    }

 
}


class Nonreginstered_doner extends Donar{
    
    Nonreginstered_doner(String name, String phone, String address,String blood_group) {
        super(name, phone, address, blood_group);
    }
    
    void Search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void set_balance(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}

abstract class Receiver{
    private String name,id,phone, address;
    double Balance=10000;
    Receiver( String name,String phone,String address)
    {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.address = address;
    }
    Receiver ()
    {
        
    }
    
    abstract public void order_blood();
  
   
   void pay_money()
   {
       Scanner sc = new Scanner(System.in);
       double amount = sc.nextDouble();
       
   }
}




