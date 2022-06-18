
import java.util.Scanner;
    
import java.util.Scanner;

  abstract class receiver{
    private String name,id,phone, address;
    double Balance=10000;
    receiver( String name,String phone,String address)
    {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.address = address;
    }
    receiver ()
    {
        
    }
    
   abstract public void order_blood();  
   void pay_money()
   {
       
   }
   
}



interface Ibalanc{
    public double get_balance(); 
    public void set_balance(double amount);
}

class registered_Receiver extends receiver implements Ibalanc{
    double bld_amount =0,pay_amount=0;
    public registered_Receiver(String name,  String phone, String address) {
        super(name, phone, address);
    }
    
   public void order_blood()
   {
       Scanner sc = new Scanner (System.in);
       String blood_group = sc.nextLine();
   }
   public double get_balance()
   {
       return Balance;
   }
   public void set_balance(double amount)
   {
       Balance = amount;
   }
}


class Nonregistered_Receiver  extends receiver implements Ibalanc{
   public Nonregistered_Receiver(String name,  String phone, String address) {
        super(name, phone, address);
    }
     public void order_blood()
   {
      
       
   }
    
     public double get_balance()
   {
       System.out.println("Fardeen");
        return 0;
   }
     
     public void set_balance(double amount)
   {
       Balance = amount;
   }
}


    



