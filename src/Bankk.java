// Multi-level ------> chain of inheritance
public class Bankk {
    String accHolder="Abhi Sakhare";
    int accNumber=60227;
    double bal=5000;
    public void details()
    {
        System.out.println("Account Holder: "+accHolder+", accNumber: "+accNumber);
    }
}
class Depositt extends Bankk
{
    double amtD=25000;
    public void deposit()
    {
        bal=bal+amtD;
        System.out.println("Avl Bal after Deposit: "+bal);
    }
}
class Withdraww extends Depositt
{
    double amtW=5000;
    public void withdraw()
    {
        if(amtW<bal)
        {
            bal=bal-amtW;
            System.out.println("Avl Bal After Withdraw : "+bal);
        }
        else {
            System.out.println("Insufficient Bal");
        }
    }
}
class Cust
{
    public static void main(String[] args) {
        Withdraww w1 = new Withdraww();
        w1.details();
        w1.deposit();
        w1.withdraw();
    }
}