/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AR
 */
abstract class Employee{
    private String name, id, phone, address;
    private double salary;

    Employee(String name, String id, String phone, String address)
    {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.address = address;
    }
    public Employee()
    {
        
    }
  //  abstract void check_salary();
  //  abstract void reciver_money();
}

  abstract class Casher extends Employee {
  Hospital h;
  double casher_salary;
  public Casher(String name, String id, String phone, String address)
   {
        super(name, id, phone, address);
   } 
  public Casher()
  {
      
  }
  
  abstract public void send_money();
}

interface Itask1{
     void send_money(Registered_donar r, double amount);
     void send_money(Nonreginstered_doner d, double amount);
}

interface Itask2{
    public void receive_money(registered_Receiver r, double amount);
    public void receive_money(Nonregistered_Receiver r, double amount);
}



class junior_Casher extends Employee implements Itask1{

    public junior_Casher(String name, String id, String phone, String address) {
        super(name, id, phone, address);
    }

    junior_Casher() {
      
        super();//To change body of generated methods, choose Tools | Templates.
    }

    void check_salary() {
        System.out.println("Your salary is 30000 tk");
        //To change body of generated methods, choose Tools | Templates.
    }  
    
    public void send_money(Nonreginstered_doner d, double amount)
  {
      double b = d.get_balance();
      b += amount;
      d.set_money(b);
  }
   
   public void send_money(Registered_donar d, double amount)
  {
      double b = d.get_balance();
      b += amount;
      d.set_money(b);
  }

}

class senior_Casher extends Employee implements Itask2{

    public senior_Casher(String name, String id, String phone, String address) {
        super(name, id, phone, address);
    }

    
    void check_salary() {
        System.out.println("Your salary is 30000 tk");
           }  
    
   
   public void receiver_money(registered_Receiver r, double amount)
   {
       
   }

    
    void reciver_money() {
        //To change body of generated methods, choose Tools | Templates.
    }

   
   public void receive_money(registered_Receiver r, double amount)
    {
        double a = r.get_balance() - amount; 
        r.set_balance(amount);
    }
    public void receive_money(Nonregistered_Receiver n, double amount)
    {
        double a = n.get_balance() - amount; 
        n.set_balance(amount);
    }
   
}
