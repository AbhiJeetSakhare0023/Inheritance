// Hierarchical Inheritance -------> one super clas & more than two sub classes
public class Bankkk {
    String accHolder=" Abhi Sakhare";
    int accNumber=602275;
    double avalBal=5000;
    public void details()
    {
        System.out.println("Account Holder: "+accHolder+", Account Number: "+accNumber);
    }
}
class Deposittt extends Bankkk{
    double amtD=20000;
    public void deposit()
    {
        avalBal=avalBal+amtD;
        System.out.println("Available Bal after Deposit: "+avalBal);
    }
}
class Withdraw extends Bankkk{
    double amtW=1500;
    public void withdraw()
    {

        if(amtW<avalBal)
        {
            avalBal=avalBal-amtW;
            System.out.println("Available Bal after Deposit: " +avalBal);
        }
        else {
            System.out.println("Insufficient Bal");
        }
    }
}
class Custtt{
    public static void main(String[] args) {
        Deposittt d1 = new Deposittt();
        System.out.println("Deposit Process------");
        d1.details();
        d1.deposit();

        Withdraw w1 = new Withdraw();
        System.out.println("Withdraw Process------");
        w1.details();
        w1.withdraw(); // withdraw from original bal becoz here
                        // we extend super class Bankkk not Deposit

    }
}
