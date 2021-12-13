class RBI
{
    double minimum_interestrate()
    {
        return 4;
    }
    int minimum_balanceallowed()
    {
        return 500;
    }
    int maximum_withdrawal()
    {
        return 50000;
    }
}
class Customer
{
    void Details()
    {
        System.out.println("Customer Details....");
    }
}
class Account
{
    void Ac_details()
    {
        System.out.println("Customer Account Details....");
    }
}
class SBI extends RBI
{
    int minimum_balanceallowed()
    {
        return 1000;
    }
}
class ICICI extends RBI
{
    double minimum_interestrate()
    {
        return 5.5;
    }
    int maximum_withdrawal()
    {
        return 80000;
    }
}
class PNB extends RBI
{
    double minimum_interestrate()
    {
        return 5.2;
    }
    int minimum_balanceallowed()
    {
        return 1500;
    }
}
public class Bank
{
    public static void main(String[] args)
    {
        RBI RBI = new RBI();
        SBI SBI = new SBI();
        ICICI ICICI = new ICICI();
        PNB PNB = new PNB();
        Customer Customer = new Customer();
        Account Account = new Account();
        Customer.Details();
        Account.Ac_details();
        System.out.println("minimum interest rate for ICICI : "+ICICI.minimum_interestrate()+"%");
        System.out.println("minimum interest rate for SBI : "+SBI.minimum_interestrate()+"%");
        System.out.println("minimum balance allowed for SBI : "+SBI.minimum_balanceallowed());
        System.out.println("maximum withdrawal for PNB : "+PNB.maximum_withdrawal());
    }
}