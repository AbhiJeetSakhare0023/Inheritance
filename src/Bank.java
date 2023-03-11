public class Bank {
    String accName = "Abhi Sakhare"; // global-nonstatic
    int accNo = 6022768;// global-nonstatic
    double avalBal = 100;// global-nonstatic

    public void details() // non-static
    {
        System.out.println("Account Holder : " + accName + ", Account Number : " + accNo); // non-static in non-static
    }
}
    // Single Level Inheritance ----> one sub class extends one super class
    class Deposit extends Bank{

        double amt=60000.0d; // global-non-static
        public void depositAmt() // non-static
        {
            avalBal=avalBal+amt; // here we access avalBal from super class Bank
            System.out.println("Total Bal After Depositing : "+avalBal);
        }

    }
    class Customer
    {
        public static void main(String[] args) {
            Deposit d1 = new Deposit(); // subclass object contains data members of super+sub
            d1.details(); // data member of super
            d1.depositAmt(); // data member of sub
        }


    }


